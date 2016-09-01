package patterns.J2EE.interceptingfilter;

/**
 * Created on 01.09.16.
 */
public class FilterManager {

    private FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    void filterRequest(String request) {
        filterChain.execute(request);
    }
}
