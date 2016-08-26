package patterns.behavioral.observer;

/**
 * Created on 26.08.16.
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
