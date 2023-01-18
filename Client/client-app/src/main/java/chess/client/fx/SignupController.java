package chess.client.fx;

import chess.client.ClientApp;
import chess.client.connection.AuthController;
import chess.client.screen.ScreenController;
import chess.client.screen.ScreenScene;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.fxml.FXML;

import java.util.Objects;

public class SignupController {

    @FXML
    private MFXTextField usernameField;

    @FXML
    private MFXTextField password1Field;

    @FXML
    private MFXTextField password2Field;

    @FXML
    protected void onRegisterButtonClick() {
        if(usernameField == null || password1Field == null || password2Field == null) {
            ClientApp.ShowError("Compila tutti i campi!");
            return;
        }

        if(!Objects.equals(password1Field.getText(), password2Field.getText())) {
            ClientApp.ShowError("Le password non corrispondono!");
            return;
        }
        if(AuthController.get().attemptRegistration(usernameField.getText(), password1Field.getText())) {
            ScreenController.get().changeScene(ScreenScene.SIGNIN);
        } else {
            ClientApp.ShowError("Registrazione fallita.");
        }
    }

    @FXML
    protected void onSigninLabelClick() {
        ScreenController.get().changeScene(ScreenScene.SIGNIN);
    }

}
