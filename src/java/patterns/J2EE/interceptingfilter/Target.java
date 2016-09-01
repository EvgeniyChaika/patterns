package patterns.J2EE.interceptingfilter;

/**
 * Created on 01.09.16.
 */
public class Target {

    public void execute(String request) {
        System.out.println("Executing request : " + request);
    }
}
