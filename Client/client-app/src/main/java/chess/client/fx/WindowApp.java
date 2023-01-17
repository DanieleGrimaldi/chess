package chess.client.fx;

import javafx.application.Application;
import javafx.stage.Stage;
import chess.client.screen.ScreenController;

public class WindowApp extends Application {

    @Override
    public void start(Stage stage)  {
        ScreenController.get().start(stage);
    }
}
