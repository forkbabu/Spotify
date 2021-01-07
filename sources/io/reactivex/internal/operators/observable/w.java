package io.reactivex.internal.operators.observable;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;

public final class w<T> extends s<T> {
    final v<T> a;

    public w(v<T> vVar) {
        this.a = vVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(xVar);
    }
}
