package io.reactivex.processors;

import io.reactivex.g;
import io.reactivex.j;

public abstract class a<T> extends g<T> implements Object<T, T>, j<T>, j {
    public final a<T> q0() {
        if (this instanceof b) {
            return this;
        }
        return new b(this);
    }
}
