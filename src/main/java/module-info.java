module Avvio{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.almasb.fxgl.core;
    requires jdk.xml.dom;

    exports Avvio to javafx.graphics;
    exports Gioco to javafx.graphics;
    exports Menu to javafx.graphics;
    exports Classifica to javafx.graphics;
    exports Crediti to javafx.graphics;

    opens Avvio to javafx.fxml;
    opens Gioco to javafx.fxml;
    opens Menu to javafx.fxml;
    opens Classifica to javafx.fxml;
    opens Crediti to javafx.fxml;
}