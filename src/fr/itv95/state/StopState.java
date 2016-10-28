package fr.itv95.state;

/**
 * Created by Luc on 17/10/2016.
 */
public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state.");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
