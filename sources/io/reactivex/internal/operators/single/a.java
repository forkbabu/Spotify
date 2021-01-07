package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.z;
import java.util.concurrent.Callable;

public final class a<T> extends z<T> {
    final Callable<? extends d0<? extends T>> a;

    public a(Callable<? extends d0<? extends T>> callable) {
        this.a = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        try {
            Object call = this.a.call();
            io.reactivex.internal.functions.a.c(call, "The singleSupplier returned a null SingleSource");
            ((d0) call).subscribe(b0Var);
        } catch (Throwable th) {
            yif.V(th);
            b0Var.onSubscribe(EmptyDisposable.INSTANCE);
            b0Var.onError(th);
        }
    }
}
