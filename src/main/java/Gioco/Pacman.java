package Gioco;

import javafx.animation.AnimationTimer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Pacman extends Rectangle {
    private int dx;
    private int dy;

    public Pacman(int x, int y, int width, int height, Color color) {
        super(width, height, color);
        setX(x);
        setY(y);
        dx = 0;
        dy = 0;

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                move();
            }
        }.start();
    }

    public void move() {
        if (getX() + dx > 0 && getX() + dx < 1280) {
            setX(getX() + dx);
        }
        if (getY() + dy > 15 && getY() + dy < 720) {
            setY(getY() + dy);
        }
    }

    public void moveUp() {
        dy = -1;
        dx = 0;
    }

    public void moveDown() {
        dy = 1;
        dx = 0;
    }

    public void moveLeft() {
        dx = -1;
        dy = 0;
    }

    public void moveRight() {
        dx = 1;
        dy = 0;
    }
}