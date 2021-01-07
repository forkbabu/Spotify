package io.reactivex.internal.operators.maybe;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;
import io.reactivex.z;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatMapSingle<T, R> extends z<R> {
    final p<T> a;
    final l<? super T, ? extends d0<? extends R>> b;

    static final class FlatMapMaybeObserver<T, R> extends AtomicReference<b> implements n<T>, b {
        private static final long serialVersionUID = 4827726964688405508L;
        final b0<? super R> downstream;
        final l<? super T, ? extends d0<? extends R>> mapper;

        FlatMapMaybeObserver(b0<? super R> b0Var, l<? super T, ? extends d0<? extends R>> lVar) {
            this.downstream = b0Var;
            this.mapper = lVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.n
        public void onComplete() {
            this.downstream.onError(new NoSuchElementException());
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            try {
                Object apply = this.mapper.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null SingleSource");
                d0 d0Var = (d0) apply;
                if (!d()) {
                    d0Var.subscribe(new a(this, this.downstream));
                }
            } catch (Throwable th) {
                yif.V(th);
                this.downstream.onError(th);
            }
        }
    }

    static final class a<R> implements b0<R> {
        final AtomicReference<b> a;
        final b0<? super R> b;

        a(AtomicReference<b> atomicReference, b0<? super R> b0Var) {
            this.a = atomicReference;
            this.b = b0Var;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this.a, bVar);
        }

        @Override // io.reactivex.b0
        public void onSuccess(R r) {
            this.b.onSuccess(r);
        }
    }

    public MaybeFlatMapSingle(p<T> pVar, l<? super T, ? extends d0<? extends R>> lVar) {
        this.a = pVar;
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super R> b0Var) {
        this.a.subscribe(new FlatMapMaybeObserver(b0Var, this.b));
    }
}
