module com.raydev {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.raydev to javafx.fxml;
    exports com.raydev;
}
