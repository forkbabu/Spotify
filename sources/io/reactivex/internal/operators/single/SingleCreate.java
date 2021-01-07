package io.reactivex.internal.operators.single;

import io.reactivex.a0;
import io.reactivex.b0;
import io.reactivex.c0;
import io.reactivex.disposables.b;
import io.reactivex.functions.f;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.a;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleCreate<T> extends z<T> {
    final c0<T> a;

    static final class Emitter<T> extends AtomicReference<b> implements a0<T>, b {
        private static final long serialVersionUID = -2467358622224974244L;
        final b0<? super T> downstream;

        Emitter(b0<? super T> b0Var) {
            this.downstream = b0Var;
        }

        @Override // io.reactivex.a0, io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.a0
        public void e(f fVar) {
            DisposableHelper.k(this, new CancellableDisposable(fVar));
        }

        @Override // io.reactivex.a0
        public boolean f(Throwable th) {
            b bVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj == disposableHelper || (bVar = (b) getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }

        @Override // io.reactivex.a0
        public void onError(Throwable th) {
            if (!f(th)) {
                a.g(th);
            }
        }

        @Override // io.reactivex.a0
        public void onSuccess(T t) {
            b bVar;
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper && (bVar = (b) getAndSet(disposableHelper)) != disposableHelper) {
                if (t == null) {
                    try {
                        this.downstream.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.downstream.onSuccess(t);
                }
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference, java.lang.Object
        public String toString() {
            return String.format("%s{%s}", Emitter.class.getSimpleName(), super.toString());
        }
    }

    public SingleCreate(c0<T> c0Var) {
        this.a = c0Var;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        Emitter emitter = new Emitter(b0Var);
        b0Var.onSubscribe(emitter);
        try {
            this.a.subscribe(emitter);
        } catch (Throwable th) {
            yif.V(th);
            if (!emitter.f(th)) {
                a.g(th);
            }
        }
    }
}
