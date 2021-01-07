package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.internal.connection.f;
import okhttp3.internal.http2.j;
import okhttp3.t;
import okhttp3.v;
import okhttp3.y;
import okio.ByteString;
import okio.e;
import okio.j;
import okio.o;
import okio.w;

public final class d implements cof {
    private static final List<String> f = rnf.r("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> g = rnf.r("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final v.a a;
    final f b;
    private final e c;
    private j d;
    private final Protocol e;

    class a extends j {
        boolean b = false;
        long c = 0;

        a(w wVar) {
            super(wVar);
        }

        private void b(IOException iOException) {
            if (!this.b) {
                this.b = true;
                d dVar = d.this;
                dVar.b.n(false, dVar, this.c, iOException);
            }
        }

        @Override // okio.j, okio.w
        public long c2(e eVar, long j) {
            try {
                long c2 = a().c2(eVar, j);
                if (c2 > 0) {
                    this.c += c2;
                }
                return c2;
            } catch (IOException e) {
                b(e);
                throw e;
            }
        }

        @Override // okio.j, okio.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            b(null);
        }
    }

    public d(y yVar, v.a aVar, f fVar, e eVar) {
        this.a = aVar;
        this.b = fVar;
        this.c = eVar;
        List<Protocol> s = yVar.s();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.e = !s.contains(protocol) ? Protocol.HTTP_2 : protocol;
    }

    @Override // defpackage.cof
    public void a() {
        ((j.a) this.d.g()).close();
    }

    @Override // defpackage.cof
    public okio.v b(a0 a0Var, long j) {
        return this.d.g();
    }

    @Override // defpackage.cof
    public void c(a0 a0Var) {
        if (this.d == null) {
            boolean z = a0Var.a() != null;
            t e2 = a0Var.e();
            ArrayList arrayList = new ArrayList(e2.g() + 4);
            arrayList.add(new a(a.f, a0Var.g()));
            arrayList.add(new a(a.g, hof.a(a0Var.k())));
            String c2 = a0Var.c("Host");
            if (c2 != null) {
                arrayList.add(new a(a.i, c2));
            }
            arrayList.add(new a(a.h, a0Var.k().z()));
            int g2 = e2.g();
            for (int i = 0; i < g2; i++) {
                ByteString m = ByteString.m(e2.d(i).toLowerCase(Locale.US));
                if (!f.contains(m.C())) {
                    arrayList.add(new a(m, e2.i(i)));
                }
            }
            j B = this.c.B(arrayList, z);
            this.d = B;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            B.i.g((long) ((fof) this.a).h(), timeUnit);
            this.d.j.g((long) ((fof) this.a).k(), timeUnit);
        }
    }

    @Override // defpackage.cof
    public void cancel() {
        j jVar = this.d;
        if (jVar != null) {
            jVar.f(ErrorCode.CANCEL);
        }
    }

    @Override // defpackage.cof
    public e0 d(d0 d0Var) {
        this.b.f.getClass();
        return new gof(d0Var.h("Content-Type"), eof.a(d0Var), o.d(new a(this.d.h())));
    }

    @Override // defpackage.cof
    public d0.a e(boolean z) {
        t n = this.d.n();
        Protocol protocol = this.e;
        t.a aVar = new t.a();
        int g2 = n.g();
        jof jof = null;
        for (int i = 0; i < g2; i++) {
            String d2 = n.d(i);
            String i2 = n.i(i);
            if (d2.equals(":status")) {
                jof = jof.a("HTTP/1.1 " + i2);
            } else if (!g.contains(d2)) {
                pnf.a.b(aVar, d2, i2);
            }
        }
        if (jof != null) {
            d0.a aVar2 = new d0.a();
            aVar2.m(protocol);
            aVar2.f(jof.b);
            aVar2.j(jof.c);
            aVar2.i(aVar.e());
            if (!z || pnf.a.d(aVar2) != 100) {
                return aVar2;
            }
            return null;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // defpackage.cof
    public void f() {
        this.c.E.flush();
    }
}
