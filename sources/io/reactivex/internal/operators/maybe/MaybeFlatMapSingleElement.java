package io.reactivex.internal.operators.maybe;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.p;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatMapSingleElement<T, R> extends l<R> {
    final p<T> a;
    final io.reactivex.functions.l<? super T, ? extends d0<? extends R>> b;

    static final class FlatMapMaybeObserver<T, R> extends AtomicReference<b> implements n<T>, b {
        private static final long serialVersionUID = 4827726964688405508L;
        final n<? super R> downstream;
        final io.reactivex.functions.l<? super T, ? extends d0<? extends R>> mapper;

        FlatMapMaybeObserver(n<? super R> nVar, io.reactivex.functions.l<? super T, ? extends d0<? extends R>> lVar) {
            this.downstream = nVar;
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
            this.downstream.onComplete();
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
                ((d0) apply).subscribe(new a(this, this.downstream));
            } catch (Throwable th) {
                yif.V(th);
                onError(th);
            }
        }
    }

    static final class a<R> implements b0<R> {
        final AtomicReference<b> a;
        final n<? super R> b;

        a(AtomicReference<b> atomicReference, n<? super R> nVar) {
            this.a = atomicReference;
            this.b = nVar;
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

    public MaybeFlatMapSingleElement(p<T> pVar, io.reactivex.functions.l<? super T, ? extends d0<? extends R>> lVar) {
        this.a = pVar;
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super R> nVar) {
        this.a.subscribe(new FlatMapMaybeObserver(nVar, this.b));
    }
}
