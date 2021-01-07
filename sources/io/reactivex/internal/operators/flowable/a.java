package io.reactivex.internal.operators.flowable;

import io.reactivex.g;

/* access modifiers changed from: package-private */
public abstract class a<T, R> extends g<R> {
    protected final g<T> c;

    a(g<T> gVar) {
        if (gVar != null) {
            this.c = gVar;
            return;
        }
        throw new NullPointerException("source is null");
    }
}
