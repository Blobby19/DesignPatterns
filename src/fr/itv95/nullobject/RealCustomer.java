package fr.itv95.nullobject;

/**
 * Created by Luc on 17/10/2016.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
