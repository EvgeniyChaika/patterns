package patterns.behavioral.observer.ext;

import patterns.behavioral.observer.Observer;
import patterns.behavioral.observer.Subject;

/**
 * Created on 26.08.16.
 */
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String : " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
