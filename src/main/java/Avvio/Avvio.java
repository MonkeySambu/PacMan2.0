package Avvio;

import Classifica.GraficaClassifica;
import Crediti.GraficaCrediti;
import Gioco.GameController;
import Gioco.ListPunteggi;
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

import java.io.*;

import static Gioco.GameController.punteggio;


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
        ListPunteggi ls = new ListPunteggi();
        //se il file esiste lo leggo
        File file = new File("Dati.dat");
        if (file.exists()&&file.length()!=0) {
            try {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream objStr = new ObjectInputStream(fileIn);
                ls = (ListPunteggi) objStr.readObject();
                objStr.close();
                fileIn.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        ls.addHead(punteggio);
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objStr = new ObjectOutputStream(fileOut);
            objStr.writeObject(ls);
            objStr.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            //se non trovo il file lo creo
            try {
                file.createNewFile();
                FileOutputStream fileOut = new FileOutputStream(file);
                ObjectOutputStream objStr = new ObjectOutputStream(fileOut);
                objStr.writeObject(ls);
                objStr.close();
                fileOut.close();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void WinScene(){
        gioco.close();
            System.out.println("Hai vinto!");
            FXMLLoader loader = new FXMLLoader(Avvio.class.getResource("win.fxml"));
            try {
                Parent root = loader.load();
                Scene scene = new Scene(root, 610, 390);
                Stage stage = new Stage();
                stage.setTitle("Hai vinto!");
                stage.setScene(scene);
                stage.setResizable(false);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        ListPunteggi ls = new ListPunteggi();
        //se il file esiste lo leggo
        File file = new File("Dati.dat");
        if (file.exists()&&file.length()!=0) {
            try {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream objStr = new ObjectInputStream(fileIn);
                ls = (ListPunteggi) objStr.readObject();
                objStr.close();
                fileIn.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        ls.addHead(punteggio);
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objStr = new ObjectOutputStream(fileOut);
            objStr.writeObject(ls);
            objStr.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            //se non trovo il file lo creo
            try {
                file.createNewFile();
                FileOutputStream fileOut = new FileOutputStream(file);
                ObjectOutputStream objStr = new ObjectOutputStream(fileOut);
                objStr.writeObject(ls);
                objStr.close();
                fileOut.close();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onActionReturn(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void onActionCloseWin(ActionEvent actionEvent) {
        System.exit(0);
    }
}
