package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.h;
import io.reactivex.s;
import io.reactivex.x;

public final class o extends s<Object> implements h<Object> {
    public static final s<Object> a = new o();

    private o() {
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super Object> xVar) {
        xVar.onSubscribe(EmptyDisposable.INSTANCE);
        xVar.onComplete();
    }

    @Override // io.reactivex.internal.fuseable.h, java.util.concurrent.Callable
    public Object call() {
        return null;
    }
}
