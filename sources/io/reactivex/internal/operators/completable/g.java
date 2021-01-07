package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;

public final class g<T> extends io.reactivex.a {
    final tpf<T> a;

    static final class a<T> implements j<T>, b {
        final c a;
        vpf b;

        a(c cVar) {
            this.a = cVar;
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

    public g(tpf<T> tpf) {
        this.a = tpf;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(new a(cVar));
    }
}
