module Avvio{
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires com.almasb.fxgl.all;

    opens Avvio to javafx.fxml;
    exports Avvio;
    exports Menu;
    exports Classifica;
}