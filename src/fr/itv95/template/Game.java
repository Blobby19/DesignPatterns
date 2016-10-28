package fr.itv95.template;

/**
 * Created by Luc on 17/10/2016.
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }

}
