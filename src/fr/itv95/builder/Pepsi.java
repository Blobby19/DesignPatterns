package fr.itv95.builder;

/**
 * Created by Luc on 11/10/2016.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
