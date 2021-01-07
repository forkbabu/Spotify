package com.spotify.loginflow;

public class p<T> {
    private final T a;
    private boolean b;

    public p(T t) {
        this.a = t;
    }

    public T a() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}
