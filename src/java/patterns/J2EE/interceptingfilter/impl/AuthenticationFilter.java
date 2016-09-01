package patterns.J2EE.interceptingfilter.impl;

import patterns.J2EE.interceptingfilter.Filter;

/**
 * Created on 01.09.16.
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("Authentication request : " + request);
    }
}
