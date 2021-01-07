package io.reactivex.observers;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

public abstract class a<T> implements x<T>, b {
    final AtomicReference<b> a = new AtomicReference<>();

    @Override // io.reactivex.disposables.b
    public final boolean d() {
        return this.a.get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        DisposableHelper.g(this.a);
    }

    @Override // io.reactivex.x, io.reactivex.c
    public final void onSubscribe(b bVar) {
        AtomicReference<b> atomicReference = this.a;
        Class<?> cls = getClass();
        if (bVar == null) {
            throw new NullPointerException("next is null");
        } else if (!atomicReference.compareAndSet(null, bVar)) {
            bVar.dispose();
            if (atomicReference.get() != DisposableHelper.DISPOSED) {
                yif.I(cls);
            }
        }
    }
}
