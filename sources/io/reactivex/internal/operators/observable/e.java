package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.a;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.Callable;

public final class e<T> extends s<T> {
    final Callable<? extends v<? extends T>> a;

    public e(Callable<? extends v<? extends T>> callable) {
        this.a = callable;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        try {
            Object call = this.a.call();
            a.c(call, "null ObservableSource supplied");
            ((v) call).subscribe(xVar);
        } catch (Throwable th) {
            yif.V(th);
            xVar.onSubscribe(EmptyDisposable.INSTANCE);
            xVar.onError(th);
        }
    }
}
