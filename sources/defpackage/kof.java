package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.t;
import okhttp3.u;
import okhttp3.y;
import okio.k;
import okio.o;
import okio.v;
import okio.w;
import okio.x;

/* renamed from: kof  reason: default package */
public final class kof implements cof {
    final y a;
    final okhttp3.internal.connection.f b;
    final okio.g c;
    final okio.f d;
    int e = 0;
    private long f = 262144;

    /* renamed from: kof$b */
    private abstract class b implements w {
        protected final k a;
        protected boolean b;
        protected long c = 0;

        b(a aVar) {
            this.a = new k(kof.this.c.k());
        }

        /* access modifiers changed from: protected */
        public final void a(boolean z, IOException iOException) {
            kof kof = kof.this;
            int i = kof.e;
            if (i != 6) {
                if (i == 5) {
                    kof.g(this.a);
                    kof kof2 = kof.this;
                    kof2.e = 6;
                    okhttp3.internal.connection.f fVar = kof2.b;
                    if (fVar != null) {
                        fVar.n(!z, kof2, this.c, iOException);
                        return;
                    }
                    return;
                }
                StringBuilder V0 = je.V0("state: ");
                V0.append(kof.this.e);
                throw new IllegalStateException(V0.toString());
            }
        }

        @Override // okio.w
        public long c2(okio.e eVar, long j) {
            try {
                long c2 = kof.this.c.c2(eVar, j);
                if (c2 > 0) {
                    this.c += c2;
                }
                return c2;
            } catch (IOException e) {
                a(false, e);
                throw e;
            }
        }

        @Override // okio.w
        public x k() {
            return this.a;
        }
    }

    /* renamed from: kof$c */
    private final class c implements v {
        private final k a;
        private boolean b;

        c() {
            this.a = new k(kof.this.d.k());
        }

        @Override // okio.v, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (!this.b) {
                this.b = true;
                kof.this.d.e0("0\r\n\r\n");
                kof.this.g(this.a);
                kof.this.e = 3;
            }
        }

        @Override // okio.v, java.io.Flushable
        public synchronized void flush() {
            if (!this.b) {
                kof.this.d.flush();
            }
        }

        @Override // okio.v
        public x k() {
            return this.a;
        }

        @Override // okio.v
        public void l0(okio.e eVar, long j) {
            if (this.b) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                kof.this.d.J1(j);
                kof.this.d.e0("\r\n");
                kof.this.d.l0(eVar, j);
                kof.this.d.e0("\r\n");
            }
        }
    }

    /* renamed from: kof$d */
    private class d extends b {
        private final u n;
        private long o = -1;
        private boolean p = true;

        d(u uVar) {
            super(null);
            this.n = uVar;
        }

        @Override // defpackage.kof.b, okio.w
        public long c2(okio.e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(je.t0("byteCount < 0: ", j));
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (!this.p) {
                return -1;
            } else {
                long j2 = this.o;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        kof.this.c.y0();
                    }
                    try {
                        this.o = kof.this.c.k2();
                        String trim = kof.this.c.y0().trim();
                        if (this.o < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.o + trim + "\"");
                        }
                        if (this.o == 0) {
                            this.p = false;
                            eof.d(kof.this.a.k(), this.n, kof.this.j());
                            a(true, null);
                        }
                        if (!this.p) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long c2 = super.c2(eVar, Math.min(j, this.o));
                if (c2 != -1) {
                    this.o -= c2;
                    return c2;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            }
        }

        @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.b) {
                if (this.p && !rnf.m(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, null);
                }
                this.b = true;
            }
        }
    }

    /* renamed from: kof$e */
    private final class e implements v {
        private final k a;
        private boolean b;
        private long c;

        e(long j) {
            this.a = new k(kof.this.d.k());
            this.c = j;
        }

        @Override // okio.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.b) {
                this.b = true;
                if (this.c <= 0) {
                    kof.this.g(this.a);
                    kof.this.e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        @Override // okio.v, java.io.Flushable
        public void flush() {
            if (!this.b) {
                kof.this.d.flush();
            }
        }

        @Override // okio.v
        public x k() {
            return this.a;
        }

        @Override // okio.v
        public void l0(okio.e eVar, long j) {
            if (!this.b) {
                rnf.f(eVar.size(), 0, j);
                if (j <= this.c) {
                    kof.this.d.l0(eVar, j);
                    this.c -= j;
                    return;
                }
                StringBuilder V0 = je.V0("expected ");
                V0.append(this.c);
                V0.append(" bytes but received ");
                V0.append(j);
                throw new ProtocolException(V0.toString());
            }
            throw new IllegalStateException("closed");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: kof$f */
    public class f extends b {
        private long n;

        f(kof kof, long j) {
            super(null);
            this.n = j;
            if (j == 0) {
                a(true, null);
            }
        }

        @Override // defpackage.kof.b, okio.w
        public long c2(okio.e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(je.t0("byteCount < 0: ", j));
            } else if (!this.b) {
                long j2 = this.n;
                if (j2 == 0) {
                    return -1;
                }
                long c2 = super.c2(eVar, Math.min(j2, j));
                if (c2 != -1) {
                    long j3 = this.n - c2;
                    this.n = j3;
                    if (j3 == 0) {
                        a(true, null);
                    }
                    return c2;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.b) {
                if (this.n != 0 && !rnf.m(this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, null);
                }
                this.b = true;
            }
        }
    }

    /* renamed from: kof$g */
    private class g extends b {
        private boolean n;

        g(kof kof) {
            super(null);
        }

        @Override // defpackage.kof.b, okio.w
        public long c2(okio.e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(je.t0("byteCount < 0: ", j));
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.n) {
                return -1;
            } else {
                long c2 = super.c2(eVar, j);
                if (c2 != -1) {
                    return c2;
                }
                this.n = true;
                a(true, null);
                return -1;
            }
        }

        @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.b) {
                if (!this.n) {
                    a(false, null);
                }
                this.b = true;
            }
        }
    }

    public kof(y yVar, okhttp3.internal.connection.f fVar, okio.g gVar, okio.f fVar2) {
        this.a = yVar;
        this.b = fVar;
        this.c = gVar;
        this.d = fVar2;
    }

    private String i() {
        String V = this.c.V(this.f);
        this.f -= (long) V.length();
        return V;
    }

    @Override // defpackage.cof
    public void a() {
        this.d.flush();
    }

    @Override // defpackage.cof
    public v b(a0 a0Var, long j) {
        if ("chunked".equalsIgnoreCase(a0Var.c("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new c();
            }
            StringBuilder V0 = je.V0("state: ");
            V0.append(this.e);
            throw new IllegalStateException(V0.toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.e == 1) {
            this.e = 2;
            return new e(j);
        } else {
            StringBuilder V02 = je.V0("state: ");
            V02.append(this.e);
            throw new IllegalStateException(V02.toString());
        }
    }

    @Override // defpackage.cof
    public void c(a0 a0Var) {
        Proxy.Type type = this.b.d().m().b().type();
        StringBuilder sb = new StringBuilder();
        sb.append(a0Var.g());
        sb.append(' ');
        if (!a0Var.f() && type == Proxy.Type.HTTP) {
            sb.append(a0Var.k());
        } else {
            sb.append(hof.a(a0Var.k()));
        }
        sb.append(" HTTP/1.1");
        k(a0Var.e(), sb.toString());
    }

    @Override // defpackage.cof
    public void cancel() {
        okhttp3.internal.connection.c d2 = this.b.d();
        if (d2 != null) {
            d2.c();
        }
    }

    @Override // defpackage.cof
    public e0 d(d0 d0Var) {
        this.b.f.getClass();
        String h = d0Var.h("Content-Type");
        if (!eof.b(d0Var)) {
            return new gof(h, 0, o.d(h(0)));
        }
        if ("chunked".equalsIgnoreCase(d0Var.h("Transfer-Encoding"))) {
            u k = d0Var.C().k();
            if (this.e == 4) {
                this.e = 5;
                return new gof(h, -1, o.d(new d(k)));
            }
            StringBuilder V0 = je.V0("state: ");
            V0.append(this.e);
            throw new IllegalStateException(V0.toString());
        }
        long a2 = eof.a(d0Var);
        if (a2 != -1) {
            return new gof(h, a2, o.d(h(a2)));
        }
        if (this.e == 4) {
            okhttp3.internal.connection.f fVar = this.b;
            if (fVar != null) {
                this.e = 5;
                fVar.i();
                return new gof(h, -1, o.d(new g(this)));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder V02 = je.V0("state: ");
        V02.append(this.e);
        throw new IllegalStateException(V02.toString());
    }

    @Override // defpackage.cof
    public d0.a e(boolean z) {
        int i = this.e;
        if (i == 1 || i == 3) {
            try {
                jof a2 = jof.a(i());
                d0.a aVar = new d0.a();
                aVar.m(a2.a);
                aVar.f(a2.b);
                aVar.j(a2.c);
                aVar.i(j());
                if (z && a2.b == 100) {
                    return null;
                }
                if (a2.b == 100) {
                    this.e = 3;
                    return aVar;
                }
                this.e = 4;
                return aVar;
            } catch (EOFException e2) {
                StringBuilder V0 = je.V0("unexpected end of stream on ");
                V0.append(this.b);
                IOException iOException = new IOException(V0.toString());
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            StringBuilder V02 = je.V0("state: ");
            V02.append(this.e);
            throw new IllegalStateException(V02.toString());
        }
    }

    @Override // defpackage.cof
    public void f() {
        this.d.flush();
    }

    /* access modifiers changed from: package-private */
    public void g(k kVar) {
        x i = kVar.i();
        kVar.j(x.d);
        i.a();
        i.b();
    }

    public w h(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new f(this, j);
        }
        StringBuilder V0 = je.V0("state: ");
        V0.append(this.e);
        throw new IllegalStateException(V0.toString());
    }

    public t j() {
        t.a aVar = new t.a();
        while (true) {
            String i = i();
            if (i.length() == 0) {
                return aVar.e();
            }
            pnf.a.a(aVar, i);
        }
    }

    public void k(t tVar, String str) {
        if (this.e == 0) {
            this.d.e0(str).e0("\r\n");
            int g2 = tVar.g();
            for (int i = 0; i < g2; i++) {
                this.d.e0(tVar.d(i)).e0(": ").e0(tVar.i(i)).e0("\r\n");
            }
            this.d.e0("\r\n");
            this.e = 1;
            return;
        }
        StringBuilder V0 = je.V0("state: ");
        V0.append(this.e);
        throw new IllegalStateException(V0.toString());
    }
}
