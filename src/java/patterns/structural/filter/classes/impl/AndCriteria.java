package patterns.structural.filter.classes.impl;

import patterns.structural.filter.Person;
import patterns.structural.filter.classes.Criteria;

import java.util.List;

/**
 * Created on 19.08.16.
 */
public class AndCriteria implements Criteria {

    private Criteria criteria1;

    private Criteria criteria2;

    public AndCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriapersons = criteria1.meetCriteria(persons);
        return criteria2.meetCriteria(firstCriteriapersons);
    }
}
