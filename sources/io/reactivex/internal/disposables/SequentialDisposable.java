package io.reactivex.internal.disposables;

import io.reactivex.disposables.b;
import java.util.concurrent.atomic.AtomicReference;

public final class SequentialDisposable extends AtomicReference<b> implements b {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return DisposableHelper.h((b) get());
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.g(this);
    }

    public SequentialDisposable(b bVar) {
        lazySet(bVar);
    }
}
