package chess.clientapp.fx;

import chess.clientapp.scene.ScreenController;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class WindowApp extends Application {

    public static Image IMAGE = null;

    public WindowApp() {
        try {
            URL url = new URL("https://img.freepik.com/free-vector/chess_53876-25541.jpg?w=1480&t=st=1673434197~exp=1673434797~hmac=71a5b0bd14abdb0a49b69b0bb018589870693bfe53fba971c8b930615c0efba3");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void start(Stage stage)  {
        ScreenController.get().start(stage);
    }
}
