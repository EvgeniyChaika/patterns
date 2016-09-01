package patterns.J2EE.businessdelegate.impl;

import patterns.J2EE.businessdelegate.BusinessService;

/**
 * Created on 01.09.16.
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
