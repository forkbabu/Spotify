package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.functions.f;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l;
import io.reactivex.m;
import io.reactivex.n;
import io.reactivex.o;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeCreate<T> extends l<T> {
    final o<T> a;

    static final class Emitter<T> extends AtomicReference<b> implements m<T>, b {
        private static final long serialVersionUID = -2467358622224974244L;
        final n<? super T> downstream;

        Emitter(n<? super T> nVar) {
            this.downstream = nVar;
        }

        @Override // io.reactivex.m, io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.m
        public void e(f fVar) {
            DisposableHelper.k(this, new CancellableDisposable(fVar));
        }

        @Override // io.reactivex.m
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

        @Override // io.reactivex.m
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

    public MaybeCreate(o<T> oVar) {
        this.a = oVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        boolean z;
        b bVar;
        Emitter emitter = new Emitter(nVar);
        nVar.onSubscribe(emitter);
        try {
            this.a.subscribe(emitter);
        } catch (Throwable th) {
            if (bVar != null) {
                bVar.dispose();
            }
            throw th;
        }
    }
}
