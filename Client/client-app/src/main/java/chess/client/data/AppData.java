package chess.client.data;


public class AppData {

    private static AppData instance = null;

    public static AppData get() {
        if(instance == null) instance = new AppData();
        return instance;
    }

    private String account;

}
