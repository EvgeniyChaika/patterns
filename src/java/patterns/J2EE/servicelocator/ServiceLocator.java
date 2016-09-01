package patterns.J2EE.servicelocator;

/**
 * Created on 01.09.16.
 */
public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {
        Service service = cache.getService(jndiName);

        if (service != null) {
            return service;
        }
        InitialContext initialContext = new InitialContext();
        Service service1 = (Service) initialContext.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
