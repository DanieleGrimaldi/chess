package chess.client.fx;

import chess.client.connection.Conn;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import chess.client.screen.ScreenController;

public class WindowApp extends Application {

    @Override
    public void start(Stage stage)  {
        ScreenController.get().start(stage);
        if(!Conn.get().isConnected()) {
            Platform.exit();
            stage.close();
        }
    }
}
