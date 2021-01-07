package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.l;
import io.reactivex.internal.fuseable.g;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableFlattenIterable<T, R> extends a<T, R> {
    final l<? super T, ? extends Iterable<? extends R>> f;
    final int n;

    static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements j<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        volatile boolean cancelled;
        int consumed;
        Iterator<? extends R> current;
        volatile boolean done;
        final upf<? super R> downstream;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        int fusionMode;
        final int limit;
        final l<? super T, ? extends Iterable<? extends R>> mapper;
        final int prefetch;
        io.reactivex.internal.fuseable.j<T> queue;
        final AtomicLong requested = new AtomicLong();
        vpf upstream;

        FlattenIterableSubscriber(upf<? super R> upf, l<? super T, ? extends Iterable<? extends R>> lVar, int i) {
            this.downstream = upf;
            this.mapper = lVar;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z, boolean z2, upf<?> upf, io.reactivex.internal.fuseable.j<?> jVar) {
            if (this.cancelled) {
                this.current = null;
                jVar.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (this.error.get() != null) {
                    Throwable b = ExceptionHelper.b(this.error);
                    this.current = null;
                    jVar.clear();
                    upf.onError(b);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    upf.onComplete();
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z) {
            if (z) {
                int i = this.consumed + 1;
                if (i == this.limit) {
                    this.consumed = 0;
                    this.upstream.n((long) i);
                    return;
                }
                this.consumed = i;
            }
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:8:0x001a */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0120, code lost:
            if (r6 == null) goto L_0x012b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c() {
            /*
            // Method dump skipped, instructions count: 302
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlattenIterable.FlattenIterableSubscriber.c():void");
        }

        @Override // defpackage.vpf
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            this.current = null;
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return ((i & 1) == 0 || this.fusionMode != 1) ? 0 : 1;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return this.current == null && this.queue.isEmpty();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
                c();
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                c();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.done || !ExceptionHelper.a(this.error, th)) {
                a.g(th);
                return;
            }
            this.done = true;
            c();
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                if (this.fusionMode != 0 || this.queue.offer(t)) {
                    c();
                } else {
                    onError(new MissingBackpressureException("Queue is full?!"));
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                if (vpf instanceof g) {
                    g gVar = (g) vpf;
                    int g = gVar.g(3);
                    if (g == 1) {
                        this.fusionMode = g;
                        this.queue = gVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (g == 2) {
                        this.fusionMode = g;
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
        public R poll() {
            Iterator<T> it = this.current;
            while (true) {
                if (it == null) {
                    T poll = this.queue.poll();
                    if (poll != null) {
                        it = ((Iterable) this.mapper.apply(poll)).iterator();
                        if (it.hasNext()) {
                            this.current = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R r = (R) it.next();
            io.reactivex.internal.functions.a.c(r, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.current = null;
            }
            return r;
        }
    }

    public FlowableFlattenIterable(io.reactivex.g<T> gVar, l<? super T, ? extends Iterable<? extends R>> lVar, int i) {
        super(gVar);
        this.f = lVar;
        this.n = i;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        EmptySubscription emptySubscription = EmptySubscription.INSTANCE;
        io.reactivex.g<T> gVar = this.c;
        if (gVar instanceof Callable) {
            try {
                Object call = ((Callable) gVar).call();
                if (call == null) {
                    upf.onSubscribe(emptySubscription);
                    upf.onComplete();
                    return;
                }
                try {
                    FlowableFromIterable.subscribe(upf, ((Iterable) this.f.apply(call)).iterator());
                } catch (Throwable th) {
                    yif.V(th);
                    upf.onSubscribe(emptySubscription);
                    upf.onError(th);
                }
            } catch (Throwable th2) {
                yif.V(th2);
                upf.onSubscribe(emptySubscription);
                upf.onError(th2);
            }
        } else {
            gVar.subscribe((j) new FlattenIterableSubscriber(upf, this.f, this.n));
        }
    }
}
