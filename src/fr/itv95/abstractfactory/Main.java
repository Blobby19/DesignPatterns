package fr.itv95.abstractfactory;

import java.util.ArrayList;

/**
 * Created by Luc on 11/10/2016.
 */
public class Main {

    public static void main(String[] args){

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        ArrayList<Shape> listOfShapes = new ArrayList<Shape>();
        listOfShapes.add(shapeFactory.getShape("RECTANGLE"));
        listOfShapes.add(shapeFactory.getShape("CIRCLE"));
        listOfShapes.add(shapeFactory.getShape("SQUARE"));
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        ArrayList<Color> listOfColors = new ArrayList<Color>();
        listOfColors.add(colorFactory.getColor("RED"));
        listOfColors.add(colorFactory.getColor("GREEN"));
        listOfColors.add(colorFactory.getColor("BLUE"));
        for(int i = 0; i < listOfShapes.size(); ++i){
            listOfShapes.get(i).draw();
        }
        for(int i = 0; i < listOfColors.size(); ++i){
            listOfColors.get(i).fill();
        }

    }

}
