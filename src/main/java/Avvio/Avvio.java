package Avvio;

import Classifica.GraficaClassifica;
import Crediti.GraficaCrediti;
import Gioco.PacManGame;
import Menu.GraficaMenu;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Avvio extends Application{

    static GraficaMenu menu;
    static GraficaClassifica classifica;
    static PacManGame gioco;
    static GraficaCrediti crediti;

    public static void main(String[] args) throws Exception {
        launch();
    }

    public static void replayGame() throws Exception {
        gioco.close();
        Avvio gioco2 = new Avvio();
        gioco2.onGiocaClick();
    }

    public static void reloadMenu() {
        gioco.close();
        menu = new GraficaMenu();
        try {
            menu.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        menu = new GraficaMenu();
        classifica = new GraficaClassifica();
        gioco = new PacManGame();
        crediti = new GraficaCrediti();
        menu.start(stage);
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
}
