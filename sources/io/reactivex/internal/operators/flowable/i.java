package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.fuseable.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.l;
import io.reactivex.n;

public final class i<T> extends l<T> implements b<T> {
    final g<T> a;
    final long b;

    static final class a<T> implements j<T>, io.reactivex.disposables.b {
        final n<? super T> a;
        final long b;
        vpf c;
        long f;
        boolean n;

        a(n<? super T> nVar, long j) {
            this.a = nVar;
            this.b = j;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c.cancel();
            this.c = SubscriptionHelper.CANCELLED;
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.c = SubscriptionHelper.CANCELLED;
            if (!this.n) {
                this.n = true;
                this.a.onComplete();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.n) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.n = true;
            this.c = SubscriptionHelper.CANCELLED;
            this.a.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.n) {
                long j = this.f;
                if (j == this.b) {
                    this.n = true;
                    this.c.cancel();
                    this.c = SubscriptionHelper.CANCELLED;
                    this.a.onSuccess(t);
                    return;
                }
                this.f = j + 1;
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.c, vpf)) {
                this.c = vpf;
                this.a.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public i(g<T> gVar, long j) {
        this.a = gVar;
        this.b = j;
    }

    @Override // io.reactivex.internal.fuseable.b
    public g<T> c() {
        return new FlowableElementAt(this.a, this.b, null, false);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.a.subscribe((j) new a(nVar, this.b));
    }
}
