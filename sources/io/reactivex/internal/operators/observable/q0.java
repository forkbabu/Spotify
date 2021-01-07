package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.v;
import io.reactivex.x;

public final class q0<T> extends a<T, T> {
    final v<? extends T> b;

    static final class a<T> implements x<T> {
        final x<? super T> a;
        final v<? extends T> b;
        final SequentialDisposable c = new SequentialDisposable();
        boolean f = true;

        a(x<? super T> xVar, v<? extends T> vVar) {
            this.a = xVar;
            this.b = vVar;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (this.f) {
                this.f = false;
                this.b.subscribe(this);
                return;
            }
            this.a.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (this.f) {
                this.f = false;
            }
            this.a.onNext(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.k(this.c, bVar);
        }
    }

    public q0(v<T> vVar, v<? extends T> vVar2) {
        super(vVar);
        this.b = vVar2;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        a aVar = new a(xVar, this.b);
        xVar.onSubscribe(aVar.c);
        this.a.subscribe(aVar);
    }
}
