import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class utente extends Thread{
    
    PrintWriter out;
    BufferedReader in;
    Socket socket;
    gestorePartite gestore;

    public utente (Socket socket,gestorePartite gestore){
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
        Boolean connesso = true;
        while(connesso){
            String str;
            try {
                str = in.readLine();
            

            if(str.toUpperCase().startsWith("CREA")){
                gestore.crea(socket);
            }
            if(str.toUpperCase().startsWith("UNISCITI")){
                String campi[] = str.split(";");
                gestore.unisciti(Integer.parseInt(campi[1]),socket);
            }
            if(str.toUpperCase().startsWith("DISCONNETTI")){
                connesso = false;
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }//non so se toglie i nulli 

        }
    }
}
