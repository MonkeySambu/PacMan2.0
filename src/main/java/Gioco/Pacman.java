package Gioco;

import javafx.animation.AnimationTimer;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
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
        // Set the pivot points to the center of the rectangle
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

    public void move() {
        if (getX() + dx > 0 && getX() + dx < 1280) {
            setX(getX() + dx);
        }
        if (getY() + dy > 15 && getY() + dy < 720) {
            setY(getY() + dy);
        }

        // Update the position of the imageView to match the rectangle
        imageView.setX(getX());
        imageView.setY(getY());
    }

    public void moveUp() {
        dy = -1;
        dx = 0;
        imageView.setRotate(90); // Rotate up
    }

    public void moveDown() {
        dy = 1;
        dx = 0;
        imageView.setRotate(270); // Rotate down
    }

    public void moveLeft() {
        dx = -1;
        dy = 0;
        imageView.setRotate(0); // Rotate left
    }

    public void moveRight() {
        dx = 1;
        dy = 0;
        imageView.setRotate(180); // Rotate right
    }

}