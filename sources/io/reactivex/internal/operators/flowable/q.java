package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.fuseable.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;

public final class q<T> extends a<T, T> {

    static final class a<T> implements j<T>, g<T> {
        final upf<? super T> a;
        vpf b;

        a(upf<? super T> upf) {
            this.a = upf;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.b.cancel();
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return i & 2;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return true;
        }

        @Override // defpackage.vpf
        public void n(long j) {
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.a.onComplete();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.b, vpf)) {
                this.b = vpf;
                this.a.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            return null;
        }
    }

    public q(io.reactivex.g<T> gVar) {
        super(gVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new a(upf));
    }
}
