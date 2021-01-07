package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.i;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableInterval extends g<Long> {
    final y c;
    final long f;
    final long n;
    final TimeUnit o;

    static final class IntervalSubscriber extends AtomicLong implements vpf, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final upf<? super Long> downstream;
        final AtomicReference<b> resource = new AtomicReference<>();

        IntervalSubscriber(upf<? super Long> upf) {
            this.downstream = upf;
        }

        @Override // defpackage.vpf
        public void cancel() {
            DisposableHelper.g(this.resource);
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this, j);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.resource.get() == DisposableHelper.DISPOSED) {
                return;
            }
            if (get() != 0) {
                upf<? super Long> upf = this.downstream;
                long j = this.count;
                this.count = j + 1;
                upf.onNext(Long.valueOf(j));
                yif.G(this, 1);
                return;
            }
            this.downstream.onError(new MissingBackpressureException(je.E0(je.V0("Can't deliver value "), this.count, " due to lack of requests")));
            DisposableHelper.g(this.resource);
        }
    }

    public FlowableInterval(long j, long j2, TimeUnit timeUnit, y yVar) {
        this.f = j;
        this.n = j2;
        this.o = timeUnit;
        this.c = yVar;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super Long> upf) {
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(upf);
        upf.onSubscribe(intervalSubscriber);
        y yVar = this.c;
        if (yVar instanceof i) {
            y.c a = yVar.a();
            DisposableHelper.l(intervalSubscriber.resource, a);
            a.e(intervalSubscriber, this.f, this.n, this.o);
            return;
        }
        DisposableHelper.l(intervalSubscriber.resource, yVar.d(intervalSubscriber, this.f, this.n, this.o));
    }
}
