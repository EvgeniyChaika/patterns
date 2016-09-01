package patterns.J2EE.businessdelegate;

/**
 * Created on 01.09.16.
 */
public class BusinessDelegate {

    private BusinessLookUp businessLookUp = new BusinessLookUp();

    private BusinessService businessService;

    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = businessLookUp.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
