package patterns.behavioral.observer.ext;

import patterns.behavioral.observer.Observer;
import patterns.behavioral.observer.Subject;

/**
 * Created on 26.08.16.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String : " + Integer.toBinaryString(subject.getState()));
    }
}
