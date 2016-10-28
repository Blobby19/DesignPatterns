package fr.itv95.nullobject;

/**
 * Created by Luc on 17/10/2016.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available in customer database";
    }
}
