package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.c;
import io.reactivex.g;
import io.reactivex.internal.fuseable.i;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableScanSeed<T, R> extends a<T, R> {
    final c<R, ? super T, R> f;
    final Callable<R> n;

    static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements j<T>, vpf {
        private static final long serialVersionUID = -1776795561228106469L;
        final c<R, ? super T, R> accumulator;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final upf<? super R> downstream;
        Throwable error;
        final int limit;
        final int prefetch;
        final i<R> queue;
        final AtomicLong requested = new AtomicLong();
        vpf upstream;
        R value;

        ScanSeedSubscriber(upf<? super R> upf, c<R, ? super T, R> cVar, R r, int i) {
            this.downstream = upf;
            this.accumulator = cVar;
            this.value = r;
            this.prefetch = i;
            this.limit = i - (i >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i);
            this.queue = spscArrayQueue;
            spscArrayQueue.offer(r);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            Throwable th;
            if (getAndIncrement() == 0) {
                upf<? super R> upf = this.downstream;
                i<R> iVar = this.queue;
                int i = this.limit;
                int i2 = this.consumed;
                int i3 = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.cancelled) {
                            iVar.clear();
                            return;
                        }
                        boolean z = this.done;
                        if (!z || (th = this.error) == null) {
                            R poll = iVar.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                upf.onComplete();
                                return;
                            } else if (z2) {
                                break;
                            } else {
                                upf.onNext(poll);
                                j2++;
                                i2++;
                                if (i2 == i) {
                                    this.upstream.n((long) i);
                                    i2 = 0;
                                }
                            }
                        } else {
                            iVar.clear();
                            upf.onError(th);
                            return;
                        }
                    }
                    if (j2 == j && this.done) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            iVar.clear();
                            upf.onError(th2);
                            return;
                        } else if (iVar.isEmpty()) {
                            upf.onComplete();
                            return;
                        }
                    }
                    if (j2 != 0) {
                        yif.G(this.requested, j2);
                    }
                    this.consumed = i2;
                    i3 = addAndGet(-i3);
                } while (i3 != 0);
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
                a();
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                a();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.done) {
                a.g(th);
                return;
            }
            this.error = th;
            this.done = true;
            a();
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                try {
                    R a = this.accumulator.a(this.value, t);
                    io.reactivex.internal.functions.a.c(a, "The accumulator returned a null value");
                    this.value = a;
                    this.queue.offer(a);
                    a();
                } catch (Throwable th) {
                    yif.V(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
                vpf.n((long) (this.prefetch - 1));
            }
        }
    }

    public FlowableScanSeed(g<T> gVar, Callable<R> callable, c<R, ? super T, R> cVar) {
        super(gVar);
        this.f = cVar;
        this.n = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        try {
            R call = this.n.call();
            io.reactivex.internal.functions.a.c(call, "The seed supplied is null");
            this.c.subscribe((j) new ScanSeedSubscriber(upf, this.f, call, g.g()));
        } catch (Throwable th) {
            yif.V(th);
            upf.onSubscribe(EmptySubscription.INSTANCE);
            upf.onError(th);
        }
    }
}
