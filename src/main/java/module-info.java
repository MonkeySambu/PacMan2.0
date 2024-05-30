module Avvio{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.almasb.fxgl.core;

    exports Avvio to javafx.graphics;

    exports Gioco to javafx.graphics;
    exports Menu to javafx.fxml;
    exports Classifica to javafx.fxml;
    exports Crediti to javafx.fxml;

    opens Avvio to javafx.fxml;
    opens Gioco to javafx.fxml;
    opens Menu to javafx.fxml;
    opens Classifica to javafx.fxml;
    opens Crediti to javafx.fxml;
}
