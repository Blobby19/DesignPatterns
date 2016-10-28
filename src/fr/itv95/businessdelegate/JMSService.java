package fr.itv95.businessdelegate;

/**
 * Created by Luc on 17/10/2016.
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
