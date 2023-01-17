package chess.client.fx;

import chess.client.connection.AuthController;
import chess.client.screen.ScreenController;
import chess.client.screen.ScreenScene;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
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
        String username = usernameField.getText();
        String password = passwordField.getText();

        if(AuthController.get().attemptLogin(username, password)) {
            ScreenController.get().changeScene(ScreenScene.MAIN);
        } else {
            new Alert(Alert.AlertType.ERROR, "Le credenziali inserite non sono corrette.", ButtonType.CLOSE).show();

        }
    }

    @FXML
    protected void onSignupLabelClick() {
        ScreenController.get().changeScene(ScreenScene.SIGNUP);
    }
}
