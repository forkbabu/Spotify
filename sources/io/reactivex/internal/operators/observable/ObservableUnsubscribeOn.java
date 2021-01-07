package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.v;
import io.reactivex.x;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ObservableUnsubscribeOn<T> extends a<T, T> {
    final y b;

    static final class UnsubscribeObserver<T> extends AtomicBoolean implements x<T>, b {
        private static final long serialVersionUID = 1015244841293359600L;
        final x<? super T> downstream;
        final y scheduler;
        b upstream;

        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeObserver.this.upstream.dispose();
            }
        }

        UnsubscribeObserver(x<? super T> xVar, y yVar) {
            this.downstream = xVar;
            this.scheduler = yVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.scheduler.b(new a());
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (get()) {
                io.reactivex.plugins.a.g(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!get()) {
                this.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableUnsubscribeOn(v<T> vVar, y yVar) {
        super(vVar);
        this.b = yVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new UnsubscribeObserver(xVar, this.b));
    }
}
