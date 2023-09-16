package Bakery;

import java.util.ArrayList;

public class Bakery {
    private ArrayList<Pastry> pastries;

    public Bakery(){
        pastries = new ArrayList<>();
    }

    public void addPastry(Pastry pastry){
        pastries.add(pastry);
    }

    public void displayPastries() {
        System.out.println("Pastries in the bakery:");
        for (Pastry pastry : pastries) { //this goes through the pastry array list
            if (pastry instanceof Cake){  //"Is this pastry object a cake?"
                System.out.println("Cake: " + pastry.getName()); //"Yes, say it's a cake"
            }
            else {
                System.out.println("Pastry: " + pastry.getName()); //"No, it's a generic pastry"
            }
            pastry.displayIngredients();

            System.out.println();
        }
    }
}
