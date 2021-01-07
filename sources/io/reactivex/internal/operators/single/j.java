package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.functions.a;
import io.reactivex.z;
import java.util.concurrent.Callable;

public final class j<T> extends z<T> {
    final Callable<? extends T> a;

    public j(Callable<? extends T> callable) {
        this.a = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        b a2 = c.a();
        b0Var.onSubscribe(a2);
        if (!a2.d()) {
            try {
                Object obj = (Object) this.a.call();
                a.c(obj, "The callable returned a null value");
                if (!a2.d()) {
                    b0Var.onSuccess(obj);
                }
            } catch (Throwable th) {
                yif.V(th);
                if (!a2.d()) {
                    b0Var.onError(th);
                } else {
                    io.reactivex.plugins.a.g(th);
                }
            }
        }
    }
}
