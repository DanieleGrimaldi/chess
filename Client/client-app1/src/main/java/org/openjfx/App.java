package org.openjfx;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        MenuBar menuBar = new MenuBar();

        MenuItem menuItem1 = new MenuItem("Option xxx");
        Menu menu1 = new Menu("Aiuto");
        menu1.getItems().add(menuItem1);
        menuBar.getMenus().add(menu1);
        VBox vBox = new VBox(menuBar);



        /*var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        label.setStyle("-fx-font: normal bold 20px 'serif' ");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        MFXTextField userTextField = new MFXTextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        MFXPasswordField pwBox = new MFXPasswordField();
        grid.add(pwBox, 1, 2);


        MFXButton btn = new MFXButton("Sign in");
        btn.setStyle("-fx-font: normal bold 20px 'serif' ");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        grid.setStyle("-fx-font: normal bold 20px 'serif' ");

         */
        var scene = new Scene(vBox, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}