package io.reactivex.internal.operators.flowable;

import io.reactivex.b0;
import io.reactivex.g;
import io.reactivex.internal.fuseable.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.z;
import java.util.NoSuchElementException;

public final class j<T> extends z<T> implements b<T> {
    final g<T> a;
    final long b;
    final T c;

    static final class a<T> implements io.reactivex.j<T>, io.reactivex.disposables.b {
        final b0<? super T> a;
        final long b;
        final T c;
        vpf f;
        long n;
        boolean o;

        a(b0<? super T> b0Var, long j, T t) {
            this.a = b0Var;
            this.b = j;
            this.c = t;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f.cancel();
            this.f = SubscriptionHelper.CANCELLED;
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.f = SubscriptionHelper.CANCELLED;
            if (!this.o) {
                this.o = true;
                T t = this.c;
                if (t != null) {
                    this.a.onSuccess(t);
                } else {
                    this.a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.o) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.o = true;
            this.f = SubscriptionHelper.CANCELLED;
            this.a.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.o) {
                long j = this.n;
                if (j == this.b) {
                    this.o = true;
                    this.f.cancel();
                    this.f = SubscriptionHelper.CANCELLED;
                    this.a.onSuccess(t);
                    return;
                }
                this.n = j + 1;
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.f, vpf)) {
                this.f = vpf;
                this.a.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public j(g<T> gVar, long j, T t) {
        this.a = gVar;
        this.b = j;
        this.c = t;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        this.a.subscribe((io.reactivex.j) new a(b0Var, this.b, this.c));
    }

    @Override // io.reactivex.internal.fuseable.b
    public g<T> c() {
        return new FlowableElementAt(this.a, this.b, this.c, true);
    }
}
