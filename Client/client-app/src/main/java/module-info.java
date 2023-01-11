module chess.clientapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires MaterialFX;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens chess.clientapp to javafx.fxml, MaterialFX;
    exports chess.clientapp;
    exports chess.clientapp.fx;
    opens chess.clientapp.fx to MaterialFX, javafx.fxml;
    exports chess.clientapp.scene;
    opens chess.clientapp.scene to MaterialFX, javafx.fxml;
}