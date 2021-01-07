package com.google.common.base;

public interface Predicate<T> {
    boolean apply(T t);

    @Override // java.lang.Object
    boolean equals(Object obj);
}
