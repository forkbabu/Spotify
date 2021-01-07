package io.reactivex.internal.operators.completable;

import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.observers.j;

public final class o<T> extends g<T> {
    final e c;

    public o(e eVar) {
        this.c = eVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe(new j(upf));
    }
}
