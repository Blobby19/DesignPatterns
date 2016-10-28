package fr.itv95.builder;

/**
 * Created by Luc on 11/10/2016.
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
