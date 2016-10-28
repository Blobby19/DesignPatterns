package fr.itv95.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luc on 13/10/2016.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();

        for(Person person:persons){
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }

        return malePersons;
    }
}
