package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class c extends a {
    final Throwable a;

    public c(Throwable th) {
        this.a = th;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(io.reactivex.c cVar) {
        Throwable th = this.a;
        cVar.onSubscribe(EmptyDisposable.INSTANCE);
        cVar.onError(th);
    }
}
