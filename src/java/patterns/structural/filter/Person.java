package patterns.structural.filter;

import java.util.List;

/**
 * Created on 19.08.16.
 */
public class Person {

    private String name;

    private TypeCriteria gender;

    private TypeCriteria maritalStatus;

    public Person(String name, TypeCriteria gender, TypeCriteria maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeCriteria getGender() {
        return gender;
    }

    public void setGender(TypeCriteria gender) {
        this.gender = gender;
    }

    public TypeCriteria getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(TypeCriteria maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public static void printPersons(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("Person - Name : " + person.getName() + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus());
        }
    }
}