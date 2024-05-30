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
        //scene.getStylesheets().add(getClass().getResource("/byCHAT/style.css").toExternalForm());
        primaryStage.setTitle("Pac-Man");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);

        Pacman pacman = new Pacman(100,70,70,70, Color.YELLOW);

        // Ottenere il riferimento al nodo radice e aggiungere il rettangolo
        Pane pane = (Pane) root;
        pane.getChildren().add(pacman);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:
                    case W:
                        pacman.moveUp();
                        break;
                    case DOWN:
                    case S:
                        pacman.moveDown();
                        break;
                    case LEFT:
                    case A:
                        pacman.moveLeft();
                        break;
                    case RIGHT:
                    case D:
                        pacman.moveRight();
                        break;
                }
            }
        });

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}