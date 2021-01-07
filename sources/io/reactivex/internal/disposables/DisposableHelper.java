package io.reactivex.internal.disposables;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;

public enum DisposableHelper implements b {
    DISPOSED;

    public static boolean g(AtomicReference<b> atomicReference) {
        b andSet;
        b bVar = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (bVar == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean h(b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean i(AtomicReference<b> atomicReference, b bVar) {
        b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        return true;
    }

    public static boolean k(AtomicReference<b> atomicReference, b bVar) {
        b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    public static boolean l(AtomicReference<b> atomicReference, b bVar) {
        if (bVar == null) {
            throw new NullPointerException("d is null");
        } else if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        } else {
            bVar.dispose();
            if (atomicReference.get() == DISPOSED) {
                return false;
            }
            a.g(new ProtocolViolationException("Disposable already set!"));
            return false;
        }
    }

    public static boolean m(AtomicReference<b> atomicReference, b bVar) {
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.dispose();
        return false;
    }

    public static boolean n(b bVar, b bVar2) {
        if (bVar2 == null) {
            a.g(new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.dispose();
            a.g(new ProtocolViolationException("Disposable already set!"));
            return false;
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return true;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
    }
}
