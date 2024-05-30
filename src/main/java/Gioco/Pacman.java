package Gioco;

import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class Pacman extends Rectangle {
    private double dx;
    private double dy;
    private Rotate rotation;
    private ImageView imageView;

    public Pacman(int x, int y, int width, int height, Color color) {
        super(width, height, color);
        setX(x);
        setY(y);
        dx = 0;
        dy = 0;

        Image pacmanImage = new Image(getClass().getResourceAsStream("pacman.png"));
        imageView = new ImageView(pacmanImage);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);

        rotation = new Rotate();
        rotation.setPivotX(width / 2.0);
        rotation.setPivotY(height / 2.0);
        this.getTransforms().add(rotation);

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                move();
            }
        }.start();
    }

    public void setRotation(double angle) {
        rotation.setAngle(angle);
    }

    public ImageView getImageView() {
        return imageView;
    }

    private void move() {
        double nextX = getX() + dx;
        double nextY = getY() + dy;

        if (nextX >= 0 && nextX + getWidth() <= 1280 &&
                nextY >= 0 && nextY + getHeight() <= 720 &&
                !isColliding(nextX, nextY)) {
            setX(nextX);
            setY(nextY);
        }
        imageView.setX(getX());
        imageView.setY(getY());
    }

    private boolean isColliding(double nextX, double nextY) {
        for (Rectangle obstacle : GameController.ostacoli) {
            if (nextX < obstacle.getX() + obstacle.getWidth() &&
                    nextX + getWidth() > obstacle.getX() &&
                    nextY < obstacle.getY() + obstacle.getHeight() &&
                    nextY + getHeight() > obstacle.getY()) {
                System.out.println("Colliding con " + obstacle);
                return true;
            }
        }
        //se collido in ogni direzione con un fantasma perdo
        for (Ghost ghost : GameController.fantasmi) {
            if (nextX < ghost.getX() + ghost.getWidth() &&
                    nextX + getWidth() > ghost.getX() &&
                    nextY < ghost.getY() + ghost.getHeight() &&
                    nextY + getHeight() > ghost.getY()) {
                System.out.println("Colliding con " + ghost);
                System.out.println("Hai perso");
                System.exit(0);
            }
        }
        System.out.println("Not colliding");
        return false;
    }

    public void moveUp() {
        dy = -3;
        dx = 0;
        imageView.setRotate(90);
    }

    public void moveDown() {
        dy = 3;
        dx = 0;
        imageView.setRotate(270);
    }

    public void moveLeft() {
        dx = -3;
        dy = 0;
        imageView.setRotate(0);
    }

    public void moveRight() {
        dx = 3;
        dy = 0;
        imageView.setRotate(180);
    }
}
