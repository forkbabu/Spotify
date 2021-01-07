package io.reactivex.internal.disposables;

import io.reactivex.disposables.b;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ArrayCompositeDisposable extends AtomicReferenceArray<b> implements b {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int i) {
        super(i);
    }

    public boolean a(int i, b bVar) {
        b bVar2;
        do {
            bVar2 = (b) get(i);
            if (bVar2 == DisposableHelper.DISPOSED) {
                bVar.dispose();
                return false;
            }
        } while (!compareAndSet(i, bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return get(0) == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        b bVar;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (get(0) != disposableHelper) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (!(((b) get(i)) == disposableHelper || (bVar = (b) getAndSet(i, disposableHelper)) == disposableHelper || bVar == null)) {
                    bVar.dispose();
                }
            }
        }
    }
}
