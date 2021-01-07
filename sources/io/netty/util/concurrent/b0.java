package io.netty.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

class b0<V> extends i<V> implements RunnableFuture<V> {
    protected final Callable<V> v;

    /* access modifiers changed from: private */
    public static final class a<T> implements Callable<T> {
        final Runnable a;
        final T b;

        a(Runnable runnable, T t) {
            this.a = runnable;
            this.b = t;
        }

        @Override // java.util.concurrent.Callable
        public T call() {
            this.a.run();
            return this.b;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("Callable(task: ");
            V0.append(this.a);
            V0.append(", result: ");
            V0.append((Object) this.b);
            V0.append(')');
            return V0.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b0(l lVar, Runnable runnable, V v2) {
        super(lVar);
        a aVar = new a(runnable, v2);
        this.v = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.concurrent.i
    public StringBuilder O() {
        StringBuilder O = super.O();
        O.setCharAt(O.length() - 1, ',');
        O.append(" task: ");
        O.append(this.v);
        O.append(')');
        return O;
    }

    /* access modifiers changed from: protected */
    public final y<V> P(Throwable th) {
        super.mo85g(th);
        return this;
    }

    /* access modifiers changed from: protected */
    public final y<V> Q(V v2) {
        super.v(v2);
        return this;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // io.netty.util.concurrent.i, io.netty.util.concurrent.y, io.netty.channel.v
    /* renamed from: g */
    public final y<V> mo85g(Throwable th) {
        throw new IllegalStateException();
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // io.netty.util.concurrent.i, io.netty.util.concurrent.y
    public final boolean n(Throwable th) {
        return false;
    }

    @Override // io.netty.util.concurrent.i, io.netty.util.concurrent.y
    public final boolean p(V v2) {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        try {
            if (k()) {
                super.v(this.v.call());
            }
        } catch (Throwable th) {
            super.mo85g(th);
        }
    }

    @Override // io.netty.util.concurrent.i, io.netty.util.concurrent.y
    public final y<V> v(V v2) {
        throw new IllegalStateException();
    }

    b0(l lVar, Callable<V> callable) {
        super(lVar);
        this.v = callable;
    }
}
