package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.subscribers.b;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableSampleTimed<T> extends a<T, T> {
    final long f;
    final TimeUnit n;
    final y o;
    final boolean p;

    static final class SampleTimedEmitLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip = new AtomicInteger(1);

        SampleTimedEmitLast(upf<? super T> upf, long j, TimeUnit timeUnit, y yVar) {
            super(upf, j, timeUnit, yVar);
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        public void a() {
            b();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                b();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }

    static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(upf<? super T> upf, long j, TimeUnit timeUnit, y yVar) {
            super(upf, j, timeUnit, yVar);
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        public void a() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
        }
    }

    static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements j<T>, vpf, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final upf<? super T> downstream;
        final long period;
        final AtomicLong requested = new AtomicLong();
        final y scheduler;
        final SequentialDisposable timer = new SequentialDisposable();
        final TimeUnit unit;
        vpf upstream;

        SampleTimedSubscriber(upf<? super T> upf, long j, TimeUnit timeUnit, y yVar) {
            this.downstream = upf;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = yVar;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: package-private */
        public void b() {
            Object andSet = getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (this.requested.get() != 0) {
                this.downstream.onNext(andSet);
                yif.G(this.requested, 1);
                return;
            }
            cancel();
            this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
        }

        @Override // defpackage.vpf
        public void cancel() {
            DisposableHelper.g(this.timer);
            this.upstream.cancel();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            DisposableHelper.g(this.timer);
            a();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            DisposableHelper.g(this.timer);
            this.downstream.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
                SequentialDisposable sequentialDisposable = this.timer;
                y yVar = this.scheduler;
                long j = this.period;
                DisposableHelper.i(sequentialDisposable, yVar.d(this, j, j, this.unit));
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSampleTimed(g<T> gVar, long j, TimeUnit timeUnit, y yVar, boolean z) {
        super(gVar);
        this.f = j;
        this.n = timeUnit;
        this.o = yVar;
        this.p = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        b bVar = new b(upf);
        if (this.p) {
            this.c.subscribe((j) new SampleTimedEmitLast(bVar, this.f, this.n, this.o));
        } else {
            this.c.subscribe((j) new SampleTimedNoLast(bVar, this.f, this.n, this.o));
        }
    }
}
