package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.a;
import io.reactivex.internal.fuseable.g;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowablePublishAlt<T> extends a<T> implements Object<T> {
    final tpf<T> c;
    final int f;
    final AtomicReference<PublishConnection<T>> n = new AtomicReference<>();

    /* access modifiers changed from: package-private */
    public static final class InnerSubscription<T> extends AtomicLong implements vpf {
        private static final long serialVersionUID = 2845000326761540265L;
        final upf<? super T> downstream;
        long emitted;
        final PublishConnection<T> parent;

        InnerSubscription(upf<? super T> upf, PublishConnection<T> publishConnection) {
            this.downstream = upf;
            this.parent = publishConnection;
        }

        public boolean a() {
            return get() == Long.MIN_VALUE;
        }

        @Override // defpackage.vpf
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.c(this);
                this.parent.b();
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            yif.b(this, j);
            this.parent.b();
        }
    }

    static final class PublishConnection<T> extends AtomicInteger implements j<T>, b {
        static final InnerSubscription[] a = new InnerSubscription[0];
        static final InnerSubscription[] b = new InnerSubscription[0];
        private static final long serialVersionUID = -1672047311619175801L;
        final int bufferSize;
        final AtomicBoolean connect = new AtomicBoolean();
        int consumed;
        final AtomicReference<PublishConnection<T>> current;
        volatile boolean done;
        Throwable error;
        volatile io.reactivex.internal.fuseable.j<T> queue;
        int sourceMode;
        final AtomicReference<InnerSubscription<T>[]> subscribers;
        final AtomicReference<vpf> upstream = new AtomicReference<>();

        PublishConnection(AtomicReference<PublishConnection<T>> atomicReference, int i) {
            this.current = atomicReference;
            this.bufferSize = i;
            this.subscribers = new AtomicReference<>(a);
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z, boolean z2) {
            if (!z || !z2) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                f(th);
                return true;
            }
            InnerSubscription<T>[] andSet = this.subscribers.getAndSet(b);
            for (InnerSubscription<T> innerSubscription : andSet) {
                if (!innerSubscription.a()) {
                    innerSubscription.downstream.onComplete();
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                io.reactivex.internal.fuseable.j<T> jVar = this.queue;
                int i = this.consumed;
                int i2 = this.bufferSize;
                int i3 = i2 - (i2 >> 2);
                boolean z = this.sourceMode != 1;
                int i4 = 1;
                io.reactivex.internal.fuseable.j<T> jVar2 = jVar;
                int i5 = i;
                while (true) {
                    if (jVar2 != null) {
                        long j = Long.MAX_VALUE;
                        InnerSubscription<T>[] innerSubscriptionArr = this.subscribers.get();
                        boolean z2 = false;
                        for (InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                            long j2 = innerSubscription.get();
                            if (j2 != Long.MIN_VALUE) {
                                j = Math.min(j2 - innerSubscription.emitted, j);
                                z2 = true;
                            }
                        }
                        long j3 = 0;
                        if (!z2) {
                            j = 0;
                        }
                        while (true) {
                            if (j == j3) {
                                break;
                            }
                            boolean z3 = this.done;
                            try {
                                T poll = jVar2.poll();
                                boolean z4 = poll == null;
                                if (!a(z3, z4)) {
                                    if (z4) {
                                        break;
                                    }
                                    for (InnerSubscription<T> innerSubscription2 : innerSubscriptionArr) {
                                        if (!innerSubscription2.a()) {
                                            innerSubscription2.downstream.onNext(poll);
                                            innerSubscription2.emitted++;
                                        }
                                    }
                                    if (z && (i5 = i5 + 1) == i3) {
                                        this.upstream.get().n((long) i3);
                                        i5 = 0;
                                    }
                                    j--;
                                    if (innerSubscriptionArr != this.subscribers.get()) {
                                        break;
                                    }
                                    j3 = 0;
                                } else {
                                    return;
                                }
                            } catch (Throwable th) {
                                yif.V(th);
                                this.upstream.get().cancel();
                                jVar2.clear();
                                this.done = true;
                                f(th);
                                return;
                            }
                        }
                        if (a(this.done, jVar2.isEmpty())) {
                            return;
                        }
                    }
                    this.consumed = i5;
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                    if (jVar2 == null) {
                        jVar2 = this.queue;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription<T>[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.subscribers.get();
                int length = innerSubscriptionArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerSubscriptionArr[i] == innerSubscription) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerSubscriptionArr2 = a;
                        } else {
                            InnerSubscription<T>[] innerSubscriptionArr3 = new InnerSubscription[(length - 1)];
                            System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i);
                            System.arraycopy(innerSubscriptionArr, i + 1, innerSubscriptionArr3, i, (length - i) - 1);
                            innerSubscriptionArr2 = innerSubscriptionArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2));
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.subscribers.get() == b;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.subscribers.getAndSet(b);
            this.current.compareAndSet(this, null);
            SubscriptionHelper.d(this.upstream);
        }

        /* access modifiers changed from: package-private */
        public void f(Throwable th) {
            InnerSubscription<T>[] andSet = this.subscribers.getAndSet(b);
            for (InnerSubscription<T> innerSubscription : andSet) {
                if (!innerSubscription.a()) {
                    innerSubscription.downstream.onError(th);
                }
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
            if (this.sourceMode != 0 || this.queue.offer(t)) {
                b();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.k(this.upstream, vpf)) {
                if (vpf instanceof g) {
                    g gVar = (g) vpf;
                    int g = gVar.g(7);
                    if (g == 1) {
                        this.sourceMode = g;
                        this.queue = gVar;
                        this.done = true;
                        b();
                        return;
                    } else if (g == 2) {
                        this.sourceMode = g;
                        this.queue = gVar;
                        vpf.n((long) this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                vpf.n((long) this.bufferSize);
            }
        }
    }

    public FlowablePublishAlt(tpf<T> tpf, int i) {
        this.c = tpf;
        this.f = i;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        PublishConnection<T> publishConnection;
        boolean z;
        while (true) {
            publishConnection = this.n.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.n, this.f);
            if (this.n.compareAndSet(publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        InnerSubscription<T> innerSubscription = new InnerSubscription<>(upf, publishConnection);
        upf.onSubscribe(innerSubscription);
        while (true) {
            InnerSubscription<T>[] innerSubscriptionArr = publishConnection.subscribers.get();
            z = false;
            if (innerSubscriptionArr != PublishConnection.b) {
                int length = innerSubscriptionArr.length;
                InnerSubscription<T>[] innerSubscriptionArr2 = new InnerSubscription[(length + 1)];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
                if (publishConnection.subscribers.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = publishConnection.error;
            if (th != null) {
                upf.onError(th);
            } else {
                upf.onComplete();
            }
        } else if (innerSubscription.a()) {
            publishConnection.c(innerSubscription);
        } else {
            publishConnection.b();
        }
    }

    public void f(b bVar) {
        this.n.compareAndSet((PublishConnection) bVar, null);
    }

    @Override // io.reactivex.flowables.a
    public void q0(io.reactivex.functions.g<? super b> gVar) {
        PublishConnection<T> publishConnection;
        while (true) {
            publishConnection = this.n.get();
            if (publishConnection != null && !publishConnection.d()) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.n, this.f);
            if (this.n.compareAndSet(publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        boolean z = true;
        if (publishConnection.connect.get() || !publishConnection.connect.compareAndSet(false, true)) {
            z = false;
        }
        try {
            ((FlowableRefCount.RefConnection) gVar).accept(publishConnection);
            if (z) {
                this.c.subscribe(publishConnection);
            }
        } catch (Throwable th) {
            yif.V(th);
            throw ExceptionHelper.e(th);
        }
    }
}
