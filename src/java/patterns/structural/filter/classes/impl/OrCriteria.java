package patterns.structural.filter.classes.impl;

import patterns.structural.filter.Person;
import patterns.structural.filter.classes.Criteria;

import java.util.List;

/**
 * Created on 19.08.16.
 */
public class OrCriteria implements Criteria {

    private Criteria criteria1;

    private Criteria criteria2;

    public OrCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria1.meetCriteria(persons);
        List<Person> secondCriteriaItems = criteria2.meetCriteria(persons);

        for (Person person : secondCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
