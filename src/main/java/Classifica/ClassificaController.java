package Classifica;

import Avvio.Avvio;
import Gioco.ListPunteggi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.*;
import java.util.Arrays;

import static Classifica.GraficaClassifica.stage;

public class ClassificaController {

    @FXML private Label lastGame;
    @FXML private Label g1;
    @FXML private Label g2;
    @FXML private Label g3;
    @FXML private Label g4;
    @FXML private Label g5;

    public void ReturnHome(ActionEvent actionEvent) throws Exception {
        System.exit(0);
    }

    public void initialize() throws IOException, ClassNotFoundException {
        //lettura di un file
        File file = new File("Dati.dat");
        //se il file non c'è lo creo
        if (!file.exists()) {
            file.createNewFile();
        }
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ListPunteggi ls = (ListPunteggi) ois.readObject();
            try{
                    String punteggi = ls.getPunteggi();
                    punteggi = punteggi.replace("\n", ";");
                    String[] punteggiArray = punteggi.split(";");
                    System.out.println(Arrays.toString(punteggiArray));
                    try {
                        lastGame.setText("Ultima partita: " + punteggiArray[0]);
                    }catch (Exception e){
                        lastGame.setText("Ultima partita: Non trovato");
                    }
                    try{
                        g1.setText("Game 1: " + punteggiArray[1]);
                    }catch (Exception e){
                        g1.setText("Game 1: Non trovato");
                    }
                    try{
                        g2.setText("Game 2: " + punteggiArray[2]);
                    }catch (Exception e) {
                        g2.setText("Game 2: Non trovato");
                    }
                    try{
                        g3.setText("Game 3: " + punteggiArray[3]);
                    }catch (Exception e){
                        g3.setText("Game 3: Non trovato");
                    }
                    try{
                        g4.setText("Game 4: " + punteggiArray[4]);
                    }catch (Exception e){
                        g4.setText("Game 4: Non trovato");
                    }
                    try{
                        g5.setText("Game 5: " + punteggiArray[5]);
                    }catch (Exception e){
                        g5.setText("Game 5: Non trovato");
                    }
            }catch (Exception e){
                lastGame.setText("Ultima partita: Non trovato");
                g1.setText("Game 1: Non trovato");
                g2.setText("Game 2: Non trovato");
                g3.setText("Game 3: Non trovato");
                g4.setText("Game 4: Non trovato");
                g5.setText("Game 5: Non trovato");
                System.out.println("Errore: " + e);
            }
        }catch(Exception e){
            System.out.println("Errore: " + e);
        }
    }
}
