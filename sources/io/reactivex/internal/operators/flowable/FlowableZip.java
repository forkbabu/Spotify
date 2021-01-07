package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableZip<T, R> extends g<R> {
    final tpf<? extends T>[] c;
    final Iterable<? extends tpf<? extends T>> f = null;
    final l<? super Object[], ? extends R> n;
    final int o;
    final boolean p;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements vpf {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final upf<? super R> downstream;
        final AtomicThrowable errors;
        final AtomicLong requested;
        final ZipSubscriber<T, R>[] subscribers;
        final l<? super Object[], ? extends R> zipper;

        ZipCoordinator(upf<? super R> upf, l<? super Object[], ? extends R> lVar, int i, int i2, boolean z) {
            this.downstream = upf;
            this.zipper = lVar;
            this.delayErrors = z;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                zipSubscriberArr[i3] = new ZipSubscriber<>(this, i2);
            }
            this.current = new Object[i];
            this.subscribers = zipSubscriberArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            for (ZipSubscriber<T, R> zipSubscriber : this.subscribers) {
                SubscriptionHelper.d(zipSubscriber);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                upf<? super R> upf = this.downstream;
                ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
                int length = zipSubscriberArr.length;
                Object[] objArr = this.current;
                int i = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j != j2) {
                        if (this.cancelled) {
                            return;
                        }
                        if (this.delayErrors || this.errors.get() == null) {
                            boolean z = false;
                            for (int i2 = 0; i2 < length; i2++) {
                                ZipSubscriber<T, R> zipSubscriber = zipSubscriberArr[i2];
                                if (objArr[i2] == null) {
                                    try {
                                        boolean z2 = zipSubscriber.done;
                                        j<T> jVar = zipSubscriber.queue;
                                        T poll = jVar != null ? jVar.poll() : null;
                                        boolean z3 = poll == null;
                                        if (!z2 || !z3) {
                                            if (!z3) {
                                                objArr[i2] = poll;
                                            }
                                            z = true;
                                        } else {
                                            a();
                                            if (((Throwable) this.errors.get()) != null) {
                                                upf.onError(ExceptionHelper.b(this.errors));
                                                return;
                                            } else {
                                                upf.onComplete();
                                                return;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        yif.V(th);
                                        ExceptionHelper.a(this.errors, th);
                                        if (!this.delayErrors) {
                                            a();
                                            upf.onError(ExceptionHelper.b(this.errors));
                                            return;
                                        }
                                    }
                                }
                            }
                            if (z) {
                                break;
                            }
                            try {
                                Object obj = (Object) this.zipper.apply(objArr.clone());
                                a.c(obj, "The zipper returned a null value");
                                upf.onNext(obj);
                                j2++;
                                Arrays.fill(objArr, (Object) null);
                            } catch (Throwable th2) {
                                yif.V(th2);
                                a();
                                ExceptionHelper.a(this.errors, th2);
                                upf.onError(ExceptionHelper.b(this.errors));
                                return;
                            }
                        } else {
                            a();
                            upf.onError(ExceptionHelper.b(this.errors));
                            return;
                        }
                    }
                    if (j == j2) {
                        if (this.cancelled) {
                            return;
                        }
                        if (this.delayErrors || this.errors.get() == null) {
                            for (int i3 = 0; i3 < length; i3++) {
                                ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i3];
                                if (objArr[i3] == null) {
                                    try {
                                        boolean z4 = zipSubscriber2.done;
                                        j<T> jVar2 = zipSubscriber2.queue;
                                        T poll2 = jVar2 != null ? jVar2.poll() : null;
                                        boolean z5 = poll2 == null;
                                        if (z4 && z5) {
                                            a();
                                            if (((Throwable) this.errors.get()) != null) {
                                                upf.onError(ExceptionHelper.b(this.errors));
                                                return;
                                            } else {
                                                upf.onComplete();
                                                return;
                                            }
                                        } else if (!z5) {
                                            objArr[i3] = poll2;
                                        }
                                    } catch (Throwable th3) {
                                        yif.V(th3);
                                        ExceptionHelper.a(this.errors, th3);
                                        if (!this.delayErrors) {
                                            a();
                                            upf.onError(ExceptionHelper.b(this.errors));
                                            return;
                                        }
                                    }
                                }
                            }
                        } else {
                            a();
                            upf.onError(ExceptionHelper.b(this.errors));
                            return;
                        }
                    }
                    if (j2 != 0) {
                        for (ZipSubscriber<T, R> zipSubscriber3 : zipSubscriberArr) {
                            zipSubscriber3.n(j2);
                        }
                        if (j != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j2);
                        }
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                a();
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void subscribe(tpf<? extends T>[] tpfArr, int i) {
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.cancelled; i2++) {
                if (this.delayErrors || this.errors.get() == null) {
                    tpfArr[i2].subscribe(zipSubscriberArr[i2]);
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ZipSubscriber<T, R> extends AtomicReference<vpf> implements io.reactivex.j<T>, vpf {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        j<T> queue;
        int sourceMode;

        ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        @Override // defpackage.vpf
        public void cancel() {
            SubscriptionHelper.d(this);
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (this.sourceMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((vpf) get()).n(j2);
                    return;
                }
                this.produced = j2;
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.done = true;
            this.parent.b();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            ZipCoordinator<T, R> zipCoordinator = this.parent;
            if (ExceptionHelper.a(zipCoordinator.errors, th)) {
                this.done = true;
                zipCoordinator.b();
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (this.sourceMode != 2) {
                this.queue.offer(t);
            }
            this.parent.b();
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.k(this, vpf)) {
                if (vpf instanceof io.reactivex.internal.fuseable.g) {
                    io.reactivex.internal.fuseable.g gVar = (io.reactivex.internal.fuseable.g) vpf;
                    int g = gVar.g(7);
                    if (g == 1) {
                        this.sourceMode = g;
                        this.queue = gVar;
                        this.done = true;
                        this.parent.b();
                        return;
                    } else if (g == 2) {
                        this.sourceMode = g;
                        this.queue = gVar;
                        vpf.n((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                vpf.n((long) this.prefetch);
            }
        }
    }

    public FlowableZip(tpf<? extends T>[] tpfArr, Iterable<? extends tpf<? extends T>> iterable, l<? super Object[], ? extends R> lVar, int i, boolean z) {
        this.c = tpfArr;
        this.n = lVar;
        this.o = i;
        this.p = z;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        int i;
        tpf<? extends T>[] tpfArr = this.c;
        if (tpfArr == null) {
            tpfArr = new tpf[8];
            i = 0;
            for (tpf<? extends T> tpf : this.f) {
                if (i == tpfArr.length) {
                    tpf<? extends T>[] tpfArr2 = new tpf[((i >> 2) + i)];
                    System.arraycopy(tpfArr, 0, tpfArr2, 0, i);
                    tpfArr = tpfArr2;
                }
                tpfArr[i] = tpf;
                i++;
            }
        } else {
            i = tpfArr.length;
        }
        if (i == 0) {
            upf.onSubscribe(EmptySubscription.INSTANCE);
            upf.onComplete();
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(upf, this.n, i, this.o, this.p);
        upf.onSubscribe(zipCoordinator);
        zipCoordinator.subscribe(tpfArr, i);
    }
}
