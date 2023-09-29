package _08Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library<T> implements Iterable<T> {

    private List<T> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void add(T element) {
        books.add(element);
    }

    public void remove(T element) {
        books.remove(element);
    }

    private class LibraryIterator implements Iterator<T> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public T next() {
            return books.get(index++);
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new LibraryIterator();
    }

}
