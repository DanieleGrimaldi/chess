package chess.client.app.clientapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SigninWindow extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(SigninWindow.class.getResource("signin-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 340);
        stage.setTitle("Chess: Log into your account");
        stage.setScene(scene);
        stage.show();
    }
}
