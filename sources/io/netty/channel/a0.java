package io.netty.channel;

import io.netty.channel.d;
import io.netty.channel.m0;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.concurrent.l;
import io.netty.util.concurrent.n;
import io.netty.util.concurrent.p;
import io.netty.util.internal.r;
import io.netty.util.o;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.RejectedExecutionException;

public class a0 implements t {
    static final io.netty.util.internal.logging.b t = io.netty.util.internal.logging.c.b(a0.class.getName());
    private static final String u = i0(d.class);
    private static final String v = i0(h.class);
    private static final p<Map<Class<?>, String>> w = new a();
    final b a;
    final b b;
    private final d c;
    private final w0 f;
    private final boolean n = ResourceLeakDetector.g();
    private Map<n, l> o;
    private m0.a p;
    private boolean q = true;
    private f r;
    private boolean s;

    static class a extends p<Map<Class<?>, String>> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.concurrent.p
        public Map<Class<?>, String> d() {
            return new WeakHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        final /* synthetic */ b a;

        b(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.R(this.a, true);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        final /* synthetic */ b a;

        c(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.Q(Thread.currentThread(), this.a, true);
        }
    }

    final class d extends b implements r, l {
        private final d.a A;

        d(a0 a0Var) {
            super(a0Var, null, a0.u, false, true);
            this.A = a0Var.h().l0();
            n1();
        }

        private void u1() {
            if (((y) a0.this.c.X()).l()) {
                a0.this.c.read();
            }
        }

        @Override // io.netty.channel.l
        public void B(k kVar) {
            kVar.A();
            u1();
        }

        @Override // io.netty.channel.i
        public void D(k kVar) {
        }

        @Override // io.netty.channel.l
        public void F(k kVar) {
            a0.this.o0();
            kVar.m();
        }

        @Override // io.netty.channel.l
        public void G(k kVar) {
            kVar.m0();
        }

        @Override // io.netty.channel.r
        public void J(k kVar, SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
            this.A.u(socketAddress, socketAddress2, vVar);
        }

        @Override // io.netty.channel.r
        public void L(k kVar) {
            this.A.B();
        }

        @Override // io.netty.channel.l
        public void M(k kVar) {
            kVar.P();
            u1();
        }

        @Override // io.netty.channel.r
        public void Q(k kVar, v vVar) {
            this.A.i(vVar);
        }

        @Override // io.netty.channel.l
        public void S(k kVar, Object obj) {
            kVar.N(obj);
        }

        @Override // io.netty.channel.k
        public i T() {
            return this;
        }

        @Override // io.netty.channel.r
        public void U(k kVar, v vVar) {
            this.A.k(vVar);
        }

        @Override // io.netty.channel.r
        public void W(k kVar, Object obj, v vVar) {
            this.A.x(obj, vVar);
        }

        @Override // io.netty.channel.l
        public void b0(k kVar) {
            kVar.w();
        }

        @Override // io.netty.channel.l
        public void c0(k kVar, Object obj) {
            kVar.s(obj);
        }

        @Override // io.netty.channel.i, io.netty.channel.l
        public void d(k kVar, Throwable th) {
            kVar.v(th);
        }

        @Override // io.netty.channel.r
        public void g(k kVar) {
            this.A.flush();
        }

        @Override // io.netty.channel.l
        public void p(k kVar) {
            kVar.I();
            if (!a0.this.c.isOpen()) {
                a0.H(a0.this);
            }
        }

        @Override // io.netty.channel.i
        public void r(k kVar) {
        }
    }

    /* access modifiers changed from: private */
    public final class e extends f {
        e(b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: package-private */
        @Override // io.netty.channel.a0.f
        public void a() {
            l k0 = this.a.k0();
            if (k0.G()) {
                a0.this.J(this.a);
                return;
            }
            try {
                k0.execute(this);
            } catch (RejectedExecutionException e) {
                if (a0.t.a()) {
                    a0.t.warn("Can't invoke handlerAdded() as the EventExecutor {} rejected it, removing handler {}.", k0, this.a.j1(), e);
                }
                b bVar = this.a;
                b bVar2 = bVar.f;
                b bVar3 = bVar.c;
                bVar2.c = bVar3;
                bVar3.f = bVar2;
                this.a.p1();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.J(this.a);
        }
    }

    /* access modifiers changed from: private */
    public static abstract class f implements Runnable {
        final b a;
        f b;

        f(b bVar) {
            this.a = bVar;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();
    }

    /* access modifiers changed from: private */
    public final class g extends f {
        g(b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: package-private */
        @Override // io.netty.channel.a0.f
        public void a() {
            l k0 = this.a.k0();
            if (k0.G()) {
                a0.this.L(this.a);
                return;
            }
            try {
                k0.execute(this);
            } catch (RejectedExecutionException e) {
                if (a0.t.a()) {
                    a0.t.warn("Can't invoke handlerRemoved() as the EventExecutor {} rejected it, removing handler {}.", k0, this.a.j1(), e);
                }
                this.a.p1();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.L(this.a);
        }
    }

    final class h extends b implements l {
        h(a0 a0Var) {
            super(a0Var, null, a0.v, true, false);
            n1();
        }

        @Override // io.netty.channel.l
        public void B(k kVar) {
        }

        @Override // io.netty.channel.i
        public void D(k kVar) {
        }

        @Override // io.netty.channel.l
        public void F(k kVar) {
        }

        @Override // io.netty.channel.l
        public void G(k kVar) {
        }

        @Override // io.netty.channel.l
        public void M(k kVar) {
        }

        @Override // io.netty.channel.l
        public void S(k kVar, Object obj) {
            a0.this.getClass();
            try {
                a0.t.r("Discarded inbound message {} that reached at the tail of the pipeline. Please check your pipeline configuration.", obj);
            } finally {
                io.netty.util.n.a(obj);
            }
        }

        @Override // io.netty.channel.k
        public i T() {
            return this;
        }

        @Override // io.netty.channel.l
        public void b0(k kVar) {
        }

        @Override // io.netty.channel.l
        public void c0(k kVar, Object obj) {
            io.netty.util.n.a(obj);
        }

        @Override // io.netty.channel.l
        public void d(k kVar, Throwable th) {
            a0.this.getClass();
            try {
                a0.t.j("An exceptionCaught() event was fired, and it reached at the tail of the pipeline. It usually means the last handler in the pipeline did not handle the exception.", th);
            } finally {
                io.netty.util.n.a(th);
            }
        }

        @Override // io.netty.channel.l
        public void p(k kVar) {
        }

        @Override // io.netty.channel.i
        public void r(k kVar) {
        }
    }

    static {
        int i = io.netty.util.internal.logging.c.b;
    }

    protected a0(d dVar) {
        this.c = dVar;
        new v0(dVar, null);
        this.f = new w0(dVar, true);
        h hVar = new h(this);
        this.b = hVar;
        d dVar2 = new d(this);
        this.a = dVar2;
        dVar2.c = hVar;
        hVar.f = dVar2;
    }

    static void H(a0 a0Var) {
        synchronized (a0Var) {
            a0Var.R(a0Var.a.c, false);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void J(b bVar) {
        boolean z;
        try {
            bVar.T().D(bVar);
            bVar.n1();
            return;
        } catch (Throwable th) {
            bVar.p1();
            throw th;
        }
        if (z) {
            b.b1(this.a, new ChannelPipelineException(bVar.T().getClass().getName() + ".handlerAdded() has thrown an exception; removed.", th));
            return;
        }
        b.b1(this.a, new ChannelPipelineException(bVar.T().getClass().getName() + ".handlerAdded() has thrown an exception; also failed to remove.", th));
    }

    private void K(b bVar, boolean z) {
        f eVar = z ? new e(bVar) : new g(bVar);
        f fVar = this.r;
        if (fVar == null) {
            this.r = eVar;
            return;
        }
        while (true) {
            f fVar2 = fVar.b;
            if (fVar2 != null) {
                fVar = fVar2;
            } else {
                fVar.b = eVar;
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void L(b bVar) {
        try {
            bVar.T().r(bVar);
            bVar.p1();
        } catch (Throwable th) {
            b.b1(this.a, new ChannelPipelineException(bVar.T().getClass().getName() + ".handlerRemoved() has thrown an exception.", th));
        }
    }

    private static void M(i iVar) {
        if (iVar instanceof j) {
            j jVar = (j) iVar;
            if (jVar.a() || !jVar.a) {
                jVar.a = true;
                return;
            }
            throw new ChannelPipelineException(jVar.getClass().getName() + " is not a @Sharable handler, so can't be added or removed multiple times.");
        }
    }

    private b O(String str) {
        for (b bVar = this.a.c; bVar != this.b; bVar = bVar.c) {
            if (bVar.j1().equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Q(Thread thread, b bVar, boolean z) {
        b bVar2 = this.a;
        while (bVar != bVar2) {
            l k0 = bVar.k0();
            if (z || k0.A1(thread)) {
                synchronized (this) {
                    b bVar3 = bVar.f;
                    b bVar4 = bVar.c;
                    bVar3.c = bVar4;
                    bVar4.f = bVar3;
                }
                L(bVar);
                bVar = bVar.f;
                z = false;
            } else {
                k0.execute(new c(bVar));
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void R(b bVar, boolean z) {
        Thread currentThread = Thread.currentThread();
        b bVar2 = this.b;
        while (bVar != bVar2) {
            l k0 = bVar.k0();
            if (z || k0.A1(currentThread)) {
                bVar = bVar.c;
                z = false;
            } else {
                k0.execute(new b(bVar));
                return;
            }
        }
        Q(currentThread, bVar2.f, z);
    }

    private String Y(String str, i iVar) {
        if (str == null) {
            Map<Class<?>, String> b2 = w.b();
            Class<?> cls = iVar.getClass();
            String str2 = b2.get(cls);
            if (str2 == null) {
                str2 = i0(cls);
                b2.put(cls, str2);
            }
            if (O(str2) != null) {
                int i = 1;
                String substring = str2.substring(0, str2.length() - 1);
                while (true) {
                    str2 = je.p0(substring, i);
                    if (O(str2) == null) {
                        break;
                    }
                    i++;
                }
            }
            return str2;
        } else if (O(str) == null) {
            return str;
        } else {
            throw new IllegalArgumentException(je.x0("Duplicate handler name: ", str));
        }
    }

    private static String i0(Class<?> cls) {
        return r.e(cls) + "#0";
    }

    private b p0(n nVar, String str, i iVar) {
        l lVar;
        if (nVar == null) {
            lVar = null;
        } else {
            Boolean bool = (Boolean) this.c.X().b(p.H);
            if (bool == null || bool.booleanValue()) {
                Map map = this.o;
                if (map == null) {
                    map = new IdentityHashMap(4);
                    this.o = map;
                }
                l lVar2 = (l) map.get(nVar);
                if (lVar2 == null) {
                    lVar2 = nVar.next();
                    map.put(nVar, lVar2);
                }
                lVar = lVar2;
            } else {
                lVar = nVar.next();
            }
        }
        return new z(this, lVar, str, iVar);
    }

    @Override // io.netty.channel.t
    public final t A0(i... iVarArr) {
        for (i iVar : iVarArr) {
            if (iVar == null) {
                break;
            }
            synchronized (this) {
                M(iVar);
                b p0 = p0(null, Y(null, iVar), iVar);
                b bVar = this.b.f;
                p0.f = bVar;
                p0.c = this.b;
                bVar.c = p0;
                this.b.f = p0;
                if (!this.s) {
                    p0.o1();
                    K(p0, true);
                } else {
                    l k0 = p0.k0();
                    if (!k0.G()) {
                        p0.o1();
                        k0.execute(new b0(this, p0));
                    } else {
                        J(p0);
                    }
                }
            }
        }
        return this;
    }

    @Override // io.netty.channel.t
    public final k H1(i iVar) {
        if (iVar != null) {
            for (b bVar = this.a.c; bVar != null; bVar = bVar.c) {
                if (bVar.T() == iVar) {
                    return bVar;
                }
            }
            return null;
        }
        throw new NullPointerException("handler");
    }

    /* access modifiers changed from: package-private */
    public final m0.a S() {
        if (this.p == null) {
            this.p = ((y) this.c.X()).f().a();
        }
        return this.p;
    }

    public final t Z() {
        b.K0(this.a);
        return this;
    }

    public final t a0(Object obj) {
        b.N0(this.a, obj);
        return this;
    }

    @Override // io.netty.channel.s
    public final g close() {
        return this.b.close();
    }

    public final t e0() {
        b.Q0(this.a);
        return this;
    }

    public final d h() {
        return this.c;
    }

    @Override // io.netty.channel.s
    public final g h0(SocketAddress socketAddress, v vVar) {
        this.b.u(socketAddress, null, vVar);
        return vVar;
    }

    public final Iterator<Map.Entry<String, i>> iterator() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (b bVar = this.a.c; bVar != this.b; bVar = bVar.c) {
            linkedHashMap.put(bVar.j1(), bVar.T());
        }
        return linkedHashMap.entrySet().iterator();
    }

    @Override // io.netty.channel.s
    public final v l() {
        return this.f;
    }

    @Override // io.netty.channel.t
    public final t m() {
        b.S0(this.a);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void o0() {
        f fVar;
        if (this.q) {
            this.q = false;
            synchronized (this) {
                this.s = true;
                this.r = null;
            }
            for (fVar = this.r; fVar != null; fVar = fVar.b) {
                fVar.a();
            }
        }
    }

    @Override // io.netty.channel.s
    public final v q() {
        return new d0(this.c);
    }

    /* access modifiers changed from: package-private */
    public final Object q0(Object obj, b bVar) {
        if (!this.n) {
            return obj;
        }
        int i = io.netty.util.n.b;
        return obj instanceof o ? ((o) obj).z(bVar) : obj;
    }

    @Override // io.netty.channel.t
    public final t s(Object obj) {
        b.g1(this.a, obj);
        return this;
    }

    @Override // io.netty.channel.t
    public final t s1(i iVar) {
        b bVar = (b) H1(iVar);
        if (bVar != null) {
            synchronized (this) {
                b bVar2 = bVar.f;
                b bVar3 = bVar.c;
                bVar2.c = bVar3;
                bVar3.f = bVar2;
                if (!this.s) {
                    K(bVar, false);
                } else {
                    l k0 = bVar.k0();
                    if (!k0.G()) {
                        k0.execute(new c0(this, bVar));
                    } else {
                        L(bVar);
                    }
                }
            }
            return this;
        }
        throw new NoSuchElementException(iVar.getClass().getName());
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(r.f(this));
        sb.append('{');
        b bVar = this.a.c;
        while (bVar != this.b) {
            sb.append('(');
            sb.append(bVar.j1());
            sb.append(" = ");
            sb.append(bVar.T().getClass().getName());
            sb.append(')');
            bVar = bVar.c;
            if (bVar == this.b) {
                break;
            }
            sb.append(", ");
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // io.netty.channel.s
    public final g u(SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
        return this.b.u(socketAddress, socketAddress2, vVar);
    }

    @Override // io.netty.channel.t
    public final t v(Throwable th) {
        b.b1(this.a, th);
        return this;
    }

    @Override // io.netty.channel.t
    public final t w() {
        b.X0(this.a);
        return this;
    }

    @Override // io.netty.channel.s
    public final g z(Object obj) {
        b bVar = this.b;
        v q2 = bVar.q();
        bVar.t1(obj, q2);
        return q2;
    }
}
