package io.reactivex.processors;

import io.reactivex.internal.queue.a;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class UnicastProcessor<T> extends a<T> {
    final a<T> c;
    final AtomicReference<Runnable> f = new AtomicReference<>(null);
    final boolean n = true;
    volatile boolean o;
    Throwable p;
    final AtomicReference<upf<? super T>> q = new AtomicReference<>();
    volatile boolean r;
    final AtomicBoolean s = new AtomicBoolean();
    final BasicIntQueueSubscription<T> t = new UnicastQueueSubscription();
    final AtomicLong u = new AtomicLong();
    boolean v;

    final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        UnicastQueueSubscription() {
        }

        @Override // defpackage.vpf
        public void cancel() {
            if (!UnicastProcessor.this.r) {
                UnicastProcessor.this.r = true;
                UnicastProcessor.this.t0();
                UnicastProcessor.this.q.lazySet(null);
                if (UnicastProcessor.this.t.getAndIncrement() == 0) {
                    UnicastProcessor.this.q.lazySet(null);
                    UnicastProcessor unicastProcessor = UnicastProcessor.this;
                    if (!unicastProcessor.v) {
                        unicastProcessor.c.clear();
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            UnicastProcessor.this.c.clear();
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.v = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return UnicastProcessor.this.c.isEmpty();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(UnicastProcessor.this.u, j);
                UnicastProcessor.this.u0();
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            return UnicastProcessor.this.c.poll();
        }
    }

    UnicastProcessor(int i) {
        io.reactivex.internal.functions.a.d(i, "capacityHint");
        this.c = new a<>(i);
    }

    public static <T> UnicastProcessor<T> s0(int i) {
        return new UnicastProcessor<>(i);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        if (this.s.get() || !this.s.compareAndSet(false, true)) {
            IllegalStateException illegalStateException = new IllegalStateException("This processor allows only a single Subscriber");
            upf.onSubscribe(EmptySubscription.INSTANCE);
            upf.onError(illegalStateException);
            return;
        }
        upf.onSubscribe(this.t);
        this.q.set(upf);
        if (this.r) {
            this.q.lazySet(null);
        } else {
            u0();
        }
    }

    @Override // defpackage.upf
    public void onComplete() {
        if (!this.o && !this.r) {
            this.o = true;
            t0();
            u0();
        }
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (this.o || this.r) {
            io.reactivex.plugins.a.g(th);
        } else {
            this.p = th;
            this.o = true;
            t0();
            u0();
        }
    }

    @Override // defpackage.upf
    public void onNext(T t2) {
        if (t2 == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!this.o && !this.r) {
            this.c.offer(t2);
            u0();
        }
    }

    @Override // io.reactivex.j, defpackage.upf
    public void onSubscribe(vpf vpf) {
        if (this.o || this.r) {
            vpf.cancel();
        } else {
            vpf.n(Long.MAX_VALUE);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r0(boolean z, boolean z2, boolean z3, upf<? super T> upf, a<T> aVar) {
        if (this.r) {
            aVar.clear();
            this.q.lazySet(null);
            return true;
        } else if (!z2) {
            return false;
        } else {
            if (z && this.p != null) {
                aVar.clear();
                this.q.lazySet(null);
                upf.onError(this.p);
                return true;
            } else if (!z3) {
                return false;
            } else {
                Throwable th = this.p;
                this.q.lazySet(null);
                if (th != null) {
                    upf.onError(th);
                } else {
                    upf.onComplete();
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t0() {
        Runnable andSet = this.f.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    /* access modifiers changed from: package-private */
    public void u0() {
        long j;
        if (this.t.getAndIncrement() == 0) {
            int i = 1;
            upf<? super T> upf = this.q.get();
            int i2 = 1;
            while (upf == null) {
                i2 = this.t.addAndGet(-i2);
                if (i2 != 0) {
                    upf = this.q.get();
                    i = 1;
                } else {
                    return;
                }
            }
            if (this.v) {
                a<T> aVar = this.c;
                int i3 = (this.n ? 1 : 0) ^ i;
                while (!this.r) {
                    boolean z = this.o;
                    if (i3 == 0 || !z || this.p == null) {
                        upf.onNext(null);
                        if (z) {
                            this.q.lazySet(null);
                            Throwable th = this.p;
                            if (th != null) {
                                upf.onError(th);
                                return;
                            } else {
                                upf.onComplete();
                                return;
                            }
                        } else {
                            i = this.t.addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        aVar.clear();
                        this.q.lazySet(null);
                        upf.onError(this.p);
                        return;
                    }
                }
                this.q.lazySet(null);
                return;
            }
            a<T> aVar2 = this.c;
            boolean z2 = !this.n;
            int i4 = 1;
            while (true) {
                long j2 = this.u.get();
                long j3 = 0;
                while (true) {
                    if (j2 == j3) {
                        j = j3;
                        break;
                    }
                    boolean z3 = this.o;
                    T poll = aVar2.poll();
                    boolean z4 = poll == null;
                    j = j3;
                    if (!r0(z2, z3, z4, upf, aVar2)) {
                        if (z4) {
                            break;
                        }
                        upf.onNext(poll);
                        j3 = j + 1;
                    } else {
                        return;
                    }
                }
                if (j2 != j || !r0(z2, this.o, aVar2.isEmpty(), upf, aVar2)) {
                    if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                        this.u.addAndGet(-j);
                    }
                    i4 = this.t.addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
