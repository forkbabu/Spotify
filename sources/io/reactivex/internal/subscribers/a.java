package io.reactivex.internal.subscribers;

import io.reactivex.internal.fuseable.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public abstract class a<T, R> implements io.reactivex.internal.fuseable.a<T>, g<R> {
    protected final io.reactivex.internal.fuseable.a<? super R> a;
    protected vpf b;
    protected g<T> c;
    protected boolean f;
    protected int n;

    public a(io.reactivex.internal.fuseable.a<? super R> aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        yif.V(th);
        this.b.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    public final int b(int i) {
        g<T> gVar = this.c;
        if (gVar == null || (i & 4) != 0) {
            return 0;
        }
        int g = gVar.g(i);
        if (g != 0) {
            this.n = g;
        }
        return g;
    }

    @Override // defpackage.vpf
    public void cancel() {
        this.b.cancel();
    }

    @Override // io.reactivex.internal.fuseable.j
    public void clear() {
        this.c.clear();
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.vpf
    public void n(long j) {
        this.b.n(j);
    }

    @Override // io.reactivex.internal.fuseable.j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.upf
    public void onComplete() {
        if (!this.f) {
            this.f = true;
            this.a.onComplete();
        }
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        if (this.f) {
            io.reactivex.plugins.a.g(th);
            return;
        }
        this.f = true;
        this.a.onError(th);
    }

    @Override // io.reactivex.j, defpackage.upf
    public final void onSubscribe(vpf vpf) {
        if (SubscriptionHelper.m(this.b, vpf)) {
            this.b = vpf;
            if (vpf instanceof g) {
                this.c = (g) vpf;
            }
            this.a.onSubscribe(this);
        }
    }
}
