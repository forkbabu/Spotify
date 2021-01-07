package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableTimer extends a {
    final long a;
    final TimeUnit b;
    final y c;

    static final class TimerDisposable extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;
        final c downstream;

        TimerDisposable(c cVar) {
            this.downstream = cVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.downstream.onComplete();
        }
    }

    public CompletableTimer(long j, TimeUnit timeUnit, y yVar) {
        this.a = j;
        this.b = timeUnit;
        this.c = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        TimerDisposable timerDisposable = new TimerDisposable(cVar);
        cVar.onSubscribe(timerDisposable);
        DisposableHelper.i(timerDisposable, this.c.c(timerDisposable, this.a, this.b));
    }
}
