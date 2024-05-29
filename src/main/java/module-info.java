module byCHAT{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports byCHAT to javafx.graphics;
    opens byCHAT to javafx.fxml;
}
