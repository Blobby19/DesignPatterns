package fr.itv95.prototype;

/**
 * Created by Luc on 13/10/2016.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }

}
