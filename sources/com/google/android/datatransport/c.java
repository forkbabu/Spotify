package com.google.android.datatransport;

public abstract class c<T> {
    public static <T> c<T> d(int i, T t) {
        return new a(Integer.valueOf(i), t, Priority.DEFAULT);
    }

    public static <T> c<T> e(int i, T t) {
        return new a(Integer.valueOf(i), t, Priority.VERY_LOW);
    }

    public static <T> c<T> f(T t) {
        return new a(null, t, Priority.VERY_LOW);
    }

    public static <T> c<T> g(T t) {
        return new a(null, t, Priority.HIGHEST);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract Priority c();
}
