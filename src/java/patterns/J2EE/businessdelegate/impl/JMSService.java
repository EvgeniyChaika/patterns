package patterns.J2EE.businessdelegate.impl;

import patterns.J2EE.businessdelegate.BusinessService;

/**
 * Created on 01.09.16.
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
