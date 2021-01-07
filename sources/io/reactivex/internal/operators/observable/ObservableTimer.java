package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.x;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableTimer extends s<Long> {
    final y a;
    final long b;
    final TimeUnit c;

    static final class TimerObserver extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final x<? super Long> downstream;

        TimerObserver(x<? super Long> xVar) {
            this.downstream = xVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!d()) {
                this.downstream.onNext(0L);
                lazySet(EmptyDisposable.INSTANCE);
                this.downstream.onComplete();
            }
        }
    }

    public ObservableTimer(long j, TimeUnit timeUnit, y yVar) {
        this.b = j;
        this.c = timeUnit;
        this.a = yVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super Long> xVar) {
        TimerObserver timerObserver = new TimerObserver(xVar);
        xVar.onSubscribe(timerObserver);
        DisposableHelper.m(timerObserver, this.a.c(timerObserver, this.b, this.c));
    }
}
