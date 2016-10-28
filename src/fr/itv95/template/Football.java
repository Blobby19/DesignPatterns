package fr.itv95.template;

/**
 * Created by Luc on 17/10/2016.
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game started! Enjoy the game.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game finished.");
    }
}
