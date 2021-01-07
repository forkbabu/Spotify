package io.netty.channel;

import io.netty.buffer.k;
import io.netty.channel.l;
import io.netty.channel.r;
import io.netty.util.internal.logging.c;
import java.net.SocketAddress;

public class x<I extends l, O extends r> extends f {
    private static final io.netty.util.internal.logging.b o = c.b(x.class.getName());
    private b b;
    private b c;
    private I f;
    private O n;

    class a extends b {
        a(k kVar, i iVar) {
            super(kVar, iVar);
        }

        @Override // io.netty.channel.x.b, io.netty.channel.k
        public k v(Throwable th) {
            if (!x.this.c.c) {
                try {
                    x.this.n.d(x.this.c, th);
                } catch (Throwable th2) {
                    if (x.o.c()) {
                        x.o.b("An exception {}was thrown by a user handler's exceptionCaught() method while handling the following exception:", yif.U(th2), th);
                    } else if (x.o.a()) {
                        x.o.g("An exception '{}' [enable DEBUG level for full stacktrace] was thrown by a user handler's exceptionCaught() method while handling the following exception:", th2, th);
                    }
                }
            } else {
                super.v(th);
            }
            return this;
        }
    }

    /* access modifiers changed from: private */
    public static class b implements k {
        private final k a;
        private final i b;
        boolean c;

        /* access modifiers changed from: package-private */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c();
            }
        }

        b(k kVar, i iVar) {
            this.a = kVar;
            this.b = iVar;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void c() {
            if (!this.c) {
                this.c = true;
                try {
                    this.b.r(this);
                } catch (Throwable th) {
                    v(new ChannelPipelineException(this.b.getClass().getName() + ".handlerRemoved() has thrown an exception.", th));
                }
            }
        }

        @Override // io.netty.channel.k
        public k A() {
            this.a.A();
            return this;
        }

        @Override // io.netty.channel.k
        public k I() {
            this.a.I();
            return this;
        }

        @Override // io.netty.channel.k
        public k N(Object obj) {
            this.a.N(obj);
            return this;
        }

        @Override // io.netty.channel.k
        public k P() {
            this.a.P();
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            io.netty.util.concurrent.l k0 = k0();
            if (k0.G()) {
                c();
            } else {
                k0.execute(new a());
            }
        }

        @Override // io.netty.channel.s
        public g close() {
            return this.a.close();
        }

        @Override // io.netty.channel.k
        public boolean d0() {
            return this.c || this.a.d0();
        }

        @Override // io.netty.channel.k
        public k flush() {
            this.a.flush();
            return this;
        }

        @Override // io.netty.channel.k
        public d h() {
            return this.a.h();
        }

        @Override // io.netty.channel.s
        public g h0(SocketAddress socketAddress, v vVar) {
            return this.a.h0(socketAddress, vVar);
        }

        @Override // io.netty.channel.s
        public g i(v vVar) {
            return this.a.i(vVar);
        }

        @Override // io.netty.channel.s
        public g k(v vVar) {
            return this.a.k(vVar);
        }

        @Override // io.netty.channel.k
        public io.netty.util.concurrent.l k0() {
            return this.a.k0();
        }

        @Override // io.netty.channel.s
        public v l() {
            return this.a.l();
        }

        @Override // io.netty.channel.k
        public k m() {
            this.a.m();
            return this;
        }

        @Override // io.netty.channel.k
        public k m0() {
            this.a.m0();
            return this;
        }

        @Override // io.netty.channel.s
        public g n(Object obj) {
            return this.a.n(obj);
        }

        @Override // io.netty.channel.k
        public t o() {
            return this.a.o();
        }

        @Override // io.netty.channel.s
        public v q() {
            return this.a.q();
        }

        @Override // io.netty.channel.k
        public k read() {
            this.a.read();
            return this;
        }

        @Override // io.netty.channel.k
        public k s(Object obj) {
            this.a.s(obj);
            return this;
        }

        @Override // io.netty.channel.k
        public k t() {
            return this.a.t();
        }

        @Override // io.netty.channel.s
        public g u(SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
            return this.a.u(socketAddress, socketAddress2, vVar);
        }

        @Override // io.netty.channel.k
        public k v(Throwable th) {
            this.a.v(th);
            return this;
        }

        @Override // io.netty.channel.k
        public k w() {
            this.a.w();
            return this;
        }

        @Override // io.netty.channel.s
        public g x(Object obj, v vVar) {
            return this.a.x(obj, vVar);
        }
    }

    static {
        int i = c.b;
    }

    protected x() {
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void B(k kVar) {
        b bVar = this.b;
        if (!bVar.c) {
            this.f.B(bVar);
        } else {
            bVar.A();
        }
    }

    @Override // io.netty.channel.j, io.netty.channel.i
    public void D(k kVar) {
        I i = this.f;
        if (i != null) {
            this.c = new b(kVar, this.n);
            a aVar = new a(kVar, i);
            this.b = aVar;
            try {
                i.D(aVar);
            } finally {
                this.n.D(this.c);
            }
        } else {
            StringBuilder V0 = je.V0("init() must be invoked before being added to a ");
            V0.append(t.class.getSimpleName());
            V0.append(" if ");
            V0.append(x.class.getSimpleName());
            V0.append(" was constructed with the default constructor.");
            throw new IllegalStateException(V0.toString());
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void F(k kVar) {
        b bVar = this.b;
        if (!bVar.c) {
            this.f.F(bVar);
        } else {
            bVar.m();
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void G(k kVar) {
        b bVar = this.b;
        if (!bVar.c) {
            this.f.G(bVar);
        } else {
            bVar.m0();
        }
    }

    @Override // io.netty.channel.r
    public void J(k kVar, SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
        b bVar = this.c;
        if (!bVar.c) {
            this.n.J(bVar, socketAddress, socketAddress2, vVar);
        } else {
            bVar.h0(socketAddress2, vVar);
        }
    }

    @Override // io.netty.channel.f, io.netty.channel.r
    public void L(k kVar) {
        b bVar = this.c;
        if (!bVar.c) {
            this.n.L(bVar);
        } else {
            bVar.read();
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void M(k kVar) {
        b bVar = this.b;
        if (!bVar.c) {
            this.f.M(bVar);
        } else {
            bVar.P();
        }
    }

    @Override // io.netty.channel.r
    public void Q(k kVar, v vVar) {
        b bVar = this.c;
        if (!bVar.c) {
            this.n.Q(bVar, vVar);
        } else {
            bVar.i(vVar);
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void S(k kVar, Object obj) {
        b bVar = this.b;
        if (!bVar.c) {
            this.f.S(bVar, obj);
        } else {
            bVar.N(obj);
        }
    }

    @Override // io.netty.channel.r
    public void U(k kVar, v vVar) {
        b bVar = this.c;
        if (!bVar.c) {
            this.n.U(bVar, vVar);
        } else {
            bVar.k(vVar);
        }
    }

    @Override // io.netty.channel.r
    public void W(k kVar, Object obj, v vVar) {
        b bVar = this.c;
        if (!bVar.c) {
            this.n.W(bVar, obj, vVar);
        } else {
            bVar.x(obj, vVar);
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void b0(k kVar) {
        b bVar = this.b;
        if (!bVar.c) {
            this.f.b0(bVar);
        } else {
            bVar.w();
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void c0(k kVar, Object obj) {
        b bVar = this.b;
        if (!bVar.c) {
            this.f.c0(bVar, obj);
        } else {
            bVar.s(obj);
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.j, io.netty.channel.i, io.netty.channel.l
    public void d(k kVar, Throwable th) {
        b bVar = this.b;
        if (!bVar.c) {
            this.f.d(bVar, th);
        } else {
            bVar.v(th);
        }
    }

    /* access modifiers changed from: protected */
    public final void f(I i, O o2) {
        if (this.f != null) {
            throw new IllegalStateException(je.m0(x.class, je.V0("init() can not be invoked if "), " was constructed with non-default constructor."));
        } else if (i instanceof r) {
            throw new IllegalArgumentException(je.m0(r.class, je.V0("inboundHandler must not implement "), " to get combined."));
        } else if (!(o2 instanceof l)) {
            this.f = i;
            this.n = o2;
        } else {
            throw new IllegalArgumentException(je.m0(l.class, je.V0("outboundHandler must not implement "), " to get combined."));
        }
    }

    @Override // io.netty.channel.r
    public void g(k kVar) {
        b bVar = this.c;
        if (!bVar.c) {
            this.n.g(bVar);
        } else {
            bVar.flush();
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void p(k kVar) {
        b bVar = this.b;
        if (!bVar.c) {
            this.f.p(bVar);
        } else {
            bVar.I();
        }
    }

    @Override // io.netty.channel.j, io.netty.channel.i
    public void r(k kVar) {
        try {
            this.b.b();
        } finally {
            this.c.b();
        }
    }
}
