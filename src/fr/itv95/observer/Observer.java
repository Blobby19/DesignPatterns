package fr.itv95.observer;

/**
 * Created by Luc on 17/10/2016.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
