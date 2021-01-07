package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.z;

public final class k<T> extends z<T> {
    final d0<T> a;

    public k(d0<T> d0Var) {
        this.a = d0Var;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(b0Var);
    }
}
