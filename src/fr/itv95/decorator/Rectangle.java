package fr.itv95.decorator;

/**
 * Created by Luc on 13/10/2016.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
