package Classifica;

import Menu.GraficaMenu;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GraficaClassifica extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GraficaClassifica.class.getResource("score.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("Pac-Man Java Edition -- Classifica");
        stage.setScene(scene);
        stage.show();
    }
}
