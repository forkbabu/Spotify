package io.reactivex.internal.operators.flowable;

import io.reactivex.b0;
import io.reactivex.g;
import io.reactivex.internal.fuseable.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.z;
import java.util.NoSuchElementException;

public final class x<T> extends z<T> implements b<T> {
    final g<T> a;
    final T b = null;

    static final class a<T> implements j<T>, io.reactivex.disposables.b {
        final b0<? super T> a;
        final T b;
        vpf c;
        boolean f;
        T n;

        a(b0<? super T> b0Var, T t) {
            this.a = b0Var;
            this.b = t;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c.cancel();
            this.c = SubscriptionHelper.CANCELLED;
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.f) {
                this.f = true;
                this.c = SubscriptionHelper.CANCELLED;
                T t = this.n;
                this.n = null;
                if (t == null) {
                    t = this.b;
                }
                if (t != null) {
                    this.a.onSuccess(t);
                } else {
                    this.a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.f) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.f = true;
            this.c = SubscriptionHelper.CANCELLED;
            this.a.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.f) {
                if (this.n != null) {
                    this.f = true;
                    this.c.cancel();
                    this.c = SubscriptionHelper.CANCELLED;
                    this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.n = t;
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.c, vpf)) {
                this.c = vpf;
                this.a.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public x(g<T> gVar, T t) {
        this.a = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe((j) new a(b0Var, this.b));
    }

    @Override // io.reactivex.internal.fuseable.b
    public g<T> c() {
        return new FlowableSingle(this.a, this.b, true);
    }
}
