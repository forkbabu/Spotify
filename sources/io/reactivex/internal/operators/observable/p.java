package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.a;
import io.reactivex.s;
import io.reactivex.x;
import java.util.concurrent.Callable;

public final class p<T> extends s<T> {
    final Callable<? extends Throwable> a;

    public p(Callable<? extends Throwable> callable) {
        this.a = callable;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        Throwable th;
        try {
            Object call = this.a.call();
            a.c(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th2) {
            th = th2;
            yif.V(th);
        }
        xVar.onSubscribe(EmptyDisposable.INSTANCE);
        xVar.onError(th);
    }
}
