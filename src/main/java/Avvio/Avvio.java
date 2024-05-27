package Avvio;

import Classifica.GraficaClassifica;
import Menu.GraficaMenu;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Avvio extends Application{

    static GraficaMenu menu;
    static GraficaClassifica classifica;

    public static void main(String[] args) throws Exception {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        menu = new GraficaMenu();
        classifica = new GraficaClassifica();
        menu.start(stage);
    }
    public void onGiocaClick(){
        System.out.println("Gioca");
    }

    public void onClassificaClick() throws IOException {
        System.out.println("Classifica");
        classifica.start(new Stage());
        menu.close();
    }

    public void onCreditiClick(){
        System.out.println("Crediti");
    }
}
