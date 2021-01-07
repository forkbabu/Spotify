package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;

abstract class ReferenceDisposable<T> extends AtomicReference<T> implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReferenceDisposable(T t) {
        super(t);
        if (t != null) {
            return;
        }
        throw new NullPointerException("value is null");
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    @Override // io.reactivex.disposables.b
    public final boolean d() {
        return get() == null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: io.reactivex.disposables.ReferenceDisposable<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.disposables.b
    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            a(andSet);
        }
    }
}
