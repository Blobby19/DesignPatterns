package fr.itv95.factory;


import java.util.ArrayList;

/**
 * Created by Luc on 11/10/2016.
 */
public class Main {

    public static void main(String[] args){
        ArrayList<Shape> listOfShapes = new ArrayList<Shape>();
        ShapeFactory shapeFactory = new ShapeFactory();
        listOfShapes.add(shapeFactory.getShape("Rectangle"));
        listOfShapes.add(shapeFactory.getShape("Square"));
        for(int i = 0; i < listOfShapes.size(); ++i){
            listOfShapes.get(i).draw();
        }
    }

}
