package io.reactivex.internal.operators.flowable;

import io.reactivex.g;

public final class p<T> extends g<T> {
    final tpf<? extends T> c;

    public p(tpf<? extends T> tpf) {
        this.c = tpf;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe(upf);
    }
}
