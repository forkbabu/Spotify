package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableTakeUntil<T, U> extends a<T, T> {
    final v<? extends U> b;

    static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements x<T>, b {
        private static final long serialVersionUID = 1418547743690811973L;
        final x<? super T> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final TakeUntilMainObserver<T, U>.OtherObserver otherObserver = new OtherObserver();
        final AtomicReference<b> upstream = new AtomicReference<>();

        final class OtherObserver extends AtomicReference<b> implements x<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            OtherObserver() {
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onComplete() {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.g(takeUntilMainObserver.upstream);
                yif.z(takeUntilMainObserver.downstream, takeUntilMainObserver, takeUntilMainObserver.error);
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onError(Throwable th) {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.g(takeUntilMainObserver.upstream);
                yif.B(takeUntilMainObserver.downstream, th, takeUntilMainObserver, takeUntilMainObserver.error);
            }

            @Override // io.reactivex.x
            public void onNext(U u) {
                DisposableHelper.g(this);
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.g(takeUntilMainObserver.upstream);
                yif.z(takeUntilMainObserver.downstream, takeUntilMainObserver, takeUntilMainObserver.error);
            }

            @Override // io.reactivex.x, io.reactivex.c
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this, bVar);
            }
        }

        TakeUntilMainObserver(x<? super T> xVar) {
            this.downstream = xVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h(this.upstream.get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this.upstream);
            DisposableHelper.g(this.otherObserver);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            DisposableHelper.g(this.otherObserver);
            yif.z(this.downstream, this, this.error);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            DisposableHelper.g(this.otherObserver);
            yif.B(this.downstream, th, this, this.error);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            yif.D(this.downstream, t, this, this.error);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this.upstream, bVar);
        }
    }

    public ObservableTakeUntil(v<T> vVar, v<? extends U> vVar2) {
        super(vVar);
        this.b = vVar2;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(xVar);
        xVar.onSubscribe(takeUntilMainObserver);
        this.b.subscribe(takeUntilMainObserver.otherObserver);
        this.a.subscribe(takeUntilMainObserver);
    }
}
