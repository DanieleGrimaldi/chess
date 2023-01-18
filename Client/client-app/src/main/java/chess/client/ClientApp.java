package chess.client;

import chess.client.fx.WindowApp;
import chess.client.game.ChessGame;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class ClientApp
{
    public static void main(String[] args)
    {
        Application.launch(WindowApp.class);
    }

    public static void ShowError(String message) {
        new Alert(Alert.AlertType.ERROR, message, ButtonType.CLOSE).show();
    }
}
