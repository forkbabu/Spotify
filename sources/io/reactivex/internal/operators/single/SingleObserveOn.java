package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleObserveOn<T> extends z<T> {
    final d0<T> a;
    final y b;

    static final class ObserveOnSingleObserver<T> extends AtomicReference<b> implements b0<T>, b, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final b0<? super T> downstream;
        Throwable error;
        final y scheduler;
        T value;

        ObserveOnSingleObserver(b0<? super T> b0Var, y yVar) {
            this.downstream = b0Var;
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

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.i(this, this.scheduler.b(this));
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            this.value = t;
            DisposableHelper.i(this, this.scheduler.b(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }
    }

    public SingleObserveOn(d0<T> d0Var, y yVar) {
        this.a = d0Var;
        this.b = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new ObserveOnSingleObserver(b0Var, this.b));
    }
}
