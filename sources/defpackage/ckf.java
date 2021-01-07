package defpackage;

import defpackage.ckf;
import io.netty.channel.d;
import io.netty.channel.d0;
import io.netty.channel.g;
import io.netty.channel.i;
import io.netty.channel.j0;
import io.netty.channel.p;
import io.netty.channel.q0;
import io.netty.util.concurrent.l;
import io.netty.util.concurrent.t;
import io.netty.util.e;
import io.netty.util.internal.r;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ckf  reason: default package */
public abstract class ckf<B extends ckf<B, C>, C extends d> implements Cloneable {
    volatile j0 a;
    private volatile hkf<? extends C> b;
    private volatile SocketAddress c;
    private final Map<p<?>, Object> f;
    private final Map<e<?>, Object> n;
    private volatile i o;

    /* renamed from: ckf$a */
    static final class a extends d0 {
        private volatile boolean w;

        a(d dVar) {
            super(dVar);
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.channel.d0, io.netty.util.concurrent.i
        public l F() {
            if (this.w) {
                return super.F();
            }
            return t.w;
        }

        /* access modifiers changed from: package-private */
        public void P() {
            this.w = true;
        }
    }

    ckf() {
        this.f = new LinkedHashMap();
        this.n = new LinkedHashMap();
    }

    static <K, V> Map<K, V> g(Map<K, V> map) {
        synchronized (map) {
            if (map.isEmpty()) {
                return Collections.emptyMap();
            }
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<e<?>, Object> b() {
        return g(this.n);
    }

    /* access modifiers changed from: package-private */
    public final Map<e<?>, Object> c() {
        return this.n;
    }

    public B d(Class<? extends C> cls) {
        q0 q0Var = new q0(cls);
        if (this.b == null) {
            this.b = q0Var;
            return this;
        }
        throw new IllegalStateException("channelFactory set already");
    }

    /* access modifiers changed from: package-private */
    public final hkf<? extends C> e() {
        return this.b;
    }

    public abstract dkf<B, C> f();

    public B j(j0 j0Var) {
        if (j0Var == null) {
            throw new NullPointerException("group");
        } else if (this.a == null) {
            this.a = j0Var;
            return this;
        } else {
            throw new IllegalStateException("group set already");
        }
    }

    public B k(i iVar) {
        if (iVar != null) {
            this.o = iVar;
            return this;
        }
        throw new NullPointerException("handler");
    }

    /* access modifiers changed from: package-private */
    public final i m() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public abstract void n(d dVar);

    /* access modifiers changed from: package-private */
    public final g o() {
        d dVar = null;
        try {
            d a2 = ((q0) this.b).a();
            n(a2);
            g q1 = f().a.a.q1(a2);
            if (q1.r() != null) {
                if (a2.g0()) {
                    a2.close();
                } else {
                    a2.l0().D();
                }
            }
            return q1;
        } catch (Throwable th) {
            if (0 != 0) {
                dVar.l0().D();
            }
            d0 d0Var = new d0(null, t.w);
            d0Var.mo85g(th);
            return d0Var;
        }
    }

    /* access modifiers changed from: package-private */
    public final SocketAddress p() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final Map<p<?>, Object> q() {
        return g(this.f);
    }

    /* access modifiers changed from: package-private */
    public final Map<p<?>, Object> r() {
        return this.f;
    }

    public B s() {
        if (this.a == null) {
            throw new IllegalStateException("group not set");
        } else if (this.b != null) {
            return this;
        } else {
            throw new IllegalStateException("channel or channelFactory not set");
        }
    }

    @Override // java.lang.Object
    public String toString() {
        return r.f(this) + '(' + f() + ')';
    }

    ckf(ckf<B, C> ckf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.n = linkedHashMap2;
        this.a = ckf.a;
        this.b = ckf.b;
        this.o = ckf.o;
        this.c = ckf.c;
        synchronized (ckf.f) {
            linkedHashMap.putAll(ckf.f);
        }
        synchronized (ckf.n) {
            linkedHashMap2.putAll(ckf.n);
        }
    }
}
