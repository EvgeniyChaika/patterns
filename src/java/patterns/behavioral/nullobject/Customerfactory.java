package patterns.behavioral.nullobject;

import patterns.behavioral.nullobject.ext.NullCustomer;
import patterns.behavioral.nullobject.ext.RealCustomer;

/**
 * Created on 29.08.16.
 */
public class Customerfactory {

    public static final String[] names = {"Rob", "Joe", "Julia"};

    public static AbstractCustomer getCustomer(String text) {
        for (String name : names) {
            if (name.equalsIgnoreCase(text)) {
                return new RealCustomer(text);
            }
        }
        return new NullCustomer();
    }
}
