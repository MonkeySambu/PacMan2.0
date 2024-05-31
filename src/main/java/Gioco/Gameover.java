package Gioco;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Gameover {

    @FXML
    private Label Score;

    public void initialize() {
        Score.setText(GameController.punteggio.getScore());
    }

    public void onActionRiprova() throws Exception {
        Avvio.Avvio.replayGame();
    }

    public void onActionReturn(){
        System.out.println("Return");
        Avvio.Avvio.reloadMenu();
    }
}
