package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.s;
import io.reactivex.x;

public final class v<T> extends s<T> {
    final tpf<? extends T> a;

    static final class a<T> implements j<T>, b {
        final x<? super T> a;
        vpf b;

        a(x<? super T> xVar) {
            this.a = xVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.b == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.b.cancel();
            this.b = SubscriptionHelper.CANCELLED;
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.b, vpf)) {
                this.b = vpf;
                this.a.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public v(tpf<? extends T> tpf) {
        this.a = tpf;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(xVar));
    }
}
