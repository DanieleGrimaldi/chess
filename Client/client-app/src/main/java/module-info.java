module chess.client.app.clientapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires MaterialFX;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens chess.client.app.clientapp to javafx.fxml;
    exports chess.client.app.clientapp;
}