package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.e;
import io.reactivex.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.c;
import io.reactivex.j;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableBuffer<T, C extends Collection<? super T>> extends a<T, C> {
    final int f;
    final int n;
    final Callable<C> o;

    static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements j<T>, vpf, e {
        private static final long serialVersionUID = -7370244972039324525L;
        final Callable<C> bufferSupplier;
        final ArrayDeque<C> buffers = new ArrayDeque<>();
        volatile boolean cancelled;
        boolean done;
        final upf<? super C> downstream;
        int index;
        final AtomicBoolean once = new AtomicBoolean();
        long produced;
        final int size;
        final int skip;
        vpf upstream;

        PublisherBufferOverlappingSubscriber(upf<? super C> upf, int i, int i2, Callable<C> callable) {
            this.downstream = upf;
            this.size = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }

        @Override // io.reactivex.functions.e
        public boolean a() {
            return this.cancelled;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j) && !c.f(j, this.downstream, this.buffers, this, this)) {
                if (this.once.get() || !this.once.compareAndSet(false, true)) {
                    this.upstream.n(yif.x((long) this.skip, j));
                    return;
                }
                this.upstream.n(yif.c((long) this.size, yif.x((long) this.skip, j - 1)));
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                long j = this.produced;
                if (j != 0) {
                    yif.G(this, j);
                }
                c.d(this.downstream, this.buffers, this, this);
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                ArrayDeque<C> arrayDeque = this.buffers;
                int i = this.index;
                int i2 = i + 1;
                if (i == 0) {
                    try {
                        C call = this.bufferSupplier.call();
                        io.reactivex.internal.functions.a.c(call, "The bufferSupplier returned a null buffer");
                        arrayDeque.offer(call);
                    } catch (Throwable th) {
                        yif.V(th);
                        cancel();
                        onError(th);
                        return;
                    }
                }
                C peek = arrayDeque.peek();
                if (peek != null && peek.size() + 1 == this.size) {
                    arrayDeque.poll();
                    peek.add(t);
                    this.produced++;
                    this.downstream.onNext(peek);
                }
                Iterator<C> it = arrayDeque.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
                if (i2 == this.skip) {
                    i2 = 0;
                }
                this.index = i2;
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
            }
        }
    }

    static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements j<T>, vpf {
        private static final long serialVersionUID = -5616169793639412593L;
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final upf<? super C> downstream;
        int index;
        final int size;
        final int skip;
        vpf upstream;

        PublisherBufferSkipSubscriber(upf<? super C> upf, int i, int i2, Callable<C> callable) {
            this.downstream = upf;
            this.size = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (!SubscriptionHelper.l(j)) {
                return;
            }
            if (get() != 0 || !compareAndSet(0, 1)) {
                this.upstream.n(yif.x((long) this.skip, j));
                return;
            }
            this.upstream.n(yif.c(yif.x(j, (long) this.size), yif.x((long) (this.skip - this.size), j - 1)));
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                C c = this.buffer;
                this.buffer = null;
                if (c != null) {
                    this.downstream.onNext(c);
                }
                this.downstream.onComplete();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.done) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                C c = this.buffer;
                int i = this.index;
                int i2 = i + 1;
                if (i == 0) {
                    try {
                        C call = this.bufferSupplier.call();
                        io.reactivex.internal.functions.a.c(call, "The bufferSupplier returned a null buffer");
                        c = call;
                        this.buffer = c;
                    } catch (Throwable th) {
                        yif.V(th);
                        this.upstream.cancel();
                        onError(th);
                        return;
                    }
                }
                if (c != null) {
                    c.add(t);
                    if (c.size() == this.size) {
                        this.buffer = null;
                        this.downstream.onNext(c);
                    }
                }
                if (i2 == this.skip) {
                    i2 = 0;
                }
                this.index = i2;
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
            }
        }
    }

    static final class a<T, C extends Collection<? super T>> implements j<T>, vpf {
        final upf<? super C> a;
        final Callable<C> b;
        final int c;
        C f;
        vpf n;
        boolean o;
        int p;

        a(upf<? super C> upf, int i, Callable<C> callable) {
            this.a = upf;
            this.c = i;
            this.b = callable;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.n.cancel();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                this.n.n(yif.x(j, (long) this.c));
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.o) {
                this.o = true;
                C c2 = this.f;
                if (c2 != null && !c2.isEmpty()) {
                    this.a.onNext(c2);
                }
                this.a.onComplete();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.o) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.o = true;
            this.a.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.o) {
                C c2 = this.f;
                if (c2 == null) {
                    try {
                        C call = this.b.call();
                        io.reactivex.internal.functions.a.c(call, "The bufferSupplier returned a null buffer");
                        c2 = call;
                        this.f = c2;
                    } catch (Throwable th) {
                        yif.V(th);
                        this.n.cancel();
                        onError(th);
                        return;
                    }
                }
                c2.add(t);
                int i = this.p + 1;
                if (i == this.c) {
                    this.p = 0;
                    this.f = null;
                    this.a.onNext(c2);
                    return;
                }
                this.p = i;
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.n, vpf)) {
                this.n = vpf;
                this.a.onSubscribe(this);
            }
        }
    }

    public FlowableBuffer(g<T> gVar, int i, int i2, Callable<C> callable) {
        super(gVar);
        this.f = i;
        this.n = i2;
        this.o = callable;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super C> upf) {
        int i = this.f;
        int i2 = this.n;
        if (i == i2) {
            this.c.subscribe((j) new a(upf, i, this.o));
        } else if (i2 > i) {
            this.c.subscribe((j) new PublisherBufferSkipSubscriber(upf, this.f, this.n, this.o));
        } else {
            this.c.subscribe((j) new PublisherBufferOverlappingSubscriber(upf, this.f, this.n, this.o));
        }
    }
}
