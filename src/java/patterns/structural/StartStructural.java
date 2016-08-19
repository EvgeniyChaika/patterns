package patterns.structural;

import patterns.structural.filter.Person;
import patterns.structural.filter.TypeCriteria;
import patterns.structural.filter.classes.Criteria;
import patterns.structural.filter.classes.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 19.08.16.
 */
public class StartStructural {

    public static void main(String[] args) {

//--------------------------------------------- Adapter ------------------------------------------------------

//        AudioPlayer audioPlayer = new AudioPlayer();
//
//        audioPlayer.play(TypePlayback.MP3, "song.mp3");
//        audioPlayer.play(TypePlayback.MP4, "video.mp4");
//        audioPlayer.play(TypePlayback.VLC, "song.vlc");
//        audioPlayer.play(TypePlayback.AVI, "video.avi");

//---------------------------------------------- Bridge ------------------------------------------------------

//        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
//        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
//
//        redCircle.draw();
//        greenCircle.draw();

//---------------------------------------------- Filter ------------------------------------------------------

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Mike", TypeCriteria.MALE, TypeCriteria.SINGLE));
        personList.add(new Person("Patrick", TypeCriteria.MALE, TypeCriteria.MARRIED));
        personList.add(new Person("Lora", TypeCriteria.FEMALE, TypeCriteria.SINGLE));
        personList.add(new Person("Diana", TypeCriteria.FEMALE, TypeCriteria.MARRIED));
        personList.add(new Person("Bob", TypeCriteria.MALE, TypeCriteria.SINGLE));
        personList.add(new Person("Rick", TypeCriteria.MALE, TypeCriteria.SINGLE));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males : ");
        Person.printPersons(male.meetCriteria(personList));
        System.out.println("Females : ");
        Person.printPersons(female.meetCriteria(personList));
        System.out.println("Single Males : ");
        Person.printPersons(singleMale.meetCriteria(personList));
        System.out.println("Single or Females : ");
        Person.printPersons(singleOrFemale.meetCriteria(personList));


    }
}
