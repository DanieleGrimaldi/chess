import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class login extends Thread{
    List<String> utentiAttivi;
    PrintWriter out;
    BufferedReader in;
    Socket socket;
    gestorePartite gestore;

    public login (Socket socket,gestorePartite gestore){
        this.socket = socket;
        this.gestore = gestore;
        try{

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("connessione errata");
            e.printStackTrace();
        }finally{
            
        }
    }

    @Override
    public void run(){
        Boolean loggato = false;
        
        while(!loggato){

            String str = in.readLine();//non so se toglie i nulli 

            if(str.toUpperCase().startsWith("LOGIN")){//login;nomeUtente;psw;
                String campi[] = str.split(";");

                //Apro il file degli utenti per verificare le credenziali
                File myObj = new File("utenti.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                  String data = myReader.nextLine();
                  if(data.equals(campi[1]+";"+campi[2]))//l'utente esiste
                  {
                    if(!utentiAttivi.contains(campi[1])){//l'utente non ha già una sessione attiva
                        loggato=true;
                        utentiAttivi.add(campi[1]);
                        out.println("login corretta;");
                    }
                  }
                }
                myReader.close();
            }  

            if(str.toUpperCase().startsWith("REGISTRAZIONE")){//registrazione;nomeUtente;psw;
                String campi[] = str.split(";");
                Boolean trovato=false;

                //Apro il file degli utenti per verificare le credenziali
                File myObj = new File("utenti.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine() && trovato == false) {
                  String nome = myReader.nextLine().split(";")[0];
                  if(campi[1]=nome){
                    trovato = true;
                  }
                }
                myReader.close();
                if(!trovato){//se l'utente non è doppio lo creo 
                    FileWriter file = new FileWriter("utenti.txt",true);
                    file.write(campi[1]+";"+campi[2]);
                    //Close the output stream
                    file.close();
                    out.println("registrazione corretta;");
                }
            }

        }
        //sono finalmente loggato
        utente temp = new utente(socket, gestore);
        temp.start();

    }

}
