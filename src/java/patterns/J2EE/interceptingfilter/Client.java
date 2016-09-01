package patterns.J2EE.interceptingfilter;

/**
 * Created on 01.09.16.
 */
public class Client {

    private FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
