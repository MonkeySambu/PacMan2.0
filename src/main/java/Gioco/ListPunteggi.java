package Gioco;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class ListPunteggi implements Serializable {
    private LinkedList<Punteggio> punteggi;

    public ListPunteggi() {
        punteggi = new LinkedList<>();
    }

    public void addPunteggio(Punteggio punteggio) {
        punteggi.add(punteggio);
    }

    public String getPunteggi() {
        String sb = "";
        for (Punteggio p : punteggi) {
            sb += p.getScore() + "\n";
        }
        System.out.println(sb);
        return sb;
    }

    public void setPunteggi(LinkedList<Punteggio> punteggi) {
        this.punteggi = punteggi;
    }

    public void sort() {
        punteggi.sort((p1, p2) -> Integer.parseInt(p2.getScore()) - Integer.parseInt(p1.getScore()));
    }

    public void removeLast() {
        punteggi.remove(punteggi.size() - 1);
    }

    public void removeFirst() {
        punteggi.remove(0);
    }

    public void remove(int index) {
        punteggi.remove(index);
    }

    public void addHead(Punteggio punteggio) {
        punteggi.add(0, punteggio);
    }
}
