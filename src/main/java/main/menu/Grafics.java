package main.menu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class Grafics extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Grafics.class.getResource("menu.fxml"));
        Font font = Font.loadFont(getClass().getResourceAsStream("PAC-FONT.TTF"), 10);
        if (font != null) {
            System.out.println("Font loaded successfully: " + font.getName());
        } else {
            System.out.println("Font loading failed.");
        }
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("PAC-MAN : Java Edition");
        stage.setScene(scene);
        stage.show();
    }
}