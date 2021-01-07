package io.reactivex.internal.operators.maybe;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.p;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeDelayWithCompletable<T> extends l<T> {
    final p<T> a;
    final e b;

    static final class OtherObserver<T> extends AtomicReference<b> implements c, b {
        private static final long serialVersionUID = 703409937383992161L;
        final n<? super T> downstream;
        final p<T> source;

        OtherObserver(n<? super T> nVar, p<T> pVar) {
            this.downstream = nVar;
            this.source = pVar;
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
            this.source.subscribe(new a(this, this.downstream));
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    static final class a<T> implements n<T> {
        final AtomicReference<b> a;
        final n<? super T> b;

        a(AtomicReference<b> atomicReference, n<? super T> nVar) {
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
        public void onSuccess(T t) {
            this.b.onSuccess(t);
        }
    }

    public MaybeDelayWithCompletable(p<T> pVar, e eVar) {
        this.a = pVar;
        this.b = eVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.b.subscribe(new OtherObserver(nVar, this.a));
    }
}
