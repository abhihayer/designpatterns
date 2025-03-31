package com.designpatterns.iterator;

import java.util.List;

public class ConcreteCustomIterator<T> implements CustomIterator<T> {
    private final List<T> list;
    private final int length;
    private int position = 0;

    public ConcreteCustomIterator(List<T> elements) {
        this.list = elements;
        this.length = list.size();
    }

    @Override
    public boolean hasNext() {
        return position < length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements in the iterator.");
        }
        return list.get(position++);
    }
}
