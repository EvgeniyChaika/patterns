package patterns.behavioral.nullobject.ext;

import patterns.behavioral.nullobject.AbstractCustomer;

/**
 * Created on 29.08.16.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available in Customer Database";
    }
}
