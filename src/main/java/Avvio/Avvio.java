package Avvio;

import Classifica.GraficaClassifica;
import Crediti.GraficaCrediti;
import Gioco.GameController;
import Gioco.PacManGame;
import Menu.GraficaMenu;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;


public class Avvio extends Application{

    static GraficaMenu menu;
    static GraficaClassifica classifica;
    static PacManGame gioco;
    static GraficaCrediti crediti;

    public static boolean gameOver = false;
    public static boolean win = false;
    public static int c = 0; //importatissimo

    public static void main(String[] args) throws Exception {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        menu = new GraficaMenu();
        classifica = new GraficaClassifica();
        gioco = new PacManGame();
        crediti = new GraficaCrediti();
        menu.start(stage);
        //faccio un thread di javafx! che controlli sempre le variabili
        new AnimationTimer() {

            @Override
            public void handle(long now) {
                if(c==0){
                    if(gameOver || win) {
                        if (gameOver) {
                            GameOverScene();
                            gameOver = false;
                        }
                        if (win) {
                            WinScene();
                            win = false;
                        }
                        c++;
                    }
                }
            }
        }.start();

    }
    public void onGiocaClick() throws Exception {
        System.out.println("Gioca");
        gioco.start(new Stage());
        menu.close();
    }

    public void onClassificaClick() throws Exception {
        System.out.println("Classifica");
        classifica.start(new Stage());
        menu.close();
    }

    public void onCreditiClick() throws Exception {
        System.out.println("Crediti");
        crediti = new GraficaCrediti();
        crediti.start(new Stage());
        menu.close();
    }

    public static void GameOverScene() {
        gioco.close();
            System.out.println("Hai perso!");
            FXMLLoader loader = new FXMLLoader(Avvio.class.getResource("gameover.fxml"));
            try {
                Parent root = loader.load();
                Scene scene = new Scene(root, 610, 390);
                Stage stage = new Stage();
                stage.setTitle("Hai perso!");
                stage.setScene(scene);
                stage.setResizable(false);;
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public static void WinScene(){
        gioco.close();
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
    }

    public void onActionReturn(ActionEvent actionEvent) {
        System.exit(0);
    }
}
