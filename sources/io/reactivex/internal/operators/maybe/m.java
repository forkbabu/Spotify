package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.l;
import io.reactivex.n;

public final class m extends l<Object> {
    public static final m a = new m();

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super Object> nVar) {
        nVar.onSubscribe(EmptyDisposable.NEVER);
    }
}
