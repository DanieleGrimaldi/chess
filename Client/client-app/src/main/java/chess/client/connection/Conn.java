package chess.client.connection;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Conn {

    private final int port = 8080;
    private final String ip = "127.0.0.1";

    private BufferedReader in;
    private PrintWriter out;

    private boolean connected = true;

    public boolean isConnected() {
        return connected;
    }

    private static Conn instance = null;

    public static Conn get() {
        if(instance == null) instance = new Conn();
        return instance;
    }



    private Conn() {
        InetAddress server_address = null;
        try {
            server_address = InetAddress.getByName(ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            connected = false;
        }

        Socket socket = null;
        try {
            socket = new Socket(server_address, port);
        } catch (IOException e) {
            e.printStackTrace();
            connected = false;
        }

        BufferedReader in;
        PrintWriter out;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
        } catch (IOException e) {
            e.printStackTrace();
            connected = false;
        }
    }

    public boolean write(String message) {
        if(!connected) return false;
        out.println(message);
        return true;
    }

    public String read() {
        try {
            return in.readLine();
        } catch (Exception e) {
            return "errore";
        }
    }

    /*public boolean init() {
        InetAddress server_address;
        try {
            server_address = InetAddress.getByName(ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return false;
        }

        Socket socket;
        try {
            socket = new Socket(server_address, port);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        BufferedReader in;
        PrintWriter out;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }




        return true;
    }*/

}
