package Gioco;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.List;

public class GameController {

    Ghost ghost1;
    Ghost ghost2;
    Ghost ghost3;
    Ghost ghost4;
    static List<Ghost> fantasmi = new ArrayList<>();

    @FXML
    private Label score;

    @FXML
    private AnchorPane pane;

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

    @FXML  private Circle punto1;
    @FXML  private Circle punto2;
    @FXML  private Circle punto3;
    @FXML  private Circle punto4;
    @FXML  private Circle punto5;
    @FXML  private Circle punto6;
    @FXML  private Circle punto7;
    @FXML  private Circle punto8;
    @FXML  private Circle punto9;
    @FXML  private Circle punto10;
    @FXML  private Circle punto11;
    @FXML  private Circle punto12;
    @FXML  private Circle punto13;
    @FXML  private Circle punto14;
    @FXML  private Circle punto15;
    @FXML  private Circle punto16;
    @FXML  private Circle punto17;
    @FXML  private Circle punto18;
    @FXML  private Circle punto19;
    @FXML  private Circle punto20;
    @FXML  private Circle punto21;
    @FXML  private Circle punto22;
    @FXML  private Circle punto23;
    @FXML  private Circle punto24;
    @FXML  private Circle punto25;
    @FXML  private Circle punto26;
    @FXML  private Circle punto27;
    @FXML  private Circle punto28;
    @FXML  private Circle punto29;
    @FXML  private Circle punto30;
    @FXML  private Circle punto31;
    @FXML  private Circle punto32;
    @FXML  private Circle punto33;
    @FXML  private Circle punto34;
    @FXML  private Circle punto35;
    @FXML  private Circle punto36;
    @FXML  private Circle punto37;
    @FXML  private Circle punto38;
    @FXML  private Circle punto39;
    @FXML  private Circle punto40;
    @FXML  private Circle punto41;
    @FXML  private Circle punto42;
    @FXML  private Circle punto43;
    @FXML  private Circle punto44;
    @FXML  private Circle punto45;
    @FXML  private Circle punto46;
    @FXML  private Circle punto47;
    @FXML  private Circle punto48;
    @FXML  private Circle punto49;
    @FXML  private Circle punto50;
    @FXML  private Circle punto51;
    @FXML  private Circle punto52;
    @FXML  private Circle punto53;
    @FXML  private Circle punto54;
    @FXML  private Circle punto55;
    @FXML  private Circle punto56;
    @FXML  private Circle punto57;
    @FXML  private Circle punto58;
    @FXML  private Circle punto59;
    @FXML  private Circle punto60;
    @FXML  private Circle punto61;
    @FXML  private Circle punto62;
    @FXML  private Circle punto63;
    @FXML  private Circle punto64;
    @FXML  private Circle punto65;
    @FXML  private Circle punto66;
    @FXML  private Circle punto67;
    @FXML  private Circle punto68;
    @FXML  private Circle punto69;
    @FXML  private Circle punto70;
    @FXML  private Circle punto71;
    @FXML  private Circle punto72;
    @FXML  private Circle punto73;
    @FXML  private Circle punto74;
    @FXML  private Circle punto75;
    @FXML  private Circle punto76;
    @FXML  private Circle punto77;
    @FXML  private Circle punto78;
    @FXML  private Circle punto79;
    @FXML  private Circle punto80;
    @FXML  private Circle punto81;
    @FXML  private Circle punto82;
    @FXML  private Circle punto83;
    @FXML  private Circle punto84;
    @FXML  private Circle punto85;
    @FXML  private Circle punto86;
    @FXML  private Circle punto87;
    @FXML  private Circle punto88;
    @FXML  private Circle punto89;
    @FXML  private Circle punto90;
    @FXML  private Circle punto91;
    @FXML  private Circle punto92;
    @FXML  private Circle punto93;
    @FXML  private Circle punto94;
    @FXML  private Circle punto95;
    @FXML  private Circle punto96;
    @FXML  private Circle punto97;
    @FXML  private Circle punto98;
    @FXML  private Circle punto99;
    @FXML  private Circle punto100;
    @FXML  private Circle punto101;
    @FXML  private Circle punto102;
    @FXML  private Circle punto103;
    @FXML  private Circle punto104;
    @FXML  private Circle punto105;
    @FXML  private Circle punto106;
    @FXML  private Circle punto107;
    @FXML  private Circle punto108;
    @FXML  private Circle punto109;
    @FXML  private Circle punto110;
    @FXML  private Circle punto111;
    @FXML  private Circle punto112;
    @FXML  private Circle punto113;
    @FXML  private Circle punto114;
    @FXML  private Circle punto115;
    @FXML  private Circle punto116;
    @FXML  private Circle punto117;
    @FXML  private Circle punto118;
    @FXML  private Circle punto119;
    @FXML  private Circle punto120;
    @FXML  private Circle punto121;
    @FXML  private Circle punto123;
    @FXML  private Circle punto124;
    @FXML  private Circle punto125;
    @FXML  private Circle punto126;
    @FXML  private Circle punto127;
    @FXML  private Circle punto128;
    @FXML  private Circle punto129;
    @FXML  private Circle punto130;
    @FXML  private Circle punto131;
    @FXML  private Circle punto132;
    @FXML  private Circle punto133;
    @FXML  private Circle punto134;
    @FXML  private Circle punto135;
    @FXML  private Circle punto136;
    @FXML  private Circle punto137;
    @FXML  private Circle punto138;
    @FXML  private Circle punto139;
    @FXML  private Circle punto140;
    @FXML  private Circle punto141;

    private Font customFont;

    public static List<Rectangle> ostacoli = new ArrayList<>();
    public static Pacman pacman;
    private List<Rectangle> ostacoliGhost = new ArrayList<>();
    public static List<Circle> monete = new ArrayList<>();

    public Punteggio punteggio = new Punteggio();

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

        monete.add(punto1);
        monete.add(punto2);
        monete.add(punto3);
        monete.add(punto4);
        monete.add(punto5);
        monete.add(punto6);
        monete.add(punto7);
        monete.add(punto8);
        monete.add(punto9);
        monete.add(punto10);
        monete.add(punto11);
        monete.add(punto12);
        monete.add(punto13);
        monete.add(punto14);
        monete.add(punto15);
        monete.add(punto16);
        monete.add(punto17);
        monete.add(punto18);
        monete.add(punto19);
        monete.add(punto20);
        monete.add(punto21);
        monete.add(punto22);
        monete.add(punto23);
        monete.add(punto24);
        monete.add(punto25);
        monete.add(punto26);
        monete.add(punto27);
        monete.add(punto28);
        monete.add(punto29);
        monete.add(punto30);
        monete.add(punto31);
        monete.add(punto32);
        monete.add(punto33);
        monete.add(punto34);
        monete.add(punto35);
        monete.add(punto36);
        monete.add(punto37);
        monete.add(punto38);
        monete.add(punto39);
        monete.add(punto40);
        monete.add(punto41);
        monete.add(punto42);
        monete.add(punto43);
        monete.add(punto44);
        monete.add(punto45);
        monete.add(punto46);
        monete.add(punto47);
        monete.add(punto48);
        monete.add(punto49);
        monete.add(punto50);
        monete.add(punto51);
        monete.add(punto52);
        monete.add(punto53);
        monete.add(punto54);
        monete.add(punto55);
        monete.add(punto56);
        monete.add(punto57);
        monete.add(punto58);
        monete.add(punto59);
        monete.add(punto60);
        monete.add(punto61);
        monete.add(punto62);
        monete.add(punto63);
        monete.add(punto64);
        monete.add(punto65);
        monete.add(punto66);
        monete.add(punto67);
        monete.add(punto68);
        monete.add(punto69);
        monete.add(punto70);
        monete.add(punto71);
        monete.add(punto72);
        monete.add(punto73);
        monete.add(punto74);
        monete.add(punto75);
        monete.add(punto76);
        monete.add(punto77);
        monete.add(punto78);
        monete.add(punto79);
        monete.add(punto80);
        monete.add(punto81);
        monete.add(punto82);
        monete.add(punto83);
        monete.add(punto84);
        monete.add(punto85);
        monete.add(punto86);
        monete.add(punto87);
        monete.add(punto88);
        monete.add(punto89);
        monete.add(punto90);
        monete.add(punto91);
        monete.add(punto92);
        monete.add(punto93);
        monete.add(punto94);
        monete.add(punto95);
        monete.add(punto96);
        monete.add(punto97);
        monete.add(punto98);
        monete.add(punto99);
        monete.add(punto100);
        monete.add(punto101);
        monete.add(punto102);
        monete.add(punto103);
        monete.add(punto104);
        monete.add(punto105);
        monete.add(punto106);
        monete.add(punto107);
        monete.add(punto108);
        monete.add(punto109);
        monete.add(punto110);
        monete.add(punto111);
        monete.add(punto112);
        monete.add(punto113);
        monete.add(punto114);
        monete.add(punto115);
        monete.add(punto116);
        monete.add(punto117);
        monete.add(punto118);
        monete.add(punto119);
        monete.add(punto120);
        monete.add(punto121);
        monete.add(punto123);
        monete.add(punto124);
        monete.add(punto125);
        monete.add(punto126);
        monete.add(punto127);
        monete.add(punto128);
        monete.add(punto129);
        monete.add(punto130);
        monete.add(punto131);
        monete.add(punto132);
        monete.add(punto133);
        monete.add(punto134);
        monete.add(punto135);
        monete.add(punto136);
        monete.add(punto137);
        monete.add(punto138);
        monete.add(punto139);
        monete.add(punto140);
        monete.add(punto141);

        ghost1 = new Ghost(614, 230, 50, 50, Color.TRANSPARENT, ostacoliGhost,"red.png");
        ghost2 = new Ghost(616, 320, 50, 50, Color.TRANSPARENT, ostacoliGhost,"pink.png");
        ghost3 = new Ghost(535, 320, 50, 50, Color.TRANSPARENT, ostacoliGhost,"lime.png");
        ghost4 = new Ghost(686, 320, 50, 50, Color.TRANSPARENT, ostacoliGhost,"orange.png");

        fantasmi.add(ghost1);
        fantasmi.add(ghost2);
        fantasmi.add(ghost3);
        fantasmi.add(ghost4);

        customFont = Font.loadFont(getClass().getResourceAsStream("PixelGameFont.ttf"), 30);

        //stampo tutte le info della lista monete
        for (Circle moneta : monete) {
            System.out.println(moneta);
        }

        for (Ghost ghost : fantasmi) {
            pane.getChildren().add(ghost.getImageView());
        }

        pane.setOnKeyPressed(this::handleKeyPress);

        //faccio un controllo continuo per aggiornare lo score sullo score che è un label
        new javafx.animation.AnimationTimer() {
            @Override
            public void handle(long now) {
                punteggio.setScore(((141 - monete.size()-1)*10));
                //Aggiorno il label
                System.out.println(punteggio.getScore());
                score.setFont(customFont);
                score.setTextAlignment(TextAlignment.CENTER);
                score.setText(punteggio.getScore());
            }
        }.start();


        pane.requestFocus();
    }

    public void setPacman(Pacman pacman) {
        this.pacman = pacman;
        pane.getChildren().add(pacman);
    }

    private void handleKeyPress(KeyEvent event) {
        switch (event.getCode()) {
            case UP:
            case W:
                pacman.moveUp();
                //System.out.println("UP");
                Ghost.firstMove = true;
                break;
            case DOWN:
            case S:
                pacman.moveDown();
                //System.out.println("DOWN");
                Ghost.firstMove = true;
                break;
            case LEFT:
            case A:
                pacman.moveLeft();
                //System.out.println("LEFT");
                Ghost.firstMove = true;
                break;
            case RIGHT:
            case D:
                pacman.moveRight();
                //System.out.println("RIGHT");
                Ghost.firstMove = true;
                break;
            default:
                break;
        }
    }

    public static void searchMonete(Pacman pacman) {
        for (int i = 0; i < monete.size(); i++) {
            Circle moneta = monete.get(i);
            if (pacman.getX() < moneta.getCenterX() + moneta.getRadius() &&
                    pacman.getX() + pacman.getWidth() > moneta.getCenterX() - moneta.getRadius() &&
                    pacman.getY() < moneta.getCenterY() + moneta.getRadius() &&
                    pacman.getY() + pacman.getHeight() > moneta.getCenterY() - moneta.getRadius()) {
                monete.remove(i);
                //rimuovo dal campo
                moneta.setVisible(false);
                //Aggiorno il label

                System.out.println("Monete rimaste: " + monete.size());
                break;
            }
        }
    }
}
