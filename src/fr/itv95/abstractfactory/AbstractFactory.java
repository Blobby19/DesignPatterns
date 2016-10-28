package fr.itv95.abstractfactory;

/**
 * Created by Luc on 11/10/2016.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
