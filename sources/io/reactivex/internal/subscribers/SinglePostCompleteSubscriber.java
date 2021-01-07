package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicLong;

public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements j<T>, vpf {
    private static final long serialVersionUID = 7917814472626990048L;
    protected final upf<? super R> downstream;
    protected long produced;
    protected vpf upstream;
    protected R value;

    public SinglePostCompleteSubscriber(upf<? super R> upf) {
        this.downstream = upf;
    }

    /* access modifiers changed from: protected */
    public final void a(R r) {
        long j = this.produced;
        if (j != 0) {
            yif.G(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                b();
                return;
            } else if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r;
                if (!compareAndSet(0, Long.MIN_VALUE)) {
                    this.value = null;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (TR;)V */
    /* access modifiers changed from: protected */
    public void b() {
    }

    @Override // defpackage.vpf
    public void cancel() {
        this.upstream.cancel();
    }

    @Override // defpackage.vpf
    public final void n(long j) {
        long j2;
        if (SubscriptionHelper.l(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, yif.c(j2, j)));
            this.upstream.n(j);
        }
    }

    @Override // io.reactivex.j, defpackage.upf
    public void onSubscribe(vpf vpf) {
        if (SubscriptionHelper.m(this.upstream, vpf)) {
            this.upstream = vpf;
            this.downstream.onSubscribe(this);
        }
    }
}
