package com.raydev.sandwichshop;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class SandwichController {
    @FXML
    private TextField guiGrandTotal;
    public SandwichController() {
    }
    @FXML
    private void initialize() {
    }
//    @FXML
//    private ToggleGroup breadRadioButtonGroup;
//    @FXML
//    private ToggleGroup fillingsRadioButtonGroup;
    @FXML
    private RadioButton rye, sourdough, ciabatta, wheat, white, salami, chicken, turkey, roastBeef, eggSalad;

//    @FXML
//    public static Double setRadioButtonValues(ToggleGroup breadRadioButtonGroup) {
//        breadRadioButtonGroup.getToggles().addAll(
//                new RadioButton("rye"),
//                new RadioButton("sourdough"),
//                new RadioButton("ciabatta"),
//                new RadioButton("wheat"),
//                new RadioButton("white"),
//                new RadioButton("salami"),
//                new RadioButton("chicken"),
//                new RadioButton("turkey"),
//                new RadioButton("roast beef"),
//                new RadioButton("egg salad")
//        );
//        Double runningTotal = new Double[1];
//        breadRadioButtonGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
//               Object[] findToggleIndex = breadRadioButtonGroup.getToggles().toArray();
//               for (Object toggleIndex : findToggleIndex) {
//                   if (breadRadioButtonGroup.getSelectedToggle().equals(toggleIndex)) {
//                       runningTotal[0] = Prices.prices((int)toggleIndex);
//                   }
//                   break;
//               }
//           });
//
//        return runningTotal[0];
//
//    }

    @FXML
    public void displayGrandTotal() {
        Double total = Prices.prices(9);
        guiGrandTotal.setText(String.valueOf(total));
    }

//    private void setRadioButtonValues(int userSelection) {
//        if(userSelection != 0) {
//            setRadioButtonValues(userSelection);
//        }
//    }
}