package io.reactivex.internal.operators.mixed;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.a;
import io.reactivex.n;
import io.reactivex.p;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatMapObservable<T, R> extends s<R> {
    final p<T> a;
    final l<? super T, ? extends v<? extends R>> b;

    static final class FlatMapObserver<T, R> extends AtomicReference<b> implements x<R>, n<T>, b {
        private static final long serialVersionUID = -8948264376121066672L;
        final x<? super R> downstream;
        final l<? super T, ? extends v<? extends R>> mapper;

        FlatMapObserver(x<? super R> xVar, l<? super T, ? extends v<? extends R>> lVar) {
            this.downstream = xVar;
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

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this, bVar);
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            try {
                Object apply = this.mapper.apply(t);
                a.c(apply, "The mapper returned a null Publisher");
                ((v) apply).subscribe(this);
            } catch (Throwable th) {
                yif.V(th);
                this.downstream.onError(th);
            }
        }
    }

    public MaybeFlatMapObservable(p<T> pVar, l<? super T, ? extends v<? extends R>> lVar) {
        this.a = pVar;
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        FlatMapObserver flatMapObserver = new FlatMapObserver(xVar, this.b);
        xVar.onSubscribe(flatMapObserver);
        this.a.subscribe(flatMapObserver);
    }
}
