module Avvio{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports Avvio to javafx.graphics;
    opens Avvio to javafx.fxml;
}
