package fr.itv95.prototype;

/**
 * Created by Luc on 13/10/2016.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
