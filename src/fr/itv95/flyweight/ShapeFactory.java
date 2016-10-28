package fr.itv95.flyweight;

import java.util.HashMap;

/**
 * Created by Luc on 14/10/2016.
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : "+color);
        }
        return circle;
    }

}
