package patterns.J2EE.servicelocator.impl;

import patterns.J2EE.servicelocator.Service;

/**
 * Created on 01.09.16.
 */
public class Service1 implements Service {

    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
