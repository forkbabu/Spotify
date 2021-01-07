package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.l;
import io.reactivex.internal.fuseable.g;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableSwitchMap<T, R> extends a<T, R> {
    final l<? super T, ? extends tpf<? extends R>> f;
    final int n;
    final boolean o;

    /* access modifiers changed from: package-private */
    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<vpf> implements j<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final SwitchMapSubscriber<T, R> parent;
        volatile io.reactivex.internal.fuseable.j<R> queue;

        SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j, int i) {
            this.parent = switchMapSubscriber;
            this.index = j;
            this.bufferSize = i;
        }

        @Override // defpackage.upf
        public void onComplete() {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                this.done = true;
                switchMapSubscriber.b();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index != switchMapSubscriber.unique || !ExceptionHelper.a(switchMapSubscriber.error, th)) {
                a.g(th);
                return;
            }
            if (!switchMapSubscriber.delayErrors) {
                switchMapSubscriber.upstream.cancel();
                switchMapSubscriber.done = true;
            }
            this.done = true;
            switchMapSubscriber.b();
        }

        @Override // defpackage.upf
        public void onNext(R r) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index != switchMapSubscriber.unique) {
                return;
            }
            if (this.fusionMode != 0 || this.queue.offer(r)) {
                switchMapSubscriber.b();
            } else {
                onError(new MissingBackpressureException("Queue full?!"));
            }
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
                        vpf.n((long) this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                vpf.n((long) this.bufferSize);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements j<T>, vpf {
        static final SwitchMapInnerSubscriber<Object, Object> a;
        private static final long serialVersionUID = -3491074160481096299L;
        final AtomicReference<SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final upf<? super R> downstream;
        final AtomicThrowable error;
        final l<? super T, ? extends tpf<? extends R>> mapper;
        final AtomicLong requested = new AtomicLong();
        volatile long unique;
        vpf upstream;

        static {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = new SwitchMapInnerSubscriber<>(null, -1, 1);
            a = switchMapInnerSubscriber;
            SubscriptionHelper.d(switchMapInnerSubscriber);
        }

        SwitchMapSubscriber(upf<? super R> upf, l<? super T, ? extends tpf<? extends R>> lVar, int i, boolean z) {
            this.downstream = upf;
            this.mapper = lVar;
            this.bufferSize = i;
            this.delayErrors = z;
            this.error = new AtomicThrowable();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public void a() {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.active.get();
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber3 = a;
            if (switchMapInnerSubscriber2 != switchMapInnerSubscriber3 && (switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.active.getAndSet(switchMapInnerSubscriber3)) != switchMapInnerSubscriber3 && switchMapInnerSubscriber != null) {
                SubscriptionHelper.d(switchMapInnerSubscriber);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0116, code lost:
            r14 = false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b() {
            /*
            // Method dump skipped, instructions count: 327
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber.b():void");
        }

        @Override // defpackage.vpf
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                a();
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this.requested, j);
                if (this.unique == 0) {
                    this.upstream.n(Long.MAX_VALUE);
                } else {
                    b();
                }
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
            if (this.done || !ExceptionHelper.a(this.error, th)) {
                a.g(th);
                return;
            }
            if (!this.delayErrors) {
                a();
            }
            this.done = true;
            b();
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber;
            if (!this.done) {
                long j = this.unique + 1;
                this.unique = j;
                SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.active.get();
                if (switchMapInnerSubscriber2 != null) {
                    SubscriptionHelper.d(switchMapInnerSubscriber2);
                }
                try {
                    Object apply = this.mapper.apply(t);
                    io.reactivex.internal.functions.a.c(apply, "The publisher returned is null");
                    tpf tpf = (tpf) apply;
                    SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber3 = new SwitchMapInnerSubscriber<>(this, j, this.bufferSize);
                    do {
                        switchMapInnerSubscriber = this.active.get();
                        if (switchMapInnerSubscriber == a) {
                            return;
                        }
                    } while (!this.active.compareAndSet(switchMapInnerSubscriber, switchMapInnerSubscriber3));
                    tpf.subscribe(switchMapInnerSubscriber3);
                } catch (Throwable th) {
                    yif.V(th);
                    this.upstream.cancel();
                    onError(th);
                }
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

    public FlowableSwitchMap(io.reactivex.g<T> gVar, l<? super T, ? extends tpf<? extends R>> lVar, int i, boolean z) {
        super(gVar);
        this.f = lVar;
        this.n = i;
        this.o = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        if (!w.b(this.c, upf, this.f)) {
            this.c.subscribe((j) new SwitchMapSubscriber(upf, this.f, this.n, this.o));
        }
    }
}
