package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.a;
import io.reactivex.internal.fuseable.g;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;

public final class FlowableDoFinally<T> extends a<T, T> {
    final a f;

    static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements io.reactivex.internal.fuseable.a<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.internal.fuseable.a<? super T> downstream;
        final a onFinally;
        g<T> qs;
        boolean syncFused;
        vpf upstream;

        DoFinallyConditionalSubscriber(io.reactivex.internal.fuseable.a<? super T> aVar, a aVar2) {
            this.downstream = aVar;
            this.onFinally = aVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    yif.V(th);
                    io.reactivex.plugins.a.g(th);
                }
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.upstream.cancel();
            a();
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            this.qs.clear();
        }

        @Override // io.reactivex.internal.fuseable.a
        public boolean e(T t) {
            return this.downstream.e(t);
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            g<T> gVar = this.qs;
            boolean z = false;
            if (gVar == null || (i & 4) != 0) {
                return 0;
            }
            int g = gVar.g(i);
            if (g != 0) {
                if (g == 1) {
                    z = true;
                }
                this.syncFused = z;
            }
            return g;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return this.qs.isEmpty();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            this.upstream.n(j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.downstream.onComplete();
            a();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.downstream.onError(th);
            a();
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                if (vpf instanceof g) {
                    this.qs = (g) vpf;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            T poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                a();
            }
            return poll;
        }
    }

    static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements j<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final upf<? super T> downstream;
        final a onFinally;
        g<T> qs;
        boolean syncFused;
        vpf upstream;

        DoFinallySubscriber(upf<? super T> upf, a aVar) {
            this.downstream = upf;
            this.onFinally = aVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    yif.V(th);
                    io.reactivex.plugins.a.g(th);
                }
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.upstream.cancel();
            a();
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            this.qs.clear();
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            g<T> gVar = this.qs;
            boolean z = false;
            if (gVar == null || (i & 4) != 0) {
                return 0;
            }
            int g = gVar.g(i);
            if (g != 0) {
                if (g == 1) {
                    z = true;
                }
                this.syncFused = z;
            }
            return g;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return this.qs.isEmpty();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            this.upstream.n(j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.downstream.onComplete();
            a();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.downstream.onError(th);
            a();
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                if (vpf instanceof g) {
                    this.qs = (g) vpf;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            T poll = this.qs.poll();
            if (poll == null && this.syncFused) {
                a();
            }
            return poll;
        }
    }

    public FlowableDoFinally(io.reactivex.g<T> gVar, a aVar) {
        super(gVar);
        this.f = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        if (upf instanceof io.reactivex.internal.fuseable.a) {
            this.c.subscribe((j) new DoFinallyConditionalSubscriber((io.reactivex.internal.fuseable.a) upf, this.f));
        } else {
            this.c.subscribe((j) new DoFinallySubscriber(upf, this.f));
        }
    }
}
