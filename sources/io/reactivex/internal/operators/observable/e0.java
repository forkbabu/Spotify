package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.x;

public final class e0 extends s<Object> {
    public static final s<Object> a = new e0();

    private e0() {
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super Object> xVar) {
        xVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
