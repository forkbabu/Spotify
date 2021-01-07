package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.t;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableCombineLatest<T, R> extends g<R> {
    final tpf<? extends T>[] c;
    final l<? super Object[], ? extends R> f;
    final int n;
    final boolean o;

    static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final l<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final upf<? super R> downstream;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final io.reactivex.internal.queue.a<Object> queue;
        final AtomicLong requested;
        final CombineLatestInnerSubscriber<T>[] subscribers;

        CombineLatestCoordinator(upf<? super R> upf, l<? super Object[], ? extends R> lVar, int i, int i2, boolean z) {
            this.downstream = upf;
            this.combiner = lVar;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                combineLatestInnerSubscriberArr[i3] = new CombineLatestInnerSubscriber<>(this, i3, i2);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i];
            this.queue = new io.reactivex.internal.queue.a<>(i2);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            for (CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.subscribers) {
                SubscriptionHelper.d(combineLatestInnerSubscriber);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(boolean z, boolean z2, upf<?> upf, io.reactivex.internal.queue.a<?> aVar) {
            if (this.cancelled) {
                a();
                aVar.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayErrors) {
                    Throwable b = ExceptionHelper.b(this.error);
                    if (b != null && b != ExceptionHelper.a) {
                        a();
                        aVar.clear();
                        upf.onError(b);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        a();
                        upf.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    a();
                    Throwable b2 = ExceptionHelper.b(this.error);
                    if (b2 == null || b2 == ExceptionHelper.a) {
                        upf.onComplete();
                    } else {
                        upf.onError(b2);
                    }
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (getAndIncrement() == 0) {
                int i = 1;
                if (this.outputFused) {
                    upf<? super R> upf = this.downstream;
                    io.reactivex.internal.queue.a<Object> aVar = this.queue;
                    while (!this.cancelled) {
                        Throwable th = this.error.get();
                        if (th != null) {
                            aVar.clear();
                            upf.onError(th);
                            return;
                        }
                        boolean z = this.done;
                        boolean isEmpty = aVar.isEmpty();
                        if (!isEmpty) {
                            upf.onNext(null);
                        }
                        if (!z || !isEmpty) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            upf.onComplete();
                            return;
                        }
                    }
                    aVar.clear();
                    return;
                }
                upf<? super R> upf2 = this.downstream;
                io.reactivex.internal.queue.a<?> aVar2 = this.queue;
                int i2 = 1;
                do {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.done;
                        Object poll = aVar2.poll();
                        boolean z3 = poll == null;
                        if (!b(z2, z3, upf2, aVar2)) {
                            if (z3) {
                                break;
                            }
                            try {
                                Object obj = (Object) this.combiner.apply((Object[]) aVar2.poll());
                                io.reactivex.internal.functions.a.c(obj, "The combiner returned a null value");
                                upf2.onNext(obj);
                                ((CombineLatestInnerSubscriber) poll).a();
                                j2++;
                            } catch (Throwable th2) {
                                yif.V(th2);
                                a();
                                ExceptionHelper.a(this.error, th2);
                                upf2.onError(ExceptionHelper.b(this.error));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !b(this.done, aVar2.isEmpty(), upf2, aVar2)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.requested.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                    } else {
                        return;
                    }
                } while (i2 != 0);
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.cancelled = true;
            a();
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            this.queue.clear();
        }

        /* access modifiers changed from: package-private */
        public void d(int i) {
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr[i] != null) {
                    int i2 = this.completedSources + 1;
                    if (i2 == objArr.length) {
                        this.done = true;
                    } else {
                        this.completedSources = i2;
                        return;
                    }
                } else {
                    this.done = true;
                }
                c();
            }
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            boolean z = false;
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            if (i2 != 0) {
                z = true;
            }
            this.outputFused = z;
            return i2;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
                c();
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public R poll() {
            Object poll = this.queue.poll();
            if (poll == null) {
                return null;
            }
            R r = (R) this.combiner.apply((Object[]) this.queue.poll());
            io.reactivex.internal.functions.a.c(r, "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) poll).a();
            return r;
        }

        /* access modifiers changed from: package-private */
        public void subscribe(tpf<? extends T>[] tpfArr, int i) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i2 = 0; i2 < i && !this.done && !this.cancelled; i2++) {
                tpfArr[i2].subscribe(combineLatestInnerSubscriberArr[i2]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<vpf> implements j<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i, int i2) {
            this.parent = combineLatestCoordinator;
            this.index = i;
            this.prefetch = i2;
            this.limit = i2 - (i2 >> 2);
        }

        public void a() {
            int i = this.produced + 1;
            if (i == this.limit) {
                this.produced = 0;
                ((vpf) get()).n((long) i);
                return;
            }
            this.produced = i;
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.parent.d(this.index);
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            CombineLatestCoordinator<T, ?> combineLatestCoordinator = this.parent;
            int i = this.index;
            if (!ExceptionHelper.a(combineLatestCoordinator.error, th)) {
                io.reactivex.plugins.a.g(th);
            } else if (!combineLatestCoordinator.delayErrors) {
                combineLatestCoordinator.a();
                combineLatestCoordinator.done = true;
                combineLatestCoordinator.c();
            } else {
                combineLatestCoordinator.d(i);
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            boolean z;
            CombineLatestCoordinator<T, ?> combineLatestCoordinator = this.parent;
            int i = this.index;
            synchronized (combineLatestCoordinator) {
                Object[] objArr = combineLatestCoordinator.latest;
                int i2 = combineLatestCoordinator.nonEmptySources;
                if (objArr[i] == null) {
                    i2++;
                    combineLatestCoordinator.nonEmptySources = i2;
                }
                objArr[i] = t;
                if (objArr.length == i2) {
                    combineLatestCoordinator.queue.a(combineLatestCoordinator.subscribers[i], objArr.clone());
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                combineLatestCoordinator.subscribers[i].a();
            } else {
                combineLatestCoordinator.c();
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            long j = (long) this.prefetch;
            if (SubscriptionHelper.k(this, vpf)) {
                vpf.n(j);
            }
        }
    }

    final class a implements l<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // io.reactivex.functions.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public R apply(T r4) {
            /*
                r3 = this;
                io.reactivex.internal.operators.flowable.FlowableCombineLatest r0 = io.reactivex.internal.operators.flowable.FlowableCombineLatest.this
                io.reactivex.functions.l<? super java.lang.Object[], ? extends R> r0 = r0.f
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.Object r4 = r0.apply(r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableCombineLatest.a.apply(java.lang.Object):java.lang.Object");
        }
    }

    public FlowableCombineLatest(tpf<? extends T>[] tpfArr, l<? super Object[], ? extends R> lVar, int i, boolean z) {
        this.c = tpfArr;
        this.f = lVar;
        this.n = i;
        this.o = z;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        EmptySubscription emptySubscription = EmptySubscription.INSTANCE;
        tpf<? extends T>[] tpfArr = this.c;
        if (tpfArr != null) {
            int length = tpfArr.length;
            if (length == 0) {
                upf.onSubscribe(emptySubscription);
                upf.onComplete();
            } else if (length == 1) {
                tpfArr[0].subscribe(new t.b(upf, new a()));
            } else {
                CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(upf, this.f, length, this.n, this.o);
                upf.onSubscribe(combineLatestCoordinator);
                combineLatestCoordinator.subscribe(tpfArr, length);
            }
        } else {
            try {
                throw null;
            } catch (Throwable th) {
                yif.V(th);
                upf.onSubscribe(emptySubscription);
                upf.onError(th);
            }
        }
    }
}
