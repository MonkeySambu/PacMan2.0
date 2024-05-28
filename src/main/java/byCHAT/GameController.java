package byCHAT;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class GameController {
    
    
    @FXML
    public GridPane gameBoard;

    //private PacMan pacMan;

    @FXML
    public void initialize() {
        //pacMan = new PacMan();
       //gameBoard.add(pacMan, 10, 10);
        //gameBoard.add(ghost, 15, 15);

        /*gameBoard.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case UP:
                    GridPane.setRowIndex(pacMan, GridPane.getRowIndex(pacMan) - 1);
                    break;
                case DOWN:
                    GridPane.setRowIndex(pacMan, GridPane.getRowIndex(pacMan) + 1);
                    break;
                case LEFT:
                    GridPane.setColumnIndex(pacMan, GridPane.getColumnIndex(pacMan) - 1);
                    break;
                case RIGHT:
                    GridPane.setColumnIndex(pacMan, GridPane.getColumnIndex(pacMan) + 1);
                    break;
            }
        });*/
        //gameBoard.requestFocus();
    }
}