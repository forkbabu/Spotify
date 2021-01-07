package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeTimer extends l<Long> {
    final long a;
    final TimeUnit b;
    final y c;

    static final class TimerDisposable extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;
        final n<? super Long> downstream;

        TimerDisposable(n<? super Long> nVar) {
            this.downstream = nVar;
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
            this.downstream.onSuccess(0L);
        }
    }

    public MaybeTimer(long j, TimeUnit timeUnit, y yVar) {
        this.a = j;
        this.b = timeUnit;
        this.c = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super Long> nVar) {
        TimerDisposable timerDisposable = new TimerDisposable(nVar);
        nVar.onSubscribe(timerDisposable);
        DisposableHelper.i(timerDisposable, this.c.c(timerDisposable, this.a, this.b));
    }
}
