package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.l;
import io.reactivex.internal.fuseable.g;
import io.reactivex.internal.fuseable.i;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableFlatMap<T, U> extends a<T, U> {
    final l<? super T, ? extends tpf<? extends U>> f;
    final boolean n;
    final int o;
    final int p;

    /* access modifiers changed from: package-private */
    public static final class InnerSubscriber<T, U> extends AtomicReference<vpf> implements j<U>, b {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit;
        final MergeSubscriber<T, U> parent;
        long produced;
        volatile io.reactivex.internal.fuseable.j<U> queue;

        InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j) {
            this.id = j;
            this.parent = mergeSubscriber;
            int i = mergeSubscriber.bufferSize;
            this.bufferSize = i;
            this.limit = i >> 2;
        }

        /* access modifiers changed from: package-private */
        public void a(long j) {
            if (this.fusionMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((vpf) get()).n(j2);
                    return;
                }
                this.produced = j2;
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            SubscriptionHelper.d(this);
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.done = true;
            this.parent.b();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            MergeSubscriber<T, U> mergeSubscriber = this.parent;
            if (ExceptionHelper.a(mergeSubscriber.errs, th)) {
                this.done = true;
                if (!mergeSubscriber.delayErrors) {
                    mergeSubscriber.upstream.cancel();
                    for (InnerSubscriber<?, ?> innerSubscriber : mergeSubscriber.subscribers.getAndSet(MergeSubscriber.b)) {
                        SubscriptionHelper.d(innerSubscriber);
                    }
                }
                mergeSubscriber.b();
                return;
            }
            a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(U u) {
            if (this.fusionMode != 2) {
                MergeSubscriber<T, U> mergeSubscriber = this.parent;
                if (mergeSubscriber.get() != 0 || !mergeSubscriber.compareAndSet(0, 1)) {
                    io.reactivex.internal.fuseable.j jVar = this.queue;
                    if (jVar == null) {
                        jVar = new SpscArrayQueue(mergeSubscriber.bufferSize);
                        this.queue = jVar;
                    }
                    if (!jVar.offer(u)) {
                        mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    } else if (mergeSubscriber.getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    long j = mergeSubscriber.requested.get();
                    io.reactivex.internal.fuseable.j jVar2 = this.queue;
                    if (j == 0 || (jVar2 != null && !jVar2.isEmpty())) {
                        if (jVar2 == null && (jVar2 = this.queue) == null) {
                            jVar2 = new SpscArrayQueue(mergeSubscriber.bufferSize);
                            this.queue = jVar2;
                        }
                        if (!jVar2.offer(u)) {
                            mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                            return;
                        }
                    } else {
                        mergeSubscriber.downstream.onNext(u);
                        if (j != Long.MAX_VALUE) {
                            mergeSubscriber.requested.decrementAndGet();
                        }
                        a(1);
                    }
                    if (mergeSubscriber.decrementAndGet() == 0) {
                        return;
                    }
                }
                mergeSubscriber.c();
                return;
            }
            this.parent.b();
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.k(this, vpf)) {
                if (vpf instanceof g) {
                    g gVar = (g) vpf;
                    int g = gVar.g(7);
                    if (g == 1) {
                        this.fusionMode = g;
                        this.queue = gVar;
                        this.done = true;
                        this.parent.b();
                        return;
                    } else if (g == 2) {
                        this.fusionMode = g;
                        this.queue = gVar;
                    }
                }
                vpf.n((long) this.bufferSize);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class MergeSubscriber<T, U> extends AtomicInteger implements j<T>, vpf {
        static final InnerSubscriber<?, ?>[] a = new InnerSubscriber[0];
        static final InnerSubscriber<?, ?>[] b = new InnerSubscriber[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final upf<? super U> downstream;
        final AtomicThrowable errs = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final l<? super T, ? extends tpf<? extends U>> mapper;
        final int maxConcurrency;
        volatile i<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        long uniqueId;
        vpf upstream;

        MergeSubscriber(upf<? super U> upf, l<? super T, ? extends tpf<? extends U>> lVar, boolean z, int i, int i2) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = upf;
            this.mapper = lVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            this.scalarLimit = Math.max(1, i >> 1);
            atomicReference.lazySet(a);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            if (this.cancelled) {
                i<U> iVar = this.queue;
                if (iVar != null) {
                    iVar.clear();
                }
                return true;
            } else if (this.delayErrors || this.errs.get() == null) {
                return false;
            } else {
                i<U> iVar2 = this.queue;
                if (iVar2 != null) {
                    iVar2.clear();
                }
                Throwable b2 = ExceptionHelper.b(this.errs);
                if (b2 != ExceptionHelper.a) {
                    this.downstream.onError(b2);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            boolean z;
            long j;
            long j2;
            InnerSubscriber<T, U>[] innerSubscriberArr;
            int i;
            long j3;
            upf<? super U> upf = this.downstream;
            int i2 = 1;
            while (!a()) {
                i<U> iVar = this.queue;
                long j4 = this.requested.get();
                boolean z2 = j4 == Long.MAX_VALUE;
                long j5 = 0;
                long j6 = 0;
                if (iVar != null) {
                    while (true) {
                        long j7 = 0;
                        U u = null;
                        while (true) {
                            if (j4 == 0) {
                                break;
                            }
                            U poll = iVar.poll();
                            if (!a()) {
                                if (poll == null) {
                                    u = poll;
                                    break;
                                }
                                upf.onNext(poll);
                                j6++;
                                j7++;
                                j4--;
                                u = poll;
                            } else {
                                return;
                            }
                        }
                        if (j7 != 0) {
                            if (z2) {
                                j4 = Long.MAX_VALUE;
                            } else {
                                j4 = this.requested.addAndGet(-j7);
                            }
                        }
                        if (j4 == 0 || u == null) {
                            break;
                        }
                    }
                }
                boolean z3 = this.done;
                i<U> iVar2 = this.queue;
                InnerSubscriber<?, ?>[] innerSubscriberArr2 = this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (!z3 || ((iVar2 != null && !iVar2.isEmpty()) || length != 0)) {
                    if (length != 0) {
                        long j8 = this.lastId;
                        int i3 = this.lastIndex;
                        if (length <= i3 || innerSubscriberArr2[i3].id != j8) {
                            if (length <= i3) {
                                i3 = 0;
                            }
                            for (int i4 = 0; i4 < length && innerSubscriberArr2[i3].id != j8; i4++) {
                                i3++;
                                if (i3 == length) {
                                    i3 = 0;
                                }
                            }
                            this.lastIndex = i3;
                            this.lastId = innerSubscriberArr2[i3].id;
                        }
                        int i5 = i3;
                        boolean z4 = false;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                innerSubscriberArr = innerSubscriberArr2;
                                z = z4;
                                break;
                            } else if (!a()) {
                                InnerSubscriber<T, U> innerSubscriber = innerSubscriberArr2[i5];
                                U u2 = null;
                                while (!a()) {
                                    io.reactivex.internal.fuseable.j<U> jVar = innerSubscriber.queue;
                                    if (jVar == null) {
                                        innerSubscriberArr = innerSubscriberArr2;
                                        i = length;
                                    } else {
                                        innerSubscriberArr = innerSubscriberArr2;
                                        i = length;
                                        long j9 = j5;
                                        while (j4 != j5) {
                                            try {
                                                u2 = jVar.poll();
                                                if (u2 == null) {
                                                    break;
                                                }
                                                upf.onNext(u2);
                                                if (!a()) {
                                                    j4--;
                                                    j9++;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                yif.V(th);
                                                SubscriptionHelper.d(innerSubscriber);
                                                ExceptionHelper.a(this.errs, th);
                                                if (!this.delayErrors) {
                                                    this.upstream.cancel();
                                                }
                                                if (!a()) {
                                                    f(innerSubscriber);
                                                    i6++;
                                                    length = i;
                                                    z4 = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j9 != j5) {
                                            j4 = !z2 ? this.requested.addAndGet(-j9) : Long.MAX_VALUE;
                                            innerSubscriber.a(j9);
                                            j3 = 0;
                                        } else {
                                            j3 = j5;
                                        }
                                        if (!(j4 == j3 || u2 == null)) {
                                            innerSubscriberArr2 = innerSubscriberArr;
                                            length = i;
                                            j5 = 0;
                                        }
                                    }
                                    boolean z5 = innerSubscriber.done;
                                    io.reactivex.internal.fuseable.j<U> jVar2 = innerSubscriber.queue;
                                    if (z5 && (jVar2 == null || jVar2.isEmpty())) {
                                        f(innerSubscriber);
                                        if (!a()) {
                                            j6++;
                                            z4 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j4 == 0) {
                                        z = z4;
                                        break;
                                    }
                                    i5++;
                                    length = i;
                                    if (i5 == length) {
                                        i5 = 0;
                                    }
                                    i6++;
                                    innerSubscriberArr2 = innerSubscriberArr;
                                    j5 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i5;
                        this.lastId = innerSubscriberArr[i5].id;
                        j2 = j6;
                        j = 0;
                    } else {
                        j = 0;
                        j2 = j6;
                        z = false;
                    }
                    if (j2 != j && !this.cancelled) {
                        this.upstream.n(j2);
                    }
                    if (z) {
                        i2 = i2;
                    } else {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable b2 = ExceptionHelper.b(this.errs);
                    if (b2 == ExceptionHelper.a) {
                        return;
                    }
                    if (b2 == null) {
                        upf.onComplete();
                        return;
                    } else {
                        upf.onError(b2);
                        return;
                    }
                }
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            i<U> iVar;
            InnerSubscriber<?, ?>[] andSet;
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
                InnerSubscriber<?, ?>[] innerSubscriberArr2 = b;
                if (!(innerSubscriberArr == innerSubscriberArr2 || (andSet = this.subscribers.getAndSet(innerSubscriberArr2)) == innerSubscriberArr2)) {
                    for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                        SubscriptionHelper.d(innerSubscriber);
                    }
                    Throwable b2 = ExceptionHelper.b(this.errs);
                    if (!(b2 == null || b2 == ExceptionHelper.a)) {
                        a.g(b2);
                    }
                }
                if (getAndIncrement() == 0 && (iVar = this.queue) != null) {
                    iVar.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public io.reactivex.internal.fuseable.j<U> d() {
            i<U> iVar = this.queue;
            if (iVar == null) {
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    iVar = new io.reactivex.internal.queue.a<>(this.bufferSize);
                } else {
                    iVar = new SpscArrayQueue<>(this.maxConcurrency);
                }
                this.queue = iVar;
            }
            return iVar;
        }

        /* access modifiers changed from: package-private */
        public void f(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerSubscriberArr[i] == innerSubscriber) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerSubscriberArr2 = a;
                        } else {
                            InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[(length - 1)];
                            System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                            System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                            innerSubscriberArr2 = innerSubscriberArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
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
            if (!this.done) {
                this.done = true;
                b();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.done) {
                a.g(th);
            } else if (ExceptionHelper.a(this.errs, th)) {
                this.done = true;
                if (!this.delayErrors) {
                    for (InnerSubscriber<?, ?> innerSubscriber : this.subscribers.getAndSet(b)) {
                        SubscriptionHelper.d(innerSubscriber);
                    }
                }
                b();
            } else {
                a.g(th);
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                try {
                    Object apply = this.mapper.apply(t);
                    io.reactivex.internal.functions.a.c(apply, "The mapper returned a null Publisher");
                    tpf tpf = (tpf) apply;
                    boolean z = false;
                    if (tpf instanceof Callable) {
                        try {
                            U u = (U) ((Callable) tpf).call();
                            if (u != null) {
                                if (get() == 0 && compareAndSet(0, 1)) {
                                    long j = this.requested.get();
                                    io.reactivex.internal.fuseable.j<U> jVar = this.queue;
                                    if (j == 0 || (jVar != null && !jVar.isEmpty())) {
                                        if (jVar == null) {
                                            jVar = d();
                                        }
                                        if (!jVar.offer(u)) {
                                            onError(new IllegalStateException("Scalar queue full?!"));
                                            return;
                                        }
                                    } else {
                                        this.downstream.onNext(u);
                                        if (j != Long.MAX_VALUE) {
                                            this.requested.decrementAndGet();
                                        }
                                        if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                                            int i = this.scalarEmitted + 1;
                                            this.scalarEmitted = i;
                                            int i2 = this.scalarLimit;
                                            if (i == i2) {
                                                this.scalarEmitted = 0;
                                                this.upstream.n((long) i2);
                                            }
                                        }
                                    }
                                    if (decrementAndGet() == 0) {
                                        return;
                                    }
                                } else if (!d().offer(u)) {
                                    onError(new IllegalStateException("Scalar queue full?!"));
                                    return;
                                } else if (getAndIncrement() != 0) {
                                    return;
                                }
                                c();
                            } else if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                                int i3 = this.scalarEmitted + 1;
                                this.scalarEmitted = i3;
                                int i4 = this.scalarLimit;
                                if (i3 == i4) {
                                    this.scalarEmitted = 0;
                                    this.upstream.n((long) i4);
                                }
                            }
                        } catch (Throwable th) {
                            yif.V(th);
                            ExceptionHelper.a(this.errs, th);
                            b();
                        }
                    } else {
                        long j2 = this.uniqueId;
                        this.uniqueId = 1 + j2;
                        InnerSubscriber<?, ?> innerSubscriber = new InnerSubscriber<>(this, j2);
                        while (true) {
                            InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
                            if (innerSubscriberArr != b) {
                                int length = innerSubscriberArr.length;
                                InnerSubscriber<?, ?>[] innerSubscriberArr2 = new InnerSubscriber[(length + 1)];
                                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                                innerSubscriberArr2[length] = innerSubscriber;
                                if (this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                SubscriptionHelper.d(innerSubscriber);
                                break;
                            }
                        }
                        if (z) {
                            tpf.subscribe(innerSubscriber);
                        }
                    }
                } catch (Throwable th2) {
                    yif.V(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    int i = this.maxConcurrency;
                    if (i == Integer.MAX_VALUE) {
                        vpf.n(Long.MAX_VALUE);
                    } else {
                        vpf.n((long) i);
                    }
                }
            }
        }
    }

    public FlowableFlatMap(io.reactivex.g<T> gVar, l<? super T, ? extends tpf<? extends U>> lVar, boolean z, int i, int i2) {
        super(gVar);
        this.f = lVar;
        this.n = z;
        this.o = i;
        this.p = i2;
    }

    public static <T, U> j<T> subscribe(upf<? super U> upf, l<? super T, ? extends tpf<? extends U>> lVar, boolean z, int i, int i2) {
        return new MergeSubscriber(upf, lVar, z, i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super U> upf) {
        if (!w.b(this.c, upf, this.f)) {
            this.c.subscribe((j) subscribe(upf, this.f, this.n, this.o, this.p));
        }
    }
}
