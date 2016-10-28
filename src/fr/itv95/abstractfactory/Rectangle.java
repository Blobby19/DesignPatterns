package fr.itv95.abstractfactory;

/**
 * Created by Luc on 11/10/2016.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() methods.");
    }
}
