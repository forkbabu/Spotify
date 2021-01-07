package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeSwitchIfEmpty<T> extends a<T, T> {
    final p<? extends T> b;

    static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<b> implements n<T>, b {
        private static final long serialVersionUID = -2223459372976438024L;
        final n<? super T> downstream;
        final p<? extends T> other;

        static final class a<T> implements n<T> {
            final n<? super T> a;
            final AtomicReference<b> b;

            a(n<? super T> nVar, AtomicReference<b> atomicReference) {
                this.a = nVar;
                this.b = atomicReference;
            }

            @Override // io.reactivex.n
            public void onComplete() {
                this.a.onComplete();
            }

            @Override // io.reactivex.n
            public void onError(Throwable th) {
                this.a.onError(th);
            }

            @Override // io.reactivex.n
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this.b, bVar);
            }

            @Override // io.reactivex.n
            public void onSuccess(T t) {
                this.a.onSuccess(t);
            }
        }

        SwitchIfEmptyMaybeObserver(n<? super T> nVar, p<? extends T> pVar) {
            this.downstream = nVar;
            this.other = pVar;
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

    public MaybeSwitchIfEmpty(p<T> pVar, p<? extends T> pVar2) {
        super(pVar);
        this.b = pVar2;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.a.subscribe(new SwitchIfEmptyMaybeObserver(nVar, this.b));
    }
}
