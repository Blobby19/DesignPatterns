package fr.itv95.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luc on 13/10/2016.
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for(Person person:persons){
            if(person.getMaritalStatus().equalsIgnoreCase("single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
