package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.e;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

public final class a extends io.reactivex.a {
    final Callable<? extends e> a;

    public a(Callable<? extends e> callable) {
        this.a = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        try {
            Object call = this.a.call();
            io.reactivex.internal.functions.a.c(call, "The completableSupplier returned a null CompletableSource");
            ((e) call).subscribe(cVar);
        } catch (Throwable th) {
            yif.V(th);
            cVar.onSubscribe(EmptyDisposable.INSTANCE);
            cVar.onError(th);
        }
    }
}
