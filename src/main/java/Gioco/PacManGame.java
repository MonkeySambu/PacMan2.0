package Gioco;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PacManGame extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(PacManGame.class.getResource("campo.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 1280, 720);
        //scene.getStylesheets().add(getClass().getResource("/Gioco/style.css").toExternalForm());
        primaryStage.setTitle("Pac-Man");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);

        GameController controller = loader.getController();
        Pacman pacman = new Pacman(602, 400, 70, 70, Color.TRANSPARENT);
        controller.setPacman(pacman);

        // Ottenere il riferimento al nodo radice e aggiungere il rettangolo
        Pane pane = (Pane) root;
        pane.getChildren().add(pacman.getImageView());

        primaryStage.show();

        scene.getRoot().requestFocus();
    }

    public static void main(String[] args) {
        launch();
    }
}