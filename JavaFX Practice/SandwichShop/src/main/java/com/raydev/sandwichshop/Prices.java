package com.raydev.sandwichshop;

import java.util.ArrayList;

public class Prices {

    public static Double breadPrices(int userSelection) {
        ArrayList<Double> breadPrices = new ArrayList<>();
        breadPrices.add(2.00); //Rye
        breadPrices.add(3.00); //Sourdough
        breadPrices.add(4.00); //Ciabatta
        breadPrices.add(1.00); //Wheat
        breadPrices.add(1.00); //White
        return breadPrices.get(userSelection);
    }

    public static Double fillingPrices(int userSelection) {
        ArrayList<Double> fillingPrices = new ArrayList<>();
        fillingPrices.add(2.50); //Salami
        fillingPrices.add(1.50); //Chicken
        fillingPrices.add(2.00); //Turkey
        fillingPrices.add(3.00); //Roast Beef
        fillingPrices.add(2.75); //Egg Salad
        return fillingPrices.get(userSelection);
    }

    public static Double addOnPrices(int userSelection) {
        ArrayList<Double> addOnPrices = new ArrayList<>();
        addOnPrices.add(0.25); //Lettuce, Tomato, Onion, Pickle
        addOnPrices.add(0.50); //Cheese
        return addOnPrices.get(userSelection);
    }
}
