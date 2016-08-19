package patterns.structural.filter.classes.impl;

import patterns.structural.filter.Person;
import patterns.structural.filter.TypeCriteria;
import patterns.structural.filter.classes.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 19.08.16.
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equals(TypeCriteria.SINGLE)) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
