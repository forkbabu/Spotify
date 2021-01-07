package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.a;
import io.reactivex.g;
import io.reactivex.internal.fuseable.i;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableOnBackpressureBuffer<T> extends a<T, T> {
    final int f;
    final boolean n;
    final boolean o;
    final a p;

    static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements j<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final upf<? super T> downstream;
        Throwable error;
        final a onOverflow;
        boolean outputFused;
        final i<T> queue;
        final AtomicLong requested = new AtomicLong();
        vpf upstream;

        BackpressureBufferSubscriber(upf<? super T> upf, int i, boolean z, boolean z2, a aVar) {
            i<T> iVar;
            this.downstream = upf;
            this.onOverflow = aVar;
            this.delayError = z2;
            if (z) {
                iVar = new io.reactivex.internal.queue.a<>(i);
            } else {
                iVar = new SpscArrayQueue<>(i);
            }
            this.queue = iVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z, boolean z2, upf<? super T> upf) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        upf.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        upf.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        upf.onError(th2);
                    } else {
                        upf.onComplete();
                    }
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                i<T> iVar = this.queue;
                upf<? super T> upf = this.downstream;
                int i = 1;
                while (!a(this.done, iVar.isEmpty(), upf)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.done;
                        T poll = iVar.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, upf)) {
                            if (z2) {
                                break;
                            }
                            upf.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !a(this.done, iVar.isEmpty(), upf)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.requested.addAndGet(-j2);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (!this.outputFused && SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
                b();
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                b();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                b();
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.onOverflow.run();
                } catch (Throwable th) {
                    yif.V(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.outputFused) {
                this.downstream.onNext(null);
            } else {
                b();
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

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            return this.queue.poll();
        }
    }

    public FlowableOnBackpressureBuffer(g<T> gVar, int i, boolean z, boolean z2, a aVar) {
        super(gVar);
        this.f = i;
        this.n = z;
        this.o = z2;
        this.p = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new BackpressureBufferSubscriber(upf, this.f, this.n, this.o, this.p));
    }
}
