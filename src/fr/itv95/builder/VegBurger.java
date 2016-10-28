package fr.itv95.builder;

/**
 * Created by Luc on 11/10/2016.
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
