package io.reactivex.disposables;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;

public final class d implements b {
    final AtomicReference<b> a = new AtomicReference<>();

    public b a() {
        b bVar = this.a.get();
        return bVar == DisposableHelper.DISPOSED ? EmptyDisposable.INSTANCE : bVar;
    }

    public boolean b(b bVar) {
        return DisposableHelper.k(this.a, bVar);
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return DisposableHelper.h(this.a.get());
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.g(this.a);
    }
}
