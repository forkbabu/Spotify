package io.reactivex.internal.operators.mixed;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableAndThenObservable<R> extends s<R> {
    final e a;
    final v<? extends R> b;

    static final class AndThenObservableObserver<R> extends AtomicReference<b> implements x<R>, c, b {
        private static final long serialVersionUID = -8948264376121066672L;
        final x<? super R> downstream;
        v<? extends R> other;

        AndThenObservableObserver(x<? super R> xVar, v<? extends R> vVar) {
            this.other = vVar;
            this.downstream = xVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            v<? extends R> vVar = this.other;
            if (vVar == null) {
                this.downstream.onComplete();
                return;
            }
            this.other = null;
            vVar.subscribe(this);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.i(this, bVar);
        }
    }

    public CompletableAndThenObservable(e eVar, v<? extends R> vVar) {
        this.a = eVar;
        this.b = vVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        AndThenObservableObserver andThenObservableObserver = new AndThenObservableObserver(xVar, this.b);
        xVar.onSubscribe(andThenObservableObserver);
        this.a.subscribe(andThenObservableObserver);
    }
}
