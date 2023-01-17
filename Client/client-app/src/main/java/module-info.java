module chess.client {
    requires javafx.controls;
    requires javafx.fxml;

    requires MaterialFX;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires org.yaml.snakeyaml;
    requires org.mongodb.bson;
    requires com.google.gson;

    exports chess.client;
    exports chess.client.fx;
    opens chess.client.fx to MaterialFX, javafx.fxml;
    exports chess.client.screen;
    opens chess.client.screen to MaterialFX, javafx.fxml;
    exports chess.client.game;
    exports chess.client.connection;
}