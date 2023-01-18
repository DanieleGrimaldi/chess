package chess.client.fx;

import chess.client.screen.ScreenController;
import chess.client.screen.ScreenScene;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class MainController {

    @FXML
    private javafx.scene.control.Label account_label;

    @FXML
    private MFXTextField id_text;



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
