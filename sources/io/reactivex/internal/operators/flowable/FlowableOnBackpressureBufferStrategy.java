package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.a;
import io.reactivex.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableOnBackpressureBufferStrategy<T> extends a<T, T> {
    final long f;
    final a n;
    final BackpressureOverflowStrategy o;

    static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements j<T>, vpf {
        private static final long serialVersionUID = 3240706908776709697L;
        final long bufferSize;
        volatile boolean cancelled;
        final Deque<T> deque = new ArrayDeque();
        volatile boolean done;
        final upf<? super T> downstream;
        Throwable error;
        final a onOverflow;
        final AtomicLong requested = new AtomicLong();
        final BackpressureOverflowStrategy strategy;
        vpf upstream;

        OnBackpressureBufferStrategySubscriber(upf<? super T> upf, a aVar, BackpressureOverflowStrategy backpressureOverflowStrategy, long j) {
            this.downstream = upf;
            this.onOverflow = aVar;
            this.strategy = backpressureOverflowStrategy;
            this.bufferSize = j;
        }

        /* access modifiers changed from: package-private */
        public void a(Deque<T> deque2) {
            synchronized (deque2) {
                deque2.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            boolean isEmpty;
            T poll;
            if (getAndIncrement() == 0) {
                Deque<T> deque2 = this.deque;
                upf<? super T> upf = this.downstream;
                int i = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.cancelled) {
                            a(deque2);
                            return;
                        }
                        boolean z = this.done;
                        synchronized (deque2) {
                            poll = deque2.poll();
                        }
                        boolean z2 = poll == null;
                        if (z) {
                            Throwable th = this.error;
                            if (th != null) {
                                a(deque2);
                                upf.onError(th);
                                return;
                            } else if (z2) {
                                upf.onComplete();
                                return;
                            }
                        }
                        if (z2) {
                            break;
                        }
                        upf.onNext(poll);
                        j2++;
                    }
                    if (j2 == j) {
                        if (this.cancelled) {
                            a(deque2);
                            return;
                        }
                        boolean z3 = this.done;
                        synchronized (deque2) {
                            isEmpty = deque2.isEmpty();
                        }
                        if (z3) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                a(deque2);
                                upf.onError(th2);
                                return;
                            } else if (isEmpty) {
                                upf.onComplete();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        yif.G(this.requested, j2);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                a(this.deque);
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
                b();
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.done = true;
            b();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.error = th;
            this.done = true;
            b();
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            boolean z;
            boolean z2;
            if (!this.done) {
                Deque<T> deque2 = this.deque;
                synchronized (deque2) {
                    z = false;
                    z2 = true;
                    if (((long) deque2.size()) == this.bufferSize) {
                        int ordinal = this.strategy.ordinal();
                        if (ordinal == 1) {
                            deque2.poll();
                            deque2.offer(t);
                        } else if (ordinal == 2) {
                            deque2.pollLast();
                            deque2.offer(t);
                        }
                        z = true;
                    } else {
                        deque2.offer(t);
                    }
                    z2 = false;
                }
                if (z) {
                    a aVar = this.onOverflow;
                    if (aVar != null) {
                        try {
                            aVar.run();
                        } catch (Throwable th) {
                            yif.V(th);
                            this.upstream.cancel();
                            onError(th);
                        }
                    }
                } else if (z2) {
                    this.upstream.cancel();
                    onError(new MissingBackpressureException());
                } else {
                    b();
                }
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

    public FlowableOnBackpressureBufferStrategy(g<T> gVar, long j, a aVar, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(gVar);
        this.f = j;
        this.n = aVar;
        this.o = backpressureOverflowStrategy;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new OnBackpressureBufferStrategySubscriber(upf, this.n, this.o, this.f));
    }
}
