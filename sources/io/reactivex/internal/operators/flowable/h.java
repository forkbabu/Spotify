package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.g;
import io.reactivex.functions.m;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;

public final class h<T> extends a<T, T> {
    private final g<? super vpf> f;
    private final m n;
    private final io.reactivex.functions.a o;

    static final class a<T> implements j<T>, vpf {
        final upf<? super T> a;
        final g<? super vpf> b;
        final m c;
        final io.reactivex.functions.a f;
        vpf n;

        a(upf<? super T> upf, g<? super vpf> gVar, m mVar, io.reactivex.functions.a aVar) {
            this.a = upf;
            this.b = gVar;
            this.f = aVar;
            this.c = mVar;
        }

        @Override // defpackage.vpf
        public void cancel() {
            vpf vpf = this.n;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (vpf != subscriptionHelper) {
                this.n = subscriptionHelper;
                try {
                    this.f.run();
                } catch (Throwable th) {
                    yif.V(th);
                    io.reactivex.plugins.a.g(th);
                }
                vpf.cancel();
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            try {
                this.c.a(j);
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(th);
            }
            this.n.n(j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (this.n != SubscriptionHelper.CANCELLED) {
                this.a.onComplete();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.n != SubscriptionHelper.CANCELLED) {
                this.a.onError(th);
            } else {
                io.reactivex.plugins.a.g(th);
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            try {
                this.b.accept(vpf);
                if (SubscriptionHelper.m(this.n, vpf)) {
                    this.n = vpf;
                    this.a.onSubscribe(this);
                }
            } catch (Throwable th) {
                yif.V(th);
                vpf.cancel();
                this.n = SubscriptionHelper.CANCELLED;
                EmptySubscription.h(th, this.a);
            }
        }
    }

    public h(io.reactivex.g<T> gVar, g<? super vpf> gVar2, m mVar, io.reactivex.functions.a aVar) {
        super(gVar);
        this.f = gVar2;
        this.n = mVar;
        this.o = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new a(upf, this.f, this.n, this.o));
    }
}
