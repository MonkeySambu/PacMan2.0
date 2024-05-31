package Gioco;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PacManGame extends Application {

    private static boolean win=false;
    private static boolean gameOver=false;
    static Stage stageTMP;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(PacManGame.class.getResource("campo.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 1280, 720);
        //scene.getStylesheets().add(getClass().getResource("/Gioco/style.css").toExternalForm());
        primaryStage.setTitle("Pac-Man");
        primaryStage.setScene(scene);
        stageTMP = primaryStage;
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

    public static void GameOverScene() {
        if(!gameOver) {
            System.out.println("Hai perso!");
            FXMLLoader loader = new FXMLLoader(PacManGame.class.getResource("gameover.fxml"));
            try {
                Parent root = loader.load();
                Scene scene = new Scene(root, 610, 390);
                Stage stage = new Stage();
                stage.setTitle("Hai perso!");
                stage.setScene(scene);
                stage.setResizable(false);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
            gameOver = true;
            stageTMP.hide();
        }
    }

    public static void WinScene(){
        if(!win) {
            System.out.println("Hai vinto!");
            FXMLLoader loader = new FXMLLoader(PacManGame.class.getResource("win.fxml"));
            try {
                Parent root = loader.load();
                Scene scene = new Scene(root, 1280, 720);
                Stage stage = new Stage();
                stage.setTitle("Hai vinto!");
                stage.setScene(scene);
                stage.setResizable(false);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
            win=true;
            stageTMP.hide();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    public void close() {
        stageTMP.close();
    }

    public void restartGame() {
        stageTMP.close(); // Chiudi la finestra corrente

        // Avvia una nuova istanza dell'applicazione
        Platform.runLater(() -> {
            try {
                start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}