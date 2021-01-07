package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.n;
import io.reactivex.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;

public final class z<T> extends a<T, T> {
    final n<? super T> f;

    static final class a<T> implements j<T>, vpf {
        final upf<? super T> a;
        final n<? super T> b;
        vpf c;
        boolean f;

        a(upf<? super T> upf, n<? super T> nVar) {
            this.a = upf;
            this.b = nVar;
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
            if (!this.f) {
                this.f = true;
                this.a.onComplete();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (!this.f) {
                this.f = true;
                this.a.onError(th);
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.f) {
                this.a.onNext(t);
                try {
                    if (this.b.test(t)) {
                        this.f = true;
                        this.c.cancel();
                        this.a.onComplete();
                    }
                } catch (Throwable th) {
                    yif.V(th);
                    this.c.cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.c, vpf)) {
                this.c = vpf;
                this.a.onSubscribe(this);
            }
        }
    }

    public z(g<T> gVar, n<? super T> nVar) {
        super(gVar);
        this.f = nVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new a(upf, this.f));
    }
}
