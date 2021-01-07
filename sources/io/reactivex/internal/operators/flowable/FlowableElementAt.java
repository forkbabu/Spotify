package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.NoSuchElementException;

public final class FlowableElementAt<T> extends a<T, T> {
    final long f;
    final T n;
    final boolean o;

    static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements j<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;
        vpf upstream;

        ElementAtSubscriber(upf<? super T> upf, long j, T t, boolean z) {
            super(upf);
            this.index = j;
            this.defaultValue = t;
            this.errorOnFewer = z;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, defpackage.vpf
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                T t = this.defaultValue;
                if (t != null) {
                    a(t);
                } else if (this.errorOnFewer) {
                    this.downstream.onError(new NoSuchElementException());
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.done) {
                a.g(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                long j = this.count;
                if (j == this.index) {
                    this.done = true;
                    this.upstream.cancel();
                    a(t);
                    return;
                }
                this.count = j + 1;
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAt(g<T> gVar, long j, T t, boolean z) {
        super(gVar);
        this.f = j;
        this.n = t;
        this.o = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new ElementAtSubscriber(upf, this.f, this.n, this.o));
    }
}
