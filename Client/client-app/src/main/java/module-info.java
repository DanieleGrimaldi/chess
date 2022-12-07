module chessclient {
    requires javafx.controls;
    requires javafx.graphics;
    requires MaterialFX;
    requires javafx.fxml;

    exports chessclient;
    opens chessclient to javafx.graphics, javafx.fxml;

}
