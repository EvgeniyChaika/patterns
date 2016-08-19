package patterns.structural.filter.classes.impl;

import patterns.structural.filter.Person;
import patterns.structural.filter.TypeCriteria;
import patterns.structural.filter.classes.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 19.08.16.
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equals(TypeCriteria.MALE)) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
