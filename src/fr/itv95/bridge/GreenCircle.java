package fr.itv95.bridge;

/**
 * Created by Luc on 13/10/2016.
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color: green, radius: "+radius+", x: "+x+", y: "+y+"]");
    }
}
