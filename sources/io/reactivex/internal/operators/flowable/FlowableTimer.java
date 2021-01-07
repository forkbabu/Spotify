package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableTimer extends g<Long> {
    final y c;
    final long f;
    final TimeUnit n;

    static final class TimerSubscriber extends AtomicReference<b> implements vpf, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final upf<? super Long> downstream;
        volatile boolean requested;

        TimerSubscriber(upf<? super Long> upf) {
            this.downstream = upf;
        }

        @Override // defpackage.vpf
        public void cancel() {
            DisposableHelper.g(this);
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                this.requested = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (get() == DisposableHelper.DISPOSED) {
                return;
            }
            if (this.requested) {
                this.downstream.onNext(0L);
                lazySet(emptyDisposable);
                this.downstream.onComplete();
                return;
            }
            lazySet(emptyDisposable);
            this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
        }
    }

    public FlowableTimer(long j, TimeUnit timeUnit, y yVar) {
        this.f = j;
        this.n = timeUnit;
        this.c = yVar;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super Long> upf) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(upf);
        upf.onSubscribe(timerSubscriber);
        DisposableHelper.m(timerSubscriber, this.c.c(timerSubscriber, this.f, this.n));
    }
}
