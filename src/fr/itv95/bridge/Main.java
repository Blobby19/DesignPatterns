package fr.itv95.bridge;

/**
 * Created by Luc on 13/10/2016.
 */
public class Main {

    public static void main(String[] args){
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        Shape blueCircle = new Circle(100, 100, 10, new BlueCircle());

        redCircle.draw();
        greenCircle.draw();
        blueCircle.draw();
    }

}
