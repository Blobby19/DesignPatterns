package fr.itv95.businessdelegate;

/**
 * Created by Luc on 17/10/2016.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }
        else return new JMSService();
    }
}
