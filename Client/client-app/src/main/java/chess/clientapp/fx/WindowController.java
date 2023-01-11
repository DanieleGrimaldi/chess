package chess.clientapp.fx;

import chess.clientapp.AuthController;
import chess.clientapp.scene.ScreenController;
import chess.clientapp.scene.ScreenScene;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WindowController {

    @FXML
    private MFXTextField usernameField;

    @FXML
    private MFXPasswordField passwordField;

    @FXML
    private MFXButton loginButton;

    @FXML
    private Label title_label;

    @FXML
    protected void onLoginButtonClick() {
        String username = usernameField.getFloatingText();
        String password = passwordField.getFloatingText();

        if(AuthController.get().attemptLogin(username, password)) {
            ScreenController.get().changeScene(ScreenScene.PLAY);
        }
    }

    @FXML
    protected void onSignupLabelClick() {
        ScreenController.get().changeScene(ScreenScene.SIGNUP);
    }
}
