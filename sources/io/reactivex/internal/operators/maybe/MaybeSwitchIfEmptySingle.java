package io.reactivex.internal.operators.maybe;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeSwitchIfEmptySingle<T> extends z<T> {
    final p<T> a;
    final d0<? extends T> b;

    static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<b> implements n<T>, b {
        private static final long serialVersionUID = 4603919676453758899L;
        final b0<? super T> downstream;
        final d0<? extends T> other;

        static final class a<T> implements b0<T> {
            final b0<? super T> a;
            final AtomicReference<b> b;

            a(b0<? super T> b0Var, AtomicReference<b> atomicReference) {
                this.a = b0Var;
                this.b = atomicReference;
            }

            @Override // io.reactivex.b0
            public void onError(Throwable th) {
                this.a.onError(th);
            }

            @Override // io.reactivex.b0
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this.b, bVar);
            }

            @Override // io.reactivex.b0
            public void onSuccess(T t) {
                this.a.onSuccess(t);
            }
        }

        SwitchIfEmptyMaybeObserver(b0<? super T> b0Var, d0<? extends T> d0Var) {
            this.downstream = b0Var;
            this.other = d0Var;
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
            b bVar = (b) get();
            if (bVar != DisposableHelper.DISPOSED && compareAndSet(bVar, null)) {
                this.other.subscribe(new a(this.downstream, this));
            }
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    public MaybeSwitchIfEmptySingle(p<T> pVar, d0<? extends T> d0Var) {
        this.a = pVar;
        this.b = d0Var;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe(new SwitchIfEmptyMaybeObserver(b0Var, this.b));
    }
}
