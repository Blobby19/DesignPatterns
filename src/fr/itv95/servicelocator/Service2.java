package fr.itv95.servicelocator;

/**
 * Created by Luc on 17/10/2016.
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
