package fr.itv95.chainofresponsibility;

/**
 * Created by Luc on 17/10/2016.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: "+message);
    }
}
