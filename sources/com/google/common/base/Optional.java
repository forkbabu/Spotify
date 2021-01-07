package com.google.common.base;

import java.io.Serializable;

public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    Optional() {
    }

    public static <T> Optional<T> absent() {
        return Absent.INSTANCE;
    }

    public static <T> Optional<T> fromNullable(T t) {
        return t == null ? Absent.INSTANCE : new Present(t);
    }

    public static <T> Optional<T> of(T t) {
        t.getClass();
        return new Present(t);
    }

    @Override // java.lang.Object
    public abstract boolean equals(Object obj);

    public abstract T get();

    @Override // java.lang.Object
    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(Supplier<? extends T> supplier);

    public abstract T or(T t);

    public abstract T orNull();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
