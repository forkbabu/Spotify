package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.c;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.i;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleDelayWithCompletable<T> extends z<T> {
    final d0<T> a;
    final e b;

    static final class OtherObserver<T> extends AtomicReference<b> implements c, b {
        private static final long serialVersionUID = -8565274649390031272L;
        final b0<? super T> downstream;
        final d0<T> source;

        OtherObserver(b0<? super T> b0Var, d0<T> d0Var) {
            this.downstream = b0Var;
            this.source = d0Var;
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
            this.source.subscribe(new i(this, this.downstream));
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    public SingleDelayWithCompletable(d0<T> d0Var, e eVar) {
        this.a = d0Var;
        this.b = eVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.b.subscribe(new OtherObserver(b0Var, this.a));
    }
}
