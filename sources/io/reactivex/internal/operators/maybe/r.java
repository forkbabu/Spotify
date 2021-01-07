package io.reactivex.internal.operators.maybe;

import io.reactivex.n;
import io.reactivex.p;

public final class r<T> extends a<T, T> {
    public r(p<T> pVar) {
        super(pVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.a.subscribe(nVar);
    }
}
