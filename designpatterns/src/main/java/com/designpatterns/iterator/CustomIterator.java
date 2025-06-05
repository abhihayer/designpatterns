package com.designpatterns.iterator;

import java.util.Iterator;

public interface CustomIterator<T> extends Iterator<T> {
    // No need to redefine hasNext() and next(), since Iterator<T> already provides them.
}

