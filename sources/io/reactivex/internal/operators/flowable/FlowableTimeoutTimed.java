package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableTimeoutTimed<T> extends a<T, T> {
    final long f;
    final TimeUnit n;
    final y o;
    final tpf<? extends T> p;

    static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements j<T>, b {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final upf<? super T> downstream;
        tpf<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<vpf> upstream = new AtomicReference<>();
        final y.c worker;

        TimeoutFallbackSubscriber(upf<? super T> upf, long j, TimeUnit timeUnit, y.c cVar, tpf<? extends T> tpf) {
            super(true);
            this.downstream = upf;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = tpf;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.b
        public void a(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.d(this.upstream);
                long j2 = this.consumed;
                if (j2 != 0) {
                    f(j2);
                }
                tpf<? extends T> tpf = this.fallback;
                this.fallback = null;
                tpf.subscribe(new a(this.downstream, this));
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, defpackage.vpf
        public void cancel() {
            super.cancel();
            this.worker.dispose();
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.index.compareAndSet(j, j2)) {
                    ((io.reactivex.disposables.b) this.task.get()).dispose();
                    this.consumed++;
                    this.downstream.onNext(t);
                    DisposableHelper.i(this.task, this.worker.c(new c(j2, this), this.timeout, this.unit));
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.k(this.upstream, vpf)) {
                g(vpf);
            }
        }
    }

    static final class TimeoutSubscriber<T> extends AtomicLong implements j<T>, vpf, b {
        private static final long serialVersionUID = 3764492702657003550L;
        final upf<? super T> downstream;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<vpf> upstream = new AtomicReference<>();
        final y.c worker;

        TimeoutSubscriber(upf<? super T> upf, long j, TimeUnit timeUnit, y.c cVar) {
            this.downstream = upf;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.b
        public void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.d(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.d(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            SubscriptionHelper.d(this.upstream);
            this.worker.dispose();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            SubscriptionHelper.g(this.upstream, this.requested, j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.g(this.task);
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((io.reactivex.disposables.b) this.task.get()).dispose();
                    this.downstream.onNext(t);
                    DisposableHelper.i(this.task, this.worker.c(new c(j2, this), this.timeout, this.unit));
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            SubscriptionHelper.h(this.upstream, this.requested, vpf);
        }
    }

    static final class a<T> implements j<T> {
        final upf<? super T> a;
        final SubscriptionArbiter b;

        a(upf<? super T> upf, SubscriptionArbiter subscriptionArbiter) {
            this.a = upf;
            this.b = subscriptionArbiter;
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
            this.a.onNext(t);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            this.b.g(vpf);
        }
    }

    interface b {
        void a(long j);
    }

    static final class c implements Runnable {
        final b a;
        final long b;

        c(long j, b bVar) {
            this.b = j;
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b);
        }
    }

    public FlowableTimeoutTimed(g<T> gVar, long j, TimeUnit timeUnit, y yVar, tpf<? extends T> tpf) {
        super(gVar);
        this.f = j;
        this.n = timeUnit;
        this.o = yVar;
        this.p = tpf;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        if (this.p == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(upf, this.f, this.n, this.o.a());
            upf.onSubscribe(timeoutSubscriber);
            DisposableHelper.i(timeoutSubscriber.task, timeoutSubscriber.worker.c(new c(0, timeoutSubscriber), timeoutSubscriber.timeout, timeoutSubscriber.unit));
            this.c.subscribe((j) timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(upf, this.f, this.n, this.o.a(), this.p);
        upf.onSubscribe(timeoutFallbackSubscriber);
        DisposableHelper.i(timeoutFallbackSubscriber.task, timeoutFallbackSubscriber.worker.c(new c(0, timeoutFallbackSubscriber), timeoutFallbackSubscriber.timeout, timeoutFallbackSubscriber.unit));
        this.c.subscribe((j) timeoutFallbackSubscriber);
    }
}
