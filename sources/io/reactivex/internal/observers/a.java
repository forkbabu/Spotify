package io.reactivex.internal.observers;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.e;
import io.reactivex.x;

public abstract class a<T, R> implements x<T>, e<R> {
    protected final x<? super R> a;
    protected b b;
    protected e<T> c;
    protected boolean f;
    protected int n;

    public a(x<? super R> xVar) {
        this.a = xVar;
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        yif.V(th);
        this.b.dispose();
        onError(th);
    }

    /* access modifiers changed from: protected */
    public final int b(int i) {
        e<T> eVar = this.c;
        if (eVar == null || (i & 4) != 0) {
            return 0;
        }
        int g = eVar.g(i);
        if (g != 0) {
            this.n = g;
        }
        return g;
    }

    @Override // io.reactivex.internal.fuseable.j
    public void clear() {
        this.c.clear();
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return this.b.d();
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        this.b.dispose();
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        if (!this.f) {
            this.f = true;
            this.a.onComplete();
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        if (this.f) {
            io.reactivex.plugins.a.g(th);
            return;
        }
        this.f = true;
        this.a.onError(th);
    }

    @Override // io.reactivex.x, io.reactivex.c
    public final void onSubscribe(b bVar) {
        if (DisposableHelper.n(this.b, bVar)) {
            this.b = bVar;
            if (bVar instanceof e) {
                this.c = (e) bVar;
            }
            this.a.onSubscribe(this);
        }
    }
}
