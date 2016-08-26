package patterns.behavioral.iterator.impl;

import patterns.behavioral.iterator.Container;
import patterns.behavioral.iterator.Iterator;

/**
 * Created on 26.08.16.
 */
public class NameRepository implements Container {

    public String[] names = {"Robert", "John", "Julia", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
