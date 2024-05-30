package Gioco;

import com.almasb.fxgl.core.collection.grid.Cell;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.control.ColorPicker;

import java.util.Random;

public class Ghost extends Application {

    private static Rectangle punto;
    private static Rectangle parete;
    private static Rectangle parete2;

    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    private static final int RECT_SIZE = 75;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, WIDTH, HEIGHT);

        // Creare quattro rettangoli
        Rectangle[] rectangles = new Rectangle[4];
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(RECT_SIZE, RECT_SIZE,
                    Color.color(Math.random(), Math.random(), Math.random()));
            rectangles[i].setX(Math.random() * (WIDTH - RECT_SIZE));
            rectangles[i].setY(Math.random() * (HEIGHT - RECT_SIZE));
            pane.getChildren().add(rectangles[i]);
        }

        //faccio un punto 10px 10px generato casualmente nella mappa
        punto = new Rectangle(10, 10, Color.RED);
        punto.setX(Math.random() * (WIDTH - 10));
        punto.setY(Math.random() * (HEIGHT - 10));
        pane.getChildren().add(punto);

        //creo una parete 100 x 20 verticale al centro dello schermo viola
        parete = new Rectangle(100, 20, Color.PURPLE);
        parete.setX(WIDTH / 2 - 50);
        parete.setY(HEIGHT / 2 - 10);
        pane.getChildren().add(parete);

        //ne creo un altro
        parete2 = new Rectangle(20, 100, Color.PURPLE);
        parete2.setX(WIDTH / 2 - 10);
        parete2.setY(HEIGHT / 2 - 50);
        pane.getChildren().add(parete2);


        primaryStage.setScene(scene);
        primaryStage.setTitle("Random Movement of Rectangles");
        primaryStage.show();
    }
}
