package com.raydev.sandwichshop;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SandwichController {
    @FXML
    private TextField guiGrandTotal;
    public SandwichController() {
    }
    @FXML
    private void initialize() {
    }
//    @FXML
//    private Label rye, sourdough, ciabatta, wheat, white, salami, chicken, turkey, roastBeef, eggSalad;

    @FXML
    private void grandTotalCalc(int userBreadChoice, int userFillingChoice, int userAddOnsChoices) {
        Double userBreadPrice = Prices.breadPrices(userBreadChoice);
        Double userFillingPrice = Prices.fillingPrices(userFillingChoice);
        Double userAddOnsPrice = Prices.addOnPrices(userAddOnsChoices);
        Double grandTotal = userBreadPrice + userFillingPrice + userAddOnsPrice;
        guiGrandTotal.setText(String.valueOf(grandTotal));
    }
}