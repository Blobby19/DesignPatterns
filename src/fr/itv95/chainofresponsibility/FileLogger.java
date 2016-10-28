package fr.itv95.chainofresponsibility;

/**
 * Created by Luc on 17/10/2016.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: "+message);
    }
}
