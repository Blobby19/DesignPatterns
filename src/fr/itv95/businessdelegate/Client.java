package fr.itv95.businessdelegate;

/**
 * Created by Luc on 17/10/2016.
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
