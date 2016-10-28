package fr.itv95.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luc on 13/10/2016.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();

        for(Person person:persons){
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
