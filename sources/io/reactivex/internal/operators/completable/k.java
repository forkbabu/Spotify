package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class k extends a {
    public static final a a = new k();

    private k() {
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        cVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
