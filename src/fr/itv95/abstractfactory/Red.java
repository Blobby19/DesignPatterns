package fr.itv95.abstractfactory;

/**
 * Created by Luc on 11/10/2016.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
