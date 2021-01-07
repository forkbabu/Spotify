package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.h;
import io.reactivex.l;
import io.reactivex.n;

public final class b extends l<Object> implements h<Object> {
    public static final b a = new b();

    @Override // io.reactivex.internal.fuseable.h, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super Object> nVar) {
        nVar.onSubscribe(EmptyDisposable.INSTANCE);
        nVar.onComplete();
    }
}
