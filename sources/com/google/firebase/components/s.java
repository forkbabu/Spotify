package com.google.firebase.components;

public class s<T> implements t10<T> {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile t10<T> b;

    public s(t10<T> t10) {
        this.b = t10;
    }

    @Override // defpackage.t10
    public T get() {
        T t = (T) this.a;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = this.a;
                if (t == obj) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
