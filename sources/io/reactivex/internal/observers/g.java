package io.reactivex.internal.observers;

import io.reactivex.disposables.b;
import io.reactivex.internal.fuseable.i;
import io.reactivex.internal.util.c;
import io.reactivex.x;

/* JADX WARN: Incorrect class signature, class is equals to this class: <T:Ljava/lang/Object;U:Ljava/lang/Object;V:Ljava/lang/Object;>Lio/reactivex/internal/observers/g;Lio/reactivex/x<TT;>;Lio/reactivex/internal/observers/g<TU;TV;>; */
public abstract class g<T, U, V> extends h implements x<T> {
    protected final x<? super V> b;
    protected final i<U> c;
    protected volatile boolean f;
    protected volatile boolean n;

    public g(x<? super V> xVar, i<U> iVar) {
        this.b = xVar;
        this.c = iVar;
    }

    public abstract void a(x<? super V> xVar, U u);

    public final boolean b() {
        return this.f;
    }

    public final boolean c() {
        return this.n;
    }

    public final boolean e() {
        return this.a.getAndIncrement() == 0;
    }

    /* access modifiers changed from: protected */
    public final void f(U u, boolean z, b bVar) {
        x<? super V> xVar = this.b;
        i<U> iVar = this.c;
        if (this.a.get() != 0 || !this.a.compareAndSet(0, 1)) {
            iVar.offer(u);
            if (!e()) {
                return;
            }
        } else {
            a(xVar, u);
            if (h(-1) == 0) {
                return;
            }
        }
        c.c(iVar, xVar, z, bVar, this);
    }

    /* access modifiers changed from: protected */
    public final void g(U u, boolean z, b bVar) {
        x<? super V> xVar = this.b;
        i<U> iVar = this.c;
        if (this.a.get() != 0 || !this.a.compareAndSet(0, 1)) {
            iVar.offer(u);
            if (!e()) {
                return;
            }
        } else if (iVar.isEmpty()) {
            a(xVar, u);
            if (h(-1) == 0) {
                return;
            }
        } else {
            iVar.offer(u);
        }
        c.c(iVar, xVar, z, bVar, this);
    }

    public final int h(int i) {
        return this.a.addAndGet(i);
    }
}
