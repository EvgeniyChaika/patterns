package patterns.creational.singleton;

/**
 * Created on 17.08.16.
 */
public class SingleObject {

    private static SingleObject instance;

    private static int counter;

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        if (instance == null) {
            instance = new SingleObject();
            System.out.println("Message Singleton");
        }
        counter++;
        return instance;
    }

    public void showMessage() {
        System.out.println("Show counter " + counter);
    }
}
