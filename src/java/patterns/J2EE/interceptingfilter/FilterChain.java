package patterns.J2EE.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 01.09.16.
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();

    private Target target;

    void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    void setTarget(Target target) {
        this.target = target;
    }
}
