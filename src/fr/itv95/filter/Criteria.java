package fr.itv95.filter;

import java.util.List;

/**
 * Created by Luc on 13/10/2016.
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);

}
