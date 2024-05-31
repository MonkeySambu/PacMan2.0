package Gioco;

import java.io.Serializable;

public class Punteggio implements Serializable {
    private String punteggio;

    public Punteggio() {
        punteggio = "0";
    }

    public void setScore(String punteggio) {
        this.punteggio = punteggio;
    }

    public void incrementaPunteggio(int incremento) {
        punteggio += incremento;
    }

    public String getScore() {
        return "Score: " + punteggio;
    }
}
