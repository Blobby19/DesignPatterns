package fr.itv95.template;

/**
 * Created by Luc on 17/10/2016.
 */
public class Main {

    public static void main(String[] args){
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
