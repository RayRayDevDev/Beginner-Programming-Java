import java.util.ArrayList;

public class Sandwich {
    public static ArrayList<String> breads() {
        final ArrayList<String> bread = new ArrayList<>();
        bread.add("White");
        bread.add("Wheat");
        bread.add("Rye");
        bread.add("Ciabatta");
        bread.add("Sourdough");
        return bread;
    }
    public static void ingredients() {
        final ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("Salami");
        ingredients.add("Chicken");
        ingredients.add("Turkey");
        ingredients.add("Roast Beef");
        ingredients.add("Egg Salad");
    }
}