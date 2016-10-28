package fr.itv95.servicelocator;

/**
 * Created by Luc on 17/10/2016.
 */
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
