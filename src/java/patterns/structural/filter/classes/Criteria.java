package patterns.structural.filter.classes;

import patterns.structural.filter.Person;

import java.util.List;

/**
 * Created on 19.08.16.
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
