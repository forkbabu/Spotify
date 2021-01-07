package io.reactivex.internal.subscribers;

import io.reactivex.internal.fuseable.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.c;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicReference;

public final class InnerQueuedSubscriber<T> extends AtomicReference<vpf> implements j<T>, vpf {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final d<T> parent;
    final int prefetch;
    long produced;
    volatile io.reactivex.internal.fuseable.j<T> queue;

    public InnerQueuedSubscriber(d<T> dVar, int i) {
        this.parent = dVar;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    public boolean a() {
        return this.done;
    }

    public io.reactivex.internal.fuseable.j<T> b() {
        return this.queue;
    }

    public void c() {
        if (this.fusionMode != 1) {
            long j = this.produced + 1;
            if (j == ((long) this.limit)) {
                this.produced = 0;
                ((vpf) get()).n(j);
                return;
            }
            this.produced = j;
        }
    }

    @Override // defpackage.vpf
    public void cancel() {
        SubscriptionHelper.d(this);
    }

    public void d() {
        this.done = true;
    }

    @Override // defpackage.vpf
    public void n(long j) {
        if (this.fusionMode != 1) {
            long j2 = this.produced + j;
            if (j2 >= ((long) this.limit)) {
                this.produced = 0;
                ((vpf) get()).n(j2);
                return;
            }
            this.produced = j2;
        }
    }

    @Override // defpackage.upf
    public void onComplete() {
        this.parent.c(this);
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        this.parent.d(this, th);
    }

    @Override // defpackage.upf
    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.b(this, t);
        } else {
            this.parent.a();
        }
    }

    @Override // io.reactivex.j, defpackage.upf
    public void onSubscribe(vpf vpf) {
        if (SubscriptionHelper.k(this, vpf)) {
            long j = Long.MAX_VALUE;
            if (vpf instanceof g) {
                g gVar = (g) vpf;
                int g = gVar.g(3);
                if (g == 1) {
                    this.fusionMode = g;
                    this.queue = gVar;
                    this.done = true;
                    this.parent.c(this);
                    return;
                } else if (g == 2) {
                    this.fusionMode = g;
                    this.queue = gVar;
                    int i = this.prefetch;
                    if (i >= 0) {
                        j = (long) i;
                    }
                    vpf.n(j);
                    return;
                }
            }
            this.queue = c.b(this.prefetch);
            int i2 = this.prefetch;
            if (i2 >= 0) {
                j = (long) i2;
            }
            vpf.n(j);
        }
    }
}
