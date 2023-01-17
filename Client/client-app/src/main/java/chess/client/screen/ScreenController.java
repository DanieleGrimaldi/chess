package chess.client.screen;

import chess.client.ClientApp;
import chess.client.game.ChessGame;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ScreenController {

    private Stage stage;

    private Scene signinScene;
    private Scene signupScene;
    private Scene mainScene;

    private static ScreenController instance = null;

    public static ScreenController get() {
        if(instance == null) instance = new ScreenController();
        return instance;
    }

    private ScreenController() {
        FXMLLoader signinWindowLoader = new FXMLLoader(ClientApp.class.getResource("/signin-window.fxml"));
        FXMLLoader signupWindowLoader = new FXMLLoader(ClientApp.class.getResource("/signup-window.fxml"));
        FXMLLoader mainWindowLoader = new FXMLLoader(ClientApp.class.getResource("/main-window.fxml"));

        try {
            this.signinScene = new Scene(signinWindowLoader.load(), 320, 340);
            this.signupScene = new Scene(signupWindowLoader.load(), 320, 370);
            this.mainScene = new Scene(mainWindowLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(Stage stage) {
        this.stage = stage;
        stage.setTitle("Chess");
        changeScene(ScreenScene.SIGNIN);
        stage.show();
    }

    public void changeScene(ScreenScene ss) {
        switch (ss) {
            case SIGNIN -> stage.setScene(signinScene);
            case SIGNUP -> stage.setScene(signupScene);
            case MAIN -> stage.setScene(mainScene);

            case PLAY ->
            ChessGame.get().startChess(stage);
        }
    }


}
