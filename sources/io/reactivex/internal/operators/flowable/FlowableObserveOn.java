package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.g;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableObserveOn<T> extends a<T, T> {
    final y f;
    final boolean n;
    final int o;

    static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements j<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        io.reactivex.internal.fuseable.j<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        vpf upstream;
        final y.c worker;

        BaseObserveOnSubscriber(y.c cVar, boolean z, int i) {
            this.worker = cVar;
            this.delayError = z;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(boolean z, boolean z2, upf<?> upf) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.cancelled = true;
                        this.queue.clear();
                        upf.onError(th);
                        this.worker.dispose();
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.cancelled = true;
                        upf.onComplete();
                        this.worker.dispose();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    this.cancelled = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        upf.onError(th2);
                    } else {
                        upf.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public abstract void b();

        /* access modifiers changed from: package-private */
        public abstract void c();

        @Override // defpackage.vpf
        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public final void clear() {
            this.queue.clear();
        }

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public final void f() {
            if (getAndIncrement() == 0) {
                this.worker.b(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.f
        public final int g(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.j
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // defpackage.vpf
        public final void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
                f();
            }
        }

        @Override // defpackage.upf
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                f();
            }
        }

        @Override // defpackage.upf
        public final void onError(Throwable th) {
            if (this.done) {
                a.g(th);
                return;
            }
            this.error = th;
            this.done = true;
            f();
        }

        @Override // defpackage.upf
        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode == 2) {
                    f();
                    return;
                }
                if (!this.queue.offer(t)) {
                    this.upstream.cancel();
                    this.error = new MissingBackpressureException("Queue is full?!");
                    this.done = true;
                }
                f();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                c();
            } else if (this.sourceMode == 1) {
                d();
            } else {
                b();
            }
        }
    }

    static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final io.reactivex.internal.fuseable.a<? super T> downstream;

        ObserveOnConditionalSubscriber(io.reactivex.internal.fuseable.a<? super T> aVar, y.c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.downstream = aVar;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void b() {
            io.reactivex.internal.fuseable.a<? super T> aVar = this.downstream;
            io.reactivex.internal.fuseable.j<T> jVar = this.queue;
            long j = this.produced;
            long j2 = this.consumed;
            int i = 1;
            while (true) {
                long j3 = this.requested.get();
                while (j != j3) {
                    boolean z = this.done;
                    try {
                        T poll = jVar.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, aVar)) {
                            if (z2) {
                                break;
                            }
                            if (aVar.e(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.limit)) {
                                this.upstream.n(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        yif.V(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        jVar.clear();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j != j3 || !a(this.done, jVar.isEmpty(), aVar)) {
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        this.consumed = j2;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void c() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void d() {
            io.reactivex.internal.fuseable.a<? super T> aVar = this.downstream;
            io.reactivex.internal.fuseable.j<T> jVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T poll = jVar.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                aVar.onComplete();
                                this.worker.dispose();
                                return;
                            } else if (aVar.e(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        yif.V(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (jVar.isEmpty()) {
                        this.cancelled = true;
                        aVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                if (vpf instanceof g) {
                    g gVar = (g) vpf;
                    int g = gVar.g(7);
                    if (g == 1) {
                        this.sourceMode = 1;
                        this.queue = gVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (g == 2) {
                        this.sourceMode = 2;
                        this.queue = gVar;
                        this.downstream.onSubscribe(this);
                        vpf.n((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                vpf.n((long) this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            T poll = this.queue.poll();
            if (!(poll == null || this.sourceMode == 1)) {
                long j = this.consumed + 1;
                if (j == ((long) this.limit)) {
                    this.consumed = 0;
                    this.upstream.n(j);
                } else {
                    this.consumed = j;
                }
            }
            return poll;
        }
    }

    static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements j<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final upf<? super T> downstream;

        ObserveOnSubscriber(upf<? super T> upf, y.c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.downstream = upf;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void b() {
            upf<? super T> upf = this.downstream;
            io.reactivex.internal.fuseable.j<T> jVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    boolean z = this.done;
                    try {
                        T poll = jVar.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, upf)) {
                            if (z2) {
                                break;
                            }
                            upf.onNext(poll);
                            j++;
                            if (j == ((long) this.limit)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.requested.addAndGet(-j);
                                }
                                this.upstream.n(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        yif.V(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        jVar.clear();
                        upf.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j != j2 || !a(this.done, jVar.isEmpty(), upf)) {
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void c() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void d() {
            upf<? super T> upf = this.downstream;
            io.reactivex.internal.fuseable.j<T> jVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T poll = jVar.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                upf.onComplete();
                                this.worker.dispose();
                                return;
                            }
                            upf.onNext(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        yif.V(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        upf.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (jVar.isEmpty()) {
                        this.cancelled = true;
                        upf.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                if (vpf instanceof g) {
                    g gVar = (g) vpf;
                    int g = gVar.g(7);
                    if (g == 1) {
                        this.sourceMode = 1;
                        this.queue = gVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (g == 2) {
                        this.sourceMode = 2;
                        this.queue = gVar;
                        this.downstream.onSubscribe(this);
                        vpf.n((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                vpf.n((long) this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            T poll = this.queue.poll();
            if (!(poll == null || this.sourceMode == 1)) {
                long j = this.produced + 1;
                if (j == ((long) this.limit)) {
                    this.produced = 0;
                    this.upstream.n(j);
                } else {
                    this.produced = j;
                }
            }
            return poll;
        }
    }

    public FlowableObserveOn(io.reactivex.g<T> gVar, y yVar, boolean z, int i) {
        super(gVar);
        this.f = yVar;
        this.n = z;
        this.o = i;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        y.c a = this.f.a();
        if (upf instanceof io.reactivex.internal.fuseable.a) {
            this.c.subscribe((j) new ObserveOnConditionalSubscriber((io.reactivex.internal.fuseable.a) upf, a, this.n, this.o));
        } else {
            this.c.subscribe((j) new ObserveOnSubscriber(upf, a, this.n, this.o));
        }
    }
}
