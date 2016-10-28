package fr.itv95.state;

/**
 * Created by Luc on 17/10/2016.
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state.");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
