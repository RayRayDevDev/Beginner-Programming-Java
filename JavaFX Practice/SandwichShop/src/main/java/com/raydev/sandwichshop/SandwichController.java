package com.raydev.sandwichshop;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SandwichController {
    @FXML
    private TextField grandTotal;
    public SandwichController() {

    }
    @FXML
    private void initialize() {

    }
    @FXML
    private void printGrandTotal() {
        grandTotal.setText("This is some text.");
    }
}