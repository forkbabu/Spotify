package io.reactivex.internal.operators.completable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableObserveOn extends a {
    final e a;
    final y b;

    static final class ObserveOnCompletableObserver extends AtomicReference<b> implements c, b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final c downstream;
        Throwable error;
        final y scheduler;

        ObserveOnCompletableObserver(c cVar, y yVar) {
            this.downstream = cVar;
            this.scheduler = yVar;
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
            DisposableHelper.i(this, this.scheduler.b(this));
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.i(this, this.scheduler.b(this));
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
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            this.downstream.onComplete();
        }
    }

    public CompletableObserveOn(e eVar, y yVar) {
        this.a = eVar;
        this.b = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(new ObserveOnCompletableObserver(cVar, this.b));
    }
}
