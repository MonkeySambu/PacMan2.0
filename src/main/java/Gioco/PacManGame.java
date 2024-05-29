package Gioco;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PacManGame extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(PacManGame.class.getResource("campo.fxml"));
        Scene scene = new Scene(loader.load(), 1280, 720);
        //scene.getStylesheets().add(getClass().getResource("/byCHAT/style.css").toExternalForm());
        primaryStage.setTitle("Pac-Man");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}