package io.reactivex.internal.operators.single;

import io.reactivex.a;
import io.reactivex.b0;
import io.reactivex.c;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleFlatMapCompletable<T> extends a {
    final d0<T> a;
    final l<? super T, ? extends e> b;

    static final class FlatMapCompletableObserver<T> extends AtomicReference<b> implements b0<T>, c, b {
        private static final long serialVersionUID = -2177128922851101253L;
        final c downstream;
        final l<? super T, ? extends e> mapper;

        FlatMapCompletableObserver(c cVar, l<? super T, ? extends e> lVar) {
            this.downstream = cVar;
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

        @Override // io.reactivex.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this, bVar);
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            try {
                Object apply = this.mapper.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null CompletableSource");
                e eVar = (e) apply;
                if (!d()) {
                    eVar.subscribe(this);
                }
            } catch (Throwable th) {
                yif.V(th);
                this.downstream.onError(th);
            }
        }
    }

    public SingleFlatMapCompletable(d0<T> d0Var, l<? super T, ? extends e> lVar) {
        this.a = d0Var;
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(cVar, this.b);
        cVar.onSubscribe(flatMapCompletableObserver);
        this.a.subscribe(flatMapCompletableObserver);
    }
}
