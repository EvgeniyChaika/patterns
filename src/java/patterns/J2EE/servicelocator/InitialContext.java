package patterns.J2EE.servicelocator;

import patterns.J2EE.servicelocator.impl.Service1;
import patterns.J2EE.servicelocator.impl.Service2;

/**
 * Created on 01.09.16.
 */
public class InitialContext {

    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        } else {
            return null;
        }
    }
}
