package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.z;

public final class n extends z<Object> {
    public static final z<Object> a = new n();

    private n() {
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super Object> b0Var) {
        b0Var.onSubscribe(EmptyDisposable.NEVER);
    }
}
