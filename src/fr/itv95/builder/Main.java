package fr.itv95.builder;

/**
 * Created by Luc on 11/10/2016.
 */
public class Main {

    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: "+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: "+vegMeal.getCost());
    }

}
