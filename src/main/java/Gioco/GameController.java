package Gioco;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    @FXML
    private Pane pane;

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

    @FXML
    public void initialize() {
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
                break;
            case DOWN:
                pacman.moveDown();
                System.out.println("DOWN");
                break;
            case LEFT:
                pacman.moveLeft();
                System.out.println("LEFT");
                break;
            case RIGHT:
                pacman.moveRight();
                System.out.println("RIGHT");
                break;
            default:
                break;
        }
    }
}