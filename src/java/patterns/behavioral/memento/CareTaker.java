package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 26.08.16.
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
