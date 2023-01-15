module chess.clientapp {
    uses net.querz.chess.ChessIO;
    requires javafx.controls;
    requires javafx.fxml;

    requires MaterialFX;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires org.yaml.snakeyaml;
    requires org.mongodb.bson;
    requires com.google.gson;

    opens chess.clientapp to javafx.fxml, MaterialFX;
    exports chess.clientapp;
    exports chess.clientapp.fx;
    opens chess.clientapp.fx to MaterialFX, javafx.fxml;
    exports chess.clientapp.scene;
    exports net.querz.chess;
    opens chess.clientapp.scene to MaterialFX, javafx.fxml;
}