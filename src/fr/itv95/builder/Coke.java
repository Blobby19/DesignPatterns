package fr.itv95.builder;

/**
 * Created by Luc on 11/10/2016.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
