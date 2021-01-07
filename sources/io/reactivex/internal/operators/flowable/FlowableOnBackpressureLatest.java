package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableOnBackpressureLatest<T> extends a<T, T> {

    static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements j<T>, vpf {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        final AtomicReference<T> current = new AtomicReference<>();
        volatile boolean done;
        final upf<? super T> downstream;
        Throwable error;
        final AtomicLong requested = new AtomicLong();
        vpf upstream;

        BackpressureLatestSubscriber(upf<? super T> upf) {
            this.downstream = upf;
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z, boolean z2, upf<?> upf, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet(null);
                    upf.onError(th);
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
        public void b() {
            boolean z;
            if (getAndIncrement() == 0) {
                upf<? super T> upf = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference<T> atomicReference = this.current;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.done;
                        T andSet = atomicReference.getAndSet(null);
                        boolean z3 = andSet == null;
                        if (!a(z2, z3, upf, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            upf.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (a(z4, z, upf, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        yif.G(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.current.lazySet(null);
                }
            }
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
            this.done = true;
            b();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            b();
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.current.lazySet(t);
            b();
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public FlowableOnBackpressureLatest(g<T> gVar) {
        super(gVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new BackpressureLatestSubscriber(upf));
    }
}
