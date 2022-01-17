package collection;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

/**
 * Abstract Collection
 * Consider extend to AbstractQueue as it is less to implement method
 * than implement using MainClass of Queue (Queue<E>)
 */
public class SingleQueue<E> extends AbstractQueue<E> {

    private E data;

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(data).iterator();
    }

    @Override
    public int size() {
        return data == null ? 0 : 1;
    }

    @Override
    public boolean offer(E e) {
        // if data is empty, set e to data
        if (data == null) {
            data = e;
            return true;
        }
        return false; // cannot be added, because data is exists
    }

    @Override
    public E poll() {
        E temp = data;
        data = null;
        return temp;
    }

    @Override
    public E peek() {
        return data;
    }
}
