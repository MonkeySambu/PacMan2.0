package Gioco;

import javafx.animation.AnimationTimer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.List;

public class Ghost extends Rectangle {
    private double dx;
    private double dy;
    private List<Rectangle> ostacoli;
    public static boolean firstMove = false;

    public Ghost(int x, int y, int width, int height, Color color, List<Rectangle> ostacoli) {
        super(width, height, color);
        setX(x);
        setY(y);
        dx = 0;
        dy = 0;
        this.ostacoli = ostacoli;

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                move();
            }
        }.start();
    }

    void move() {
        if (dx == 0 && dy == 0) {
            if (firstMove) {
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
    }

    private boolean isColliding(double nextX, double nextY) {
        for (Rectangle ostacolo : ostacoli) {
            if (nextX < ostacolo.getX() + ostacolo.getWidth() &&
                    nextX + getWidth() > ostacolo.getX() &&
                    nextY < ostacolo.getY() + ostacolo.getHeight() &&
                    nextY + getHeight() > ostacolo.getY()) {
                System.out.println("Colliding");
                return true;
            }
        }
        System.out.println("Not colliding");
        return false;
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
