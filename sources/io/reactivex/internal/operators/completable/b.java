package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class b extends a {
    public static final a a = new b();

    private b() {
    }

    @Override // io.reactivex.a
    public void F(c cVar) {
        cVar.onSubscribe(EmptyDisposable.INSTANCE);
        cVar.onComplete();
    }
}
