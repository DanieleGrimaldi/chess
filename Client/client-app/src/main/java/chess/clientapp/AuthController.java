package chess.clientapp;

public class AuthController {

    private static AuthController instance = null;

    public static AuthController get() {
        if(instance == null) instance = new AuthController();
        return instance;
    }

    public static String USER = null;

    public boolean attemptLogin(String username, String password) {
        //send to server
        return true;
    }

}
