package patterns.J2EE.businessdelegate;

import patterns.J2EE.businessdelegate.impl.EJBService;
import patterns.J2EE.businessdelegate.impl.JMSService;

/**
 * Created on 01.09.16.
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
