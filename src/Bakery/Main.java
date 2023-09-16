package Bakery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ingredient flour = new Ingredient("Flour");
        Ingredient sugar = new Ingredient("Sugar");

        Pastry croissant = new Pastry("Croissant");
        croissant.addIngredient(flour);
        croissant.addIngredient(sugar);

        Pastry muffin = new Pastry("Blueberry Muffin");
        muffin.addIngredient(flour);
        muffin.addIngredient(sugar);

        Cake cake = new Cake("Vanilla",5); //created cake

        Bakery bakery = new Bakery();
        bakery.addPastry(croissant);
        bakery.addPastry(muffin);
        bakery.addPastry(cake); //added cake

        bakery.displayPastries();
    }
}
