import java.io.*;
import java.net.*;

public class main {
    public static final int PORT = 8080;
    public static void main(String[] args){

        try (ServerSocket s = new ServerSocket(PORT)) {
            System.out.println("Started: " + s);
            gestorePartite gestore = new gestorePartite();
            while(true){
                System.out.println("aspetto connessione");
                Socket socket = s.accept();
                login log = new login(socket,gestore);
                log.start();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
