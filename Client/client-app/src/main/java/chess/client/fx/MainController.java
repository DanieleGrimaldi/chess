package chess.client.fx;

import chess.client.screen.ScreenController;
import chess.client.screen.ScreenScene;
import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class MainController {

    @FXML
    private Label account_label;

    @FXML
    protected void srcLabelClicked() {
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/dani04GitHub/chess").toURI());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void joinButtonClicked() {

    }

    @FXML
    protected void newGameButtonClicked() {
        ScreenController.get().changeScene(ScreenScene.PLAY);
    }

}
