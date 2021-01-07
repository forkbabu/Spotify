package io.reactivex.internal.operators.flowable;

import io.reactivex.c;
import io.reactivex.g;
import io.reactivex.internal.fuseable.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;

public final class r<T> extends io.reactivex.a implements b<T> {
    final g<T> a;

    static final class a<T> implements j<T>, io.reactivex.disposables.b {
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
            this.b = SubscriptionHelper.CANCELLED;
            this.a.onComplete();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.b = SubscriptionHelper.CANCELLED;
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

    public r(g<T> gVar) {
        this.a = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe((j) new a(cVar));
    }

    @Override // io.reactivex.internal.fuseable.b
    public g<T> c() {
        return new q(this.a);
    }
}
