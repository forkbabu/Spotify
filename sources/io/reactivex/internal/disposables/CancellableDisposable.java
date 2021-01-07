package io.reactivex.internal.disposables;

import io.reactivex.disposables.b;
import io.reactivex.functions.f;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;

public final class CancellableDisposable extends AtomicReference<f> implements b {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(f fVar) {
        super(fVar);
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return get() == null;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        f fVar;
        if (get() != null && (fVar = (f) getAndSet(null)) != null) {
            try {
                fVar.cancel();
            } catch (Exception e) {
                yif.V(e);
                a.g(e);
            }
        }
    }
}
