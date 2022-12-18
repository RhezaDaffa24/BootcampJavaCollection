package Model;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

public class AbstractClass<E> extends AbstractQueue<E> {
    private E data;

    public AbstractClass() {
        this.data = data;
    }

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(data).iterator();
    }

    @Override
    public int size() {
        return data == null? 0 : 1;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
