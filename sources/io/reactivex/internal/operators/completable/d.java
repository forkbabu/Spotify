package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;

public final class d extends a {
    final io.reactivex.functions.a a;

    public d(io.reactivex.functions.a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        b a2 = io.reactivex.disposables.c.a();
        cVar.onSubscribe(a2);
        try {
            this.a.run();
            if (!a2.d()) {
                cVar.onComplete();
            }
        } catch (Throwable th) {
            yif.V(th);
            if (!a2.d()) {
                cVar.onError(th);
            } else {
                io.reactivex.plugins.a.g(th);
            }
        }
    }
}
