module prova.pacman {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires com.almasb.fxgl.all;

    opens prova.pacman to javafx.fxml;
    exports prova.pacman;
}