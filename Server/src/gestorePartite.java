import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
public class gestorePartite {

    List<partita> ListPartite = new ArrayList<partita>();
    int cont = 0;
    public gestorePartite(){

    }
    public synchronized int crea(Socket socket){
        ListPartite.set(cont, new partita(socket));
        cont++;
        return cont-1;
    }
    public void unisciti(Integer id ,Socket socket){
        if(cont<=id){
            ListPartite.get(id).aggingiti(socket);
            avvia(id);
        }

    }
    public void avvia(Integer id){
        ListPartite.get(id).start();
    }
}
