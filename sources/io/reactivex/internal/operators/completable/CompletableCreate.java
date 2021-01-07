package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.d;
import io.reactivex.disposables.b;
import io.reactivex.functions.f;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableCreate extends a {
    final d a;

    static final class Emitter extends AtomicReference<b> implements io.reactivex.b, b {
        private static final long serialVersionUID = -2467358622224974244L;
        final c downstream;

        Emitter(c cVar) {
            this.downstream = cVar;
        }

        @Override // io.reactivex.b, io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.b
        public void e(f fVar) {
            DisposableHelper.k(this, new CancellableDisposable(fVar));
        }

        @Override // io.reactivex.b
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

        @Override // io.reactivex.b
        public void onComplete() {
            b bVar;
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper && (bVar = (b) getAndSet(disposableHelper)) != disposableHelper) {
                try {
                    this.downstream.onComplete();
                } finally {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.b
        public void onError(Throwable th) {
            if (!f(th)) {
                io.reactivex.plugins.a.g(th);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference, java.lang.Object
        public String toString() {
            return String.format("%s{%s}", Emitter.class.getSimpleName(), super.toString());
        }
    }

    public CompletableCreate(d dVar) {
        this.a = dVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        Emitter emitter = new Emitter(cVar);
        cVar.onSubscribe(emitter);
        try {
            this.a.subscribe(emitter);
        } catch (Throwable th) {
            yif.V(th);
            if (!emitter.f(th)) {
                io.reactivex.plugins.a.g(th);
            }
        }
    }
}
