package patterns.structural.frontcontroller;

/**
 * Created on 29.08.16.
 */
public class FrontController {

    private Dispather dispather;

    public FrontController() {
        this.dispather = new Dispather();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested : " + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);
        if (isAuthenticUser()) {
            dispather.dispatch(request);
        }
    }
}
