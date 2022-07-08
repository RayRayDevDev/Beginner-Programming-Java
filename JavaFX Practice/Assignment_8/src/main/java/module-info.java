module com.raydev.assignment_8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.raydev.assignment_8 to javafx.fxml;
    exports com.raydev.assignment_8;
}