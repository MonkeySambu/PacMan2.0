package Gioco;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    Ghost ghost1;
    Ghost ghost2;
    Ghost ghost3;
    Ghost ghost4;
    static List<Ghost> fantasmi = new ArrayList<>();

    @FXML
    private Pane pane;

    @FXML
    private Rectangle ostacolo1;

    @FXML
    private Rectangle ostacolo2;

    @FXML
    private Rectangle ostacolo3;

    @FXML
    private Rectangle ostacolo4;

    @FXML
    private Rectangle ostacolo5;

    @FXML
    private Rectangle ostacolo6;

    @FXML
    private Rectangle ostacolo7;

    @FXML
    private Rectangle ostacolo8;

    @FXML
    private Rectangle ostacolo9;

    @FXML
    private Rectangle ostacolo10;

    @FXML
    private Rectangle ostacolo11;

    @FXML
    private Rectangle ostacolo12;

    @FXML
    private Rectangle ostacolo13;

    @FXML
    private Rectangle ostacolo14;

    @FXML
    private Rectangle ostacolo15;

    @FXML
    private Rectangle ostacolo16;

    @FXML
    private Rectangle ostacolo17;

    @FXML
    private Rectangle ostacolo18;

    @FXML
    private Rectangle ostacolo19;

    @FXML
    private Rectangle ostacoloOnlyPacMan;

    public static List<Rectangle> ostacoli = new ArrayList<>();
    private Pacman pacman;
    private List<Rectangle> ostacoliGhost = new ArrayList<>(); // Lista delle pareti

    @FXML
    public void initialize() {
        ostacoli.add(ostacolo1);
        ostacoli.add(ostacolo2);
        ostacoli.add(ostacolo3);
        ostacoli.add(ostacolo4);
        ostacoli.add(ostacolo5);
        ostacoli.add(ostacolo6);
        ostacoli.add(ostacolo7);
        ostacoli.add(ostacolo8);
        ostacoli.add(ostacolo9);
        ostacoli.add(ostacolo10);
        ostacoli.add(ostacolo11);
        ostacoli.add(ostacolo12);
        ostacoli.add(ostacolo13);
        ostacoli.add(ostacolo14);
        ostacoli.add(ostacolo15);
        ostacoli.add(ostacolo16);
        ostacoli.add(ostacolo17);
        ostacoli.add(ostacolo18);
        ostacoli.add(ostacolo19);
        ostacoli.add(ostacoloOnlyPacMan);

        ostacoliGhost.addAll(ostacoli);
        ostacoliGhost.remove(ostacoloOnlyPacMan);

        ghost1 = new Ghost(614, 230, 50, 50, javafx.scene.paint.Color.RED, ostacoliGhost);
        ghost2 = new Ghost(616, 320, 50, 50, Color.PINK, ostacoliGhost);
        ghost3 = new Ghost(535, 320, 50, 50, javafx.scene.paint.Color.GREEN, ostacoliGhost);
        ghost4 = new Ghost(686, 320, 50, 50, Color.ORANGE, ostacoliGhost);

        fantasmi.add(ghost1);
        fantasmi.add(ghost2);
        fantasmi.add(ghost3);
        fantasmi.add(ghost4);

        for (Ghost ghost : fantasmi) {
            pane.getChildren().add(ghost);
        }

        pane.setOnKeyPressed(this::handleKeyPress);

        pane.requestFocus();
    }

    public void setPacman(Pacman pacman) {
        this.pacman = pacman;
        pane.getChildren().add(pacman);
    }

    private void handleKeyPress(KeyEvent event) {
        switch (event.getCode()) {
            case UP:
                pacman.moveUp();
                System.out.println("UP");
                Ghost.firstMove = true;
                break;
            case DOWN:
                pacman.moveDown();
                System.out.println("DOWN");
                Ghost.firstMove = true;
                break;
            case LEFT:
                pacman.moveLeft();
                System.out.println("LEFT");
                Ghost.firstMove = true;
                break;
            case RIGHT:
                pacman.moveRight();
                System.out.println("RIGHT");
                Ghost.firstMove = true;
                break;
            default:
                break;
        }
    }
}
