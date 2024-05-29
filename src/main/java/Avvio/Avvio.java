package Avvio;

import Classifica.GraficaClassifica;
import Gioco.PacManGame;
import Menu.GraficaMenu;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Avvio extends Application{

    static GraficaMenu menu;
    static GraficaClassifica classifica;
    static PacManGame gioco;

    public static void main(String[] args) throws Exception {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        menu = new GraficaMenu();
        classifica = new GraficaClassifica();
        gioco = new PacManGame();
        menu.start(stage);
    }
    public void onGiocaClick() throws Exception {
        System.out.println("Gioca");
        gioco.start(new Stage());
        menu.close();
    }

    public void onClassificaClick() throws IOException {
        System.out.println("Classifica");
        classifica.start(new Stage());
        menu.close();
    }

    public void onCreditiClick(){

    }
}
