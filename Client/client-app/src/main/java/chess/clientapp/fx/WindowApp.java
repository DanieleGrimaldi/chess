package chess.clientapp.fx;

import chess.clientapp.scene.ScreenController;
import javafx.application.Application;
import javafx.stage.Stage;

public class WindowApp extends Application {

    @Override
    public void start(Stage stage)  {
        ScreenController.get().start(stage);
    }
}
