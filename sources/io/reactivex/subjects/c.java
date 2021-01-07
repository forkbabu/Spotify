package io.reactivex.subjects;

import io.reactivex.s;
import io.reactivex.x;

public abstract class c<T> extends s<T> implements x<T> {
    public final c<T> g1() {
        if (this instanceof b) {
            return this;
        }
        return new b(this);
    }
}
