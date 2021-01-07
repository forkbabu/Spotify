package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class StrictSubscriber<T> extends AtomicInteger implements j<T>, vpf {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final upf<? super T> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicBoolean once = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<vpf> upstream = new AtomicReference<>();

    public StrictSubscriber(upf<? super T> upf) {
        this.downstream = upf;
    }

    @Override // defpackage.vpf
    public void cancel() {
        if (!this.done) {
            SubscriptionHelper.d(this.upstream);
        }
    }

    @Override // defpackage.vpf
    public void n(long j) {
        if (j <= 0) {
            cancel();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(je.t0("§3.9 violated: positive request amount required but it was ", j));
            this.done = true;
            yif.C(this.downstream, illegalArgumentException, this, this.error);
            return;
        }
        SubscriptionHelper.g(this.upstream, this.requested, j);
    }

    @Override // defpackage.upf
    public void onComplete() {
        this.done = true;
        yif.A(this.downstream, this, this.error);
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        this.done = true;
        yif.C(this.downstream, th, this, this.error);
    }

    @Override // defpackage.upf
    public void onNext(T t) {
        yif.E(this.downstream, t, this, this.error);
    }

    @Override // io.reactivex.j, defpackage.upf
    public void onSubscribe(vpf vpf) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.h(this.upstream, this.requested, vpf);
            return;
        }
        vpf.cancel();
        cancel();
        IllegalStateException illegalStateException = new IllegalStateException("§2.12 violated: onSubscribe must be called at most once");
        this.done = true;
        yif.C(this.downstream, illegalStateException, this, this.error);
    }
}
