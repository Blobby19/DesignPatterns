package fr.itv95.factory;

/**
 * Created by Luc on 11/10/2016.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() methods.");
    }
}
