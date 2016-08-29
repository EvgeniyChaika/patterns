package patterns.behavioral.state.impl;

import patterns.behavioral.state.Context;
import patterns.behavioral.state.State;

/**
 * Created on 29.08.16.
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
