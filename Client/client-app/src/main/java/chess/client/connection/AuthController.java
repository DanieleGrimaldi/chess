package chess.client.connection;

import chess.client.data.AppData;
import chess.client.screen.ScreenController;
import chess.client.screen.ScreenScene;

public class AuthController {

    private static AuthController instance = null;

    public static AuthController get() {
        if(instance == null) instance = new AuthController();
        return instance;
    }

    private AuthController() {}

    public static String USER = null;

    public boolean attemptLogin(String username, String password) {
        Conn.get().write("login;" + username + ";" + password + ";");
        String answer = Conn.get().read();
        if(answer.equalsIgnoreCase("login corretta;")) {
            AppData.get().account = username;
            return true;
        } else {
            return false;
        }
    }

    public boolean attemptRegistration(String username, String password) {
        Conn.get().write("registrazione;" + username + ";" + password + ";");
        String answer = Conn.get().read();
        if(answer.equalsIgnoreCase("registrazione corretta;")) {
            return true;
        } else {
            return false;
        }
    }

}
