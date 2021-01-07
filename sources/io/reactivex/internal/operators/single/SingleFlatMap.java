package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleFlatMap<T, R> extends z<R> {
    final d0<? extends T> a;
    final l<? super T, ? extends d0<? extends R>> b;

    static final class SingleFlatMapCallback<T, R> extends AtomicReference<b> implements b0<T>, b {
        private static final long serialVersionUID = 3258103020495908596L;
        final b0<? super R> downstream;
        final l<? super T, ? extends d0<? extends R>> mapper;

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

        SingleFlatMapCallback(b0<? super R> b0Var, l<? super T, ? extends d0<? extends R>> lVar) {
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
                io.reactivex.internal.functions.a.c(apply, "The single returned by the mapper is null");
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

    public SingleFlatMap(d0<? extends T> d0Var, l<? super T, ? extends d0<? extends R>> lVar) {
        this.b = lVar;
        this.a = d0Var;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super R> b0Var) {
        this.a.subscribe(new SingleFlatMapCallback(b0Var, this.b));
    }
}
