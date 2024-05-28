package byCHAT;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import prova.pacman.HelloApplication;

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
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml")
    }

    public static void main(String[] args) {
        launch();
    }
}

