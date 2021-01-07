package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;

public final class y<T> extends a<T, T> {
    final long f;

    static final class a<T> implements j<T>, vpf {
        final upf<? super T> a;
        long b;
        vpf c;

        a(upf<? super T> upf, long j) {
            this.a = upf;
            this.b = j;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.c.cancel();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            this.c.n(j);
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
            long j = this.b;
            if (j != 0) {
                this.b = j - 1;
            } else {
                this.a.onNext(t);
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.c, vpf)) {
                long j = this.b;
                this.c = vpf;
                this.a.onSubscribe(this);
                vpf.n(j);
            }
        }
    }

    public y(g<T> gVar, long j) {
        super(gVar);
        this.f = j;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new a(upf, this.f));
    }
}
