package Classifica;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class GraficaClassifica extends Application {

    public static Stage stage;

    public static void hide() {
        stage.hide();
    }

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GraficaClassifica.class.getResource("score.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("Pac-Man Java Edition -- Classifica");
        GraficaClassifica.stage = stage;
        stage.setScene(scene);
        stage.setResizable(false);

        stage.show();
    }
}
