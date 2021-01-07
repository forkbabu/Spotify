package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableDelay extends a {
    final e a;
    final long b;
    final TimeUnit c;
    final y f;
    final boolean n;

    static final class Delay extends AtomicReference<b> implements c, Runnable, b {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final c downstream;
        Throwable error;
        final y scheduler;
        final TimeUnit unit;

        Delay(c cVar, long j, TimeUnit timeUnit, y yVar, boolean z) {
            this.downstream = cVar;
            this.delay = j;
            this.unit = timeUnit;
            this.scheduler = yVar;
            this.delayError = z;
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
            DisposableHelper.i(this, this.scheduler.c(this, this.delay, this.unit));
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.i(this, this.scheduler.c(this, this.delayError ? this.delay : 0, this.unit));
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            this.error = null;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public CompletableDelay(e eVar, long j, TimeUnit timeUnit, y yVar, boolean z) {
        this.a = eVar;
        this.b = j;
        this.c = timeUnit;
        this.f = yVar;
        this.n = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(new Delay(cVar, this.b, this.c, this.f, this.n));
    }
}
