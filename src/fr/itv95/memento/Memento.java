package fr.itv95.memento;

/**
 * Created by Luc on 17/10/2016.
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

}
