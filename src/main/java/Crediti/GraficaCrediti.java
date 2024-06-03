package Crediti;

import Menu.GraficaMenu;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GraficaCrediti extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GraficaCrediti.class.getResource("crediti.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 720);
        stage.setTitle("Pac-Man Java Edition -- Crediti");
        stage.setScene(scene);
        stage.show();
    }
}
