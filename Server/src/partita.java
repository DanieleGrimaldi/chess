import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class partita extends thread{

    Boolean piena =false;


    PrintWriter out1;
    BufferedReader in1;
    Socket socket1;

    PrintWriter out2;
    BufferedReader in2;
    Socket socket2;

    public partita(){

    }
    public partita(Socket socket1){
        this.socket1 = socket1;
        try{

            in1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out1 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("connessione errata");
            e.printStackTrace();
        }finally{
            
        }
    }

    public void aggingiti(Socket socket2){
        
        this.socket2 = socket2;
        try{

            in2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out2 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("connessione errata");
            e.printStackTrace();
        }finally{
            
        }
        piena = true;
    }

    @Override
    public void run(){
        boolean attiva=true;
        Int turno=1;
        while(!piena){}//aspetta che entrambi entrino

        while(attiva){
            out1.println("partita iniziata;");
            out2.println("partita iniziata;");

            while(turno==1){
                out1.println("tocca a te;");
                
            }
        }
    }

}
