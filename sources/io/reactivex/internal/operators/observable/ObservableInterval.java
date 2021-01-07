package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.i;
import io.reactivex.s;
import io.reactivex.x;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableInterval extends s<Long> {
    final y a;
    final long b;
    final long c;
    final TimeUnit f;

    static final class IntervalObserver extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
        final x<? super Long> downstream;

        IntervalObserver(x<? super Long> xVar) {
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
            if (get() != DisposableHelper.DISPOSED) {
                x<? super Long> xVar = this.downstream;
                long j = this.count;
                this.count = 1 + j;
                xVar.onNext(Long.valueOf(j));
            }
        }
    }

    public ObservableInterval(long j, long j2, TimeUnit timeUnit, y yVar) {
        this.b = j;
        this.c = j2;
        this.f = timeUnit;
        this.a = yVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super Long> xVar) {
        IntervalObserver intervalObserver = new IntervalObserver(xVar);
        xVar.onSubscribe(intervalObserver);
        y yVar = this.a;
        if (yVar instanceof i) {
            y.c a2 = yVar.a();
            DisposableHelper.l(intervalObserver, a2);
            a2.e(intervalObserver, this.b, this.c, this.f);
            return;
        }
        DisposableHelper.l(intervalObserver, yVar.d(intervalObserver, this.b, this.c, this.f));
    }
}
