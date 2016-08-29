package patterns.behavioral.nullobject.ext;

import patterns.behavioral.nullobject.AbstractCustomer;

/**
 * Created on 29.08.16.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
