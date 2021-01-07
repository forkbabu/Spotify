package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.p;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleFlatMapMaybe<T, R> extends l<R> {
    final d0<? extends T> a;
    final io.reactivex.functions.l<? super T, ? extends p<? extends R>> b;

    static final class FlatMapSingleObserver<T, R> extends AtomicReference<b> implements b0<T>, b {
        private static final long serialVersionUID = -5843758257109742742L;
        final n<? super R> downstream;
        final io.reactivex.functions.l<? super T, ? extends p<? extends R>> mapper;

        FlatMapSingleObserver(n<? super R> nVar, io.reactivex.functions.l<? super T, ? extends p<? extends R>> lVar) {
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

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            try {
                Object apply = this.mapper.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null MaybeSource");
                p pVar = (p) apply;
                if (!d()) {
                    pVar.subscribe(new a(this, this.downstream));
                }
            } catch (Throwable th) {
                yif.V(th);
                this.downstream.onError(th);
            }
        }
    }

    static final class a<R> implements n<R> {
        final AtomicReference<b> a;
        final n<? super R> b;

        a(AtomicReference<b> atomicReference, n<? super R> nVar) {
            this.a = atomicReference;
            this.b = nVar;
        }

        @Override // io.reactivex.n
        public void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this.a, bVar);
        }

        @Override // io.reactivex.n
        public void onSuccess(R r) {
            this.b.onSuccess(r);
        }
    }

    public SingleFlatMapMaybe(d0<? extends T> d0Var, io.reactivex.functions.l<? super T, ? extends p<? extends R>> lVar) {
        this.b = lVar;
        this.a = d0Var;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super R> nVar) {
        this.a.subscribe(new FlatMapSingleObserver(nVar, this.b));
    }
}
