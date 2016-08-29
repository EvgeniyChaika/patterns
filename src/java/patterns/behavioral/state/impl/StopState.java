package patterns.behavioral.state.impl;

import patterns.behavioral.state.Context;
import patterns.behavioral.state.State;

/**
 * Created on 29.08.16.
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
