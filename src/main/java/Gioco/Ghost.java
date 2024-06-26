package Gioco;

import Avvio.Avvio;
import Classifica.GraficaClassifica;
import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.*;
import java.util.List;

import static Gioco.GameController.punteggio;

public class Ghost extends Rectangle {
    private double dx;
    private double dy;
    private List<Rectangle> ostacoli;
    public static boolean firstMove = false;
    boolean realFistMove=false;
    private ImageView imageView;
    public static boolean fermi = false;

    public Ghost(int x, int y, int width, int height, Color color, List<Rectangle> ostacoli,String imagePath) {
        super(width, height, color);
        setX(x);
        setY(y);
        dx = 0;
        dy = 0;

        Image pacmanImage = new Image(getClass().getResourceAsStream(imagePath));
        imageView = new ImageView(pacmanImage);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);

        this.ostacoli = ostacoli;

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                move();
            }
        }.start();
    }

    void move() {
        if (dx == 0 && dy == 0 && !fermi) {
            if (firstMove && realFistMove) {
                int random = (int) (Math.random() * 4);
                switch (random) {
                    case 0:
                        dx = 2;
                        dy = 0;
                        break;
                    case 1:
                        dx = -2;
                        dy = 0;
                        break;
                    case 2:
                        dx = 0;
                        dy = 2;
                        break;
                    case 3:
                        dx = 0;
                        dy = -2;
                        break;
                }
            }else if(firstMove && !realFistMove){
                int random = (int) (Math.random() * 3);
                //mi muovo solo in altor, a destra e a sinistra
                switch (random) {
                    case 0:
                        dx = 2;
                        dy = 0;
                        break;
                    case 1:
                        dx = -2;
                        dy = 0;
                        break;
                    case 2:
                        dx = 0;
                        dy = -2;
                        break;
                }
                realFistMove=true;
            }

        }else {
            double nextX = getX() + dx;
            double nextY = getY() + dy;

            if (nextX >= 0 && nextX + getWidth() <= 1280 &&
                    nextY >= 0 && nextY + getHeight() <= 720 &&
                    !isColliding(nextX, nextY)) {
                setX(nextX);
                setY(nextY);
            } else {
                dx = 0;
                dy = 0;
            }
        }
        imageView.setX(getX());
        imageView.setY(getY());
    }

    private boolean isColliding(double nextX, double nextY) {
        for (Rectangle ostacolo : ostacoli) {
            if (nextX < ostacolo.getX() + ostacolo.getWidth() &&
                    nextX + getWidth() > ostacolo.getX() &&
                    nextY < ostacolo.getY() + ostacolo.getHeight() &&
                    nextY + getHeight() > ostacolo.getY()) {
                //System.out.println("Colliding");
                return true;
            }
        }
        //Se ghost collide con pacman il gioco finisce
        if (nextX < GameController.pacman.getX() + GameController.pacman.getWidth() &&
                nextX + getWidth() > GameController.pacman.getX() &&
                nextY < GameController.pacman.getY() + GameController.pacman.getHeight() &&
                nextY + getHeight() > GameController.pacman.getY()) {
            //fermo tutti
            GameController.pacman.stop();
            GameController.fantasmi.forEach(Ghost::OnlyStop);
            //sposto tutti alle loro posizioni originali
GameController.pacman.setX(602);
GameController.pacman.setY(400);
GameController.fantasmi.get(0).setX(602);
GameController.fantasmi.get(0).setY(400);
GameController.fantasmi.get(1).setX(602);
GameController.fantasmi.get(1).setY(400);
GameController.fantasmi.get(2).setX(602);
GameController.fantasmi.get(2).setY(400);
GameController.fantasmi.get(3).setX(602);
GameController.fantasmi.get(3).setY(400);
                Avvio.gameOver = true;

        }
        //System.out.println("Not colliding");
        return false;
    }

    private void OnlyStop() {
        dx = 0;
        dy = 0;
        fermi = true;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getDx() {
        return (int) dx;
    }

    public int getDy()
    {
        return (int) dy;
    }

    public void stop() {
        dx = 0;
        dy = 0;
    }
}
