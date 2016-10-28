package fr.itv95.template;

/**
 * Created by Luc on 17/10/2016.
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game started! Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
