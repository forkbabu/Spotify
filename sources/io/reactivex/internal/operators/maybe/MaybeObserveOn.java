package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeObserveOn<T> extends a<T, T> {
    final y b;

    static final class ObserveOnMaybeObserver<T> extends AtomicReference<b> implements n<T>, b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final n<? super T> downstream;
        Throwable error;
        final y scheduler;
        T value;

        ObserveOnMaybeObserver(n<? super T> nVar, y yVar) {
            this.downstream = nVar;
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

        @Override // io.reactivex.n
        public void onComplete() {
            DisposableHelper.i(this, this.scheduler.b(this));
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.i(this, this.scheduler.b(this));
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            this.value = t;
            DisposableHelper.i(this, this.scheduler.b(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            T t = this.value;
            if (t != null) {
                this.value = null;
                this.downstream.onSuccess(t);
                return;
            }
            this.downstream.onComplete();
        }
    }

    public MaybeObserveOn(p<T> pVar, y yVar) {
        super(pVar);
        this.b = yVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.a.subscribe(new ObserveOnMaybeObserver(nVar, this.b));
    }
}
