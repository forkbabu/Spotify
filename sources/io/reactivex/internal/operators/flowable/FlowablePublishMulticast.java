package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.c;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowablePublishMulticast<T, R> extends a<T, R> {
    final l<? super g<T>, ? extends tpf<? extends R>> f;
    final int n;
    final boolean o;

    /* access modifiers changed from: package-private */
    public static final class MulticastSubscription<T> extends AtomicLong implements vpf {
        private static final long serialVersionUID = 8664815189257569791L;
        final upf<? super T> downstream;
        long emitted;
        final a<T> parent;

        MulticastSubscription(upf<? super T> upf, a<T> aVar) {
            this.downstream = upf;
            this.parent = aVar;
        }

        @Override // defpackage.vpf
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.t0(this);
                this.parent.r0();
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.b(this, j);
                this.parent.r0();
            }
        }
    }

    static final class a<T> extends g<T> implements j<T>, io.reactivex.disposables.b {
        static final MulticastSubscription[] w = new MulticastSubscription[0];
        static final MulticastSubscription[] x = new MulticastSubscription[0];
        final AtomicInteger c = new AtomicInteger();
        final AtomicReference<MulticastSubscription<T>[]> f = new AtomicReference<>(w);
        final int n;
        final int o;
        final boolean p;
        final AtomicReference<vpf> q = new AtomicReference<>();
        volatile io.reactivex.internal.fuseable.j<T> r;
        int s;
        volatile boolean t;
        Throwable u;
        int v;

        a(int i, boolean z) {
            this.n = i;
            this.o = i - (i >> 2);
            this.p = z;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.q.get() == SubscriptionHelper.CANCELLED;
        }

        /* access modifiers changed from: protected */
        @Override // io.reactivex.g
        public void d0(upf<? super T> upf) {
            boolean z;
            boolean z2;
            MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(upf, this);
            upf.onSubscribe(multicastSubscription);
            while (true) {
                MulticastSubscription<T>[] multicastSubscriptionArr = this.f.get();
                z = false;
                if (multicastSubscriptionArr != x) {
                    int length = multicastSubscriptionArr.length;
                    MulticastSubscription<T>[] multicastSubscriptionArr2 = new MulticastSubscription[(length + 1)];
                    System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
                    multicastSubscriptionArr2[length] = multicastSubscription;
                    if (this.f.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2)) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                if (multicastSubscription.get() == Long.MIN_VALUE) {
                    z = true;
                }
                if (z) {
                    t0(multicastSubscription);
                } else {
                    r0();
                }
            } else {
                Throwable th = this.u;
                if (th != null) {
                    upf.onError(th);
                } else {
                    upf.onComplete();
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            io.reactivex.internal.fuseable.j<T> jVar;
            SubscriptionHelper.d(this.q);
            if (this.c.getAndIncrement() == 0 && (jVar = this.r) != null) {
                jVar.clear();
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.t) {
                this.t = true;
                r0();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.t) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.u = th;
            this.t = true;
            r0();
        }

        @Override // defpackage.upf
        public void onNext(T t2) {
            if (!this.t) {
                if (this.s != 0 || this.r.offer(t2)) {
                    r0();
                    return;
                }
                this.q.get().cancel();
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.k(this.q, vpf)) {
                long j = Long.MAX_VALUE;
                if (vpf instanceof io.reactivex.internal.fuseable.g) {
                    io.reactivex.internal.fuseable.g gVar = (io.reactivex.internal.fuseable.g) vpf;
                    int g = gVar.g(3);
                    if (g == 1) {
                        this.s = g;
                        this.r = gVar;
                        this.t = true;
                        r0();
                        return;
                    } else if (g == 2) {
                        this.s = g;
                        this.r = gVar;
                        int i = this.n;
                        if (i >= 0) {
                            j = (long) i;
                        }
                        vpf.n(j);
                        return;
                    }
                }
                this.r = c.b(this.n);
                int i2 = this.n;
                if (i2 >= 0) {
                    j = (long) i2;
                }
                vpf.n(j);
            }
        }

        /* access modifiers changed from: package-private */
        public void q0() {
            MulticastSubscription<T>[] andSet = this.f.getAndSet(x);
            for (MulticastSubscription<T> multicastSubscription : andSet) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onComplete();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void r0() {
            AtomicReference<MulticastSubscription<T>[]> atomicReference;
            Throwable th;
            Throwable th2;
            if (this.c.getAndIncrement() == 0) {
                io.reactivex.internal.fuseable.j<T> jVar = this.r;
                int i = this.v;
                int i2 = this.o;
                boolean z = this.s != 1;
                AtomicReference<MulticastSubscription<T>[]> atomicReference2 = this.f;
                MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference2.get();
                int i3 = 1;
                while (true) {
                    int length = multicastSubscriptionArr.length;
                    if (jVar == null || length == 0) {
                        atomicReference = atomicReference2;
                    } else {
                        int length2 = multicastSubscriptionArr.length;
                        long j = Long.MAX_VALUE;
                        long j2 = Long.MAX_VALUE;
                        int i4 = 0;
                        while (i4 < length2) {
                            MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i4];
                            long j3 = multicastSubscription.get() - multicastSubscription.emitted;
                            if (j3 == Long.MIN_VALUE) {
                                length--;
                            } else if (j2 > j3) {
                                j2 = j3;
                            }
                            i4++;
                            atomicReference2 = atomicReference2;
                        }
                        atomicReference = atomicReference2;
                        long j4 = 0;
                        if (length == 0) {
                            j2 = 0;
                        }
                        while (j2 != j4) {
                            if (d()) {
                                jVar.clear();
                                return;
                            }
                            boolean z2 = this.t;
                            if (!z2 || this.p || (th2 = this.u) == null) {
                                try {
                                    T poll = jVar.poll();
                                    boolean z3 = poll == null;
                                    if (z2 && z3) {
                                        Throwable th3 = this.u;
                                        if (th3 != null) {
                                            s0(th3);
                                            return;
                                        } else {
                                            q0();
                                            return;
                                        }
                                    } else if (z3) {
                                        break;
                                    } else {
                                        int length3 = multicastSubscriptionArr.length;
                                        int i5 = 0;
                                        boolean z4 = false;
                                        while (i5 < length3) {
                                            MulticastSubscription<T> multicastSubscription2 = multicastSubscriptionArr[i5];
                                            long j5 = multicastSubscription2.get();
                                            if (j5 != Long.MIN_VALUE) {
                                                if (j5 != j) {
                                                    multicastSubscription2.emitted++;
                                                }
                                                multicastSubscription2.downstream.onNext(poll);
                                            } else {
                                                z4 = true;
                                            }
                                            i5++;
                                            j = Long.MAX_VALUE;
                                        }
                                        j2--;
                                        if (z && (i = i + 1) == i2) {
                                            this.q.get().n((long) i2);
                                            i = 0;
                                        }
                                        MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                                        if (z4 || multicastSubscriptionArr2 != multicastSubscriptionArr) {
                                            multicastSubscriptionArr = multicastSubscriptionArr2;
                                            break;
                                        } else {
                                            j4 = 0;
                                            j = Long.MAX_VALUE;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    yif.V(th4);
                                    SubscriptionHelper.d(this.q);
                                    s0(th4);
                                    return;
                                }
                            } else {
                                s0(th2);
                                return;
                            }
                        }
                        if (j2 == j4) {
                            if (d()) {
                                jVar.clear();
                                return;
                            }
                            boolean z5 = this.t;
                            if (z5 && !this.p && (th = this.u) != null) {
                                s0(th);
                                return;
                            } else if (z5 && jVar.isEmpty()) {
                                Throwable th5 = this.u;
                                if (th5 != null) {
                                    s0(th5);
                                    return;
                                } else {
                                    q0();
                                    return;
                                }
                            }
                        }
                    }
                    this.v = i;
                    i3 = this.c.addAndGet(-i3);
                    if (i3 != 0) {
                        if (jVar == null) {
                            jVar = this.r;
                        }
                        multicastSubscriptionArr = atomicReference.get();
                        atomicReference2 = atomicReference;
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void s0(Throwable th) {
            MulticastSubscription<T>[] andSet = this.f.getAndSet(x);
            for (MulticastSubscription<T> multicastSubscription : andSet) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onError(th);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void t0(MulticastSubscription<T> multicastSubscription) {
            MulticastSubscription<T>[] multicastSubscriptionArr;
            MulticastSubscription<T>[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = this.f.get();
                int length = multicastSubscriptionArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (multicastSubscriptionArr[i] == multicastSubscription) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            multicastSubscriptionArr2 = w;
                        } else {
                            MulticastSubscription<T>[] multicastSubscriptionArr3 = new MulticastSubscription[(length - 1)];
                            System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr3, 0, i);
                            System.arraycopy(multicastSubscriptionArr, i + 1, multicastSubscriptionArr3, i, (length - i) - 1);
                            multicastSubscriptionArr2 = multicastSubscriptionArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2));
        }
    }

    static final class b<R> implements j<R>, vpf {
        final upf<? super R> a;
        final a<?> b;
        vpf c;

        b(upf<? super R> upf, a<?> aVar) {
            this.a = upf;
            this.b = aVar;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.c.cancel();
            this.b.dispose();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            this.c.n(j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.a.onComplete();
            this.b.dispose();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.a.onError(th);
            this.b.dispose();
        }

        @Override // defpackage.upf
        public void onNext(R r) {
            this.a.onNext(r);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.c, vpf)) {
                this.c = vpf;
                this.a.onSubscribe(this);
            }
        }
    }

    public FlowablePublishMulticast(g<T> gVar, l<? super g<T>, ? extends tpf<? extends R>> lVar, int i, boolean z) {
        super(gVar);
        this.f = lVar;
        this.n = i;
        this.o = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        a aVar = new a(this.n, this.o);
        try {
            Object apply = this.f.apply(aVar);
            io.reactivex.internal.functions.a.c(apply, "selector returned a null Publisher");
            ((tpf) apply).subscribe(new b(upf, aVar));
            this.c.subscribe((j) aVar);
        } catch (Throwable th) {
            yif.V(th);
            upf.onSubscribe(EmptySubscription.INSTANCE);
            upf.onError(th);
        }
    }
}
