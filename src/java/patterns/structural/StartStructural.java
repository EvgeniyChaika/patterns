package patterns.structural;

import patterns.structural.flyweight.ShapeFactory;
import patterns.structural.flyweight.impl.Circle;

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

//        List<Person> personList = new ArrayList<>();
//
//        personList.add(new Person("Mike", TypeCriteria.MALE, TypeCriteria.SINGLE));
//        personList.add(new Person("Patrick", TypeCriteria.MALE, TypeCriteria.MARRIED));
//        personList.add(new Person("Lora", TypeCriteria.FEMALE, TypeCriteria.SINGLE));
//        personList.add(new Person("Diana", TypeCriteria.FEMALE, TypeCriteria.MARRIED));
//        personList.add(new Person("Bob", TypeCriteria.MALE, TypeCriteria.SINGLE));
//        personList.add(new Person("Rick", TypeCriteria.MALE, TypeCriteria.SINGLE));
//
//        Criteria male = new CriteriaMale();
//        Criteria female = new CriteriaFemale();
//        Criteria single = new CriteriaSingle();
//        Criteria singleMale = new AndCriteria(single, male);
//        Criteria singleOrFemale = new OrCriteria(single, female);
//
//        System.out.println("Males : ");
//        Person.printPersons(male.meetCriteria(personList));
//        System.out.println("Females : ");
//        Person.printPersons(female.meetCriteria(personList));
//        System.out.println("Single Males : ");
//        Person.printPersons(singleMale.meetCriteria(personList));
//        System.out.println("Single or Females : ");
//        Person.printPersons(singleOrFemale.meetCriteria(personList));

//--------------------------------------------- Composite -----------------------------------------------------

//        Employee CEO = new Employee("John", "CEO", 30000);
//        Employee headSales = new Employee("Robert", "Head Sales", 20000);
//        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
//
//        Employee clerk1 = new Employee("Laura", "Clerk", 10000);
//        Employee clerk2 = new Employee("Bob", "Clerk", 10000);
//
//        Employee sales1 = new Employee("Richard", "Sales", 10000);
//        Employee sales2 = new Employee("Rob", "Sales", 10000);
//
//        CEO.add(headSales);
//        CEO.add(headMarketing);
//
//        headSales.add(sales1);
//        headSales.add(sales2);
//
//        headMarketing.add(clerk1);
//        headMarketing.add(clerk2);
//
//        System.out.println(CEO);
//        for (Employee headEmployee : CEO.getSubordinates()) {
//            System.out.println(headEmployee);
//            for (Employee employee : headEmployee.getSubordinates()) {
//                System.out.println(employee);
//            }
//        }

//--------------------------------------------- Decorator -----------------------------------------------------

//        Shape circle = new Circle();
//
//        Shape redCircle = new RedShapeDecorator(new Circle());
//        Shape redRectangle = new RedShapeDecorator(new Rectangle());
//
//        System.out.println("Shape with normal border");
//        circle.draw();
//
//        System.out.println("\nCircle with red border");
//        redCircle.draw();
//
//        System.out.println("\nRectangle with red border");
//        redRectangle.draw();

//--------------------------------------------- Facade --------------------------------------------------------

//        ShapeMaker shapeMaker = new ShapeMaker();
//
//        shapeMaker.drawCircle();
//        shapeMaker.drawRectangle();
//        shapeMaker.drawSquare();

//-------------------------------------------- Flyweight -----------------------------------------------------

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(ShapeFactory.getRandomColor());

            circle.setX(ShapeFactory.getRandomX());
            circle.setY(ShapeFactory.getRandomY());
            circle.setRadius(ShapeFactory.getRandomRadius());
            circle.draw();
        }
    }
}
