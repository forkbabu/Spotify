package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.a;
import io.reactivex.z;
import java.util.concurrent.Callable;

public final class i<T> extends z<T> {
    final Callable<? extends Throwable> a;

    public i(Callable<? extends Throwable> callable) {
        this.a = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        Throwable th;
        try {
            Object call = this.a.call();
            a.c(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th2) {
            th = th2;
            yif.V(th);
        }
        b0Var.onSubscribe(EmptyDisposable.INSTANCE);
        b0Var.onError(th);
    }
}
