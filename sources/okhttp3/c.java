package okhttp3;

import defpackage.wnf;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.t;
import okio.ByteString;
import okio.e;
import okio.f;
import okio.g;
import okio.i;
import okio.j;
import okio.o;
import okio.v;
import okio.w;

public final class c implements Closeable, Flushable {
    final znf a = new a();
    final wnf b;
    int c;
    int f;
    private int n;
    private int o;
    private int p;

    class a implements znf {
        a() {
        }

        @Override // defpackage.znf
        public void a(vnf vnf) {
            c.this.g(vnf);
        }

        @Override // defpackage.znf
        public void b(a0 a0Var) {
            c.this.b.v(c.b(a0Var.a));
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        @Override // defpackage.znf
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public defpackage.unf c(okhttp3.d0 r5) {
            /*
                r4 = this;
                okhttp3.c r0 = okhttp3.c.this
                r0.getClass()
                okhttp3.a0 r1 = r5.a
                java.lang.String r1 = r1.b
                boolean r2 = defpackage.yif.u(r1)
                r3 = 0
                if (r2 == 0) goto L_0x001e
                okhttp3.a0 r5 = r5.a     // Catch:{ IOException -> 0x0060 }
                wnf r0 = r0.b     // Catch:{ IOException -> 0x0060 }
                okhttp3.u r5 = r5.a     // Catch:{ IOException -> 0x0060 }
                java.lang.String r5 = okhttp3.c.b(r5)     // Catch:{ IOException -> 0x0060 }
                r0.v(r5)     // Catch:{ IOException -> 0x0060 }
                goto L_0x0060
            L_0x001e:
                java.lang.String r2 = "GET"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0027
                goto L_0x0060
            L_0x0027:
                int r1 = defpackage.eof.a
                okhttp3.t r1 = r5.o
                java.util.Set r1 = defpackage.eof.f(r1)
                java.lang.String r2 = "*"
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L_0x0038
                goto L_0x0060
            L_0x0038:
                okhttp3.c$d r1 = new okhttp3.c$d
                r1.<init>(r5)
                wnf r2 = r0.b     // Catch:{ IOException -> 0x005a }
                okhttp3.a0 r5 = r5.a     // Catch:{ IOException -> 0x005a }
                okhttp3.u r5 = r5.a     // Catch:{ IOException -> 0x005a }
                java.lang.String r5 = okhttp3.c.b(r5)     // Catch:{ IOException -> 0x005a }
                wnf$b r5 = r2.f(r5)     // Catch:{ IOException -> 0x005a }
                if (r5 != 0) goto L_0x004e
                goto L_0x0060
            L_0x004e:
                r1.e(r5)     // Catch:{ IOException -> 0x0058 }
                okhttp3.c$b r1 = new okhttp3.c$b     // Catch:{ IOException -> 0x0058 }
                r1.<init>(r5)     // Catch:{ IOException -> 0x0058 }
                r3 = r1
                goto L_0x0060
            L_0x0058:
                goto L_0x005b
            L_0x005a:
                r5 = r3
            L_0x005b:
                if (r5 == 0) goto L_0x0060
                r5.a()
            L_0x0060:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.c.a.c(okhttp3.d0):unf");
        }

        @Override // defpackage.znf
        public void d() {
            c.this.f();
        }

        @Override // defpackage.znf
        public d0 e(a0 a0Var) {
            c cVar = c.this;
            cVar.getClass();
            try {
                wnf.d i = cVar.b.i(c.b(a0Var.a));
                if (i == null) {
                    return null;
                }
                try {
                    d dVar = new d(i.b(0));
                    d0 c = dVar.c(i);
                    if (dVar.a(a0Var, c)) {
                        return c;
                    }
                    rnf.g(c.p);
                    return null;
                } catch (IOException unused) {
                    rnf.g(i);
                    return null;
                }
            } catch (IOException unused2) {
                return null;
            }
        }

        @Override // defpackage.znf
        public void f(d0 d0Var, d0 d0Var2) {
            wnf.b bVar;
            c.this.getClass();
            d dVar = new d(d0Var2);
            try {
                bVar = ((C0658c) d0Var.p).b.a();
                if (bVar != null) {
                    try {
                        dVar.e(bVar);
                        bVar.b();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
                bVar = null;
                if (bVar != null) {
                    try {
                        bVar.a();
                    } catch (IOException unused3) {
                    }
                }
            }
        }
    }

    private final class b implements unf {
        private final wnf.b a;
        private v b;
        private v c;
        boolean d;

        class a extends i {
            final /* synthetic */ wnf.b b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(v vVar, c cVar, wnf.b bVar) {
                super(vVar);
                this.b = bVar;
            }

            @Override // okio.i, okio.v, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                synchronized (c.this) {
                    b bVar = b.this;
                    if (!bVar.d) {
                        bVar.d = true;
                        c.this.c++;
                        super.close();
                        this.b.b();
                    }
                }
            }
        }

        b(wnf.b bVar) {
            this.a = bVar;
            v d2 = bVar.d(1);
            this.b = d2;
            this.c = new a(d2, c.this, bVar);
        }

        @Override // defpackage.unf
        public void abort() {
            synchronized (c.this) {
                if (!this.d) {
                    this.d = true;
                    c.this.f++;
                    rnf.g(this.b);
                    try {
                        this.a.a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        @Override // defpackage.unf
        public v body() {
            return this.c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: okhttp3.c$c  reason: collision with other inner class name */
    public static class C0658c extends e0 {
        final wnf.d b;
        private final g c;
        private final String f;
        private final String n;

        /* renamed from: okhttp3.c$c$a */
        class a extends j {
            final /* synthetic */ wnf.d b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C0658c cVar, w wVar, wnf.d dVar) {
                super(wVar);
                this.b = dVar;
            }

            @Override // okio.j, okio.w, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.b.close();
                super.close();
            }
        }

        C0658c(wnf.d dVar, String str, String str2) {
            this.b = dVar;
            this.f = str;
            this.n = str2;
            this.c = o.d(new a(this, dVar.b(1), dVar));
        }

        @Override // okhttp3.e0
        public long f() {
            try {
                String str = this.n;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        @Override // okhttp3.e0
        public w g() {
            String str = this.f;
            if (str != null) {
                return w.d(str);
            }
            return null;
        }

        @Override // okhttp3.e0
        public g l() {
            return this.c;
        }
    }

    public c(File file, long j) {
        lof lof = lof.a;
        this.b = wnf.d(lof, file, 201105, 2, j);
    }

    public static String b(u uVar) {
        return ByteString.m(uVar.toString()).r().p();
    }

    static int d(g gVar) {
        try {
            long r1 = gVar.r1();
            String y0 = gVar.y0();
            if (r1 >= 0 && r1 <= 2147483647L && y0.isEmpty()) {
                return (int) r1;
            }
            throw new IOException("expected an int but was \"" + r1 + y0 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void a() {
        this.b.h();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    /* access modifiers changed from: package-private */
    public synchronized void f() {
        this.o++;
    }

    @Override // java.io.Flushable
    public void flush() {
        this.b.flush();
    }

    /* access modifiers changed from: package-private */
    public synchronized void g(vnf vnf) {
        this.p++;
        if (vnf.a != null) {
            this.n++;
        } else if (vnf.b != null) {
            this.o++;
        }
    }

    private static final class d {
        private static final String k = "OkHttp-Sent-Millis";
        private static final String l = "OkHttp-Received-Millis";
        private final String a;
        private final t b;
        private final String c;
        private final Protocol d;
        private final int e;
        private final String f;
        private final t g;
        private final s h;
        private final long i;
        private final long j;

        static {
            sof.h().getClass();
            sof.h().getClass();
        }

        d(w wVar) {
            TlsVersion tlsVersion;
            try {
                g d2 = o.d(wVar);
                this.a = d2.y0();
                this.c = d2.y0();
                t.a aVar = new t.a();
                int d3 = c.d(d2);
                for (int i2 = 0; i2 < d3; i2++) {
                    aVar.c(d2.y0());
                }
                this.b = new t(aVar);
                jof a2 = jof.a(d2.y0());
                this.d = a2.a;
                this.e = a2.b;
                this.f = a2.c;
                t.a aVar2 = new t.a();
                int d4 = c.d(d2);
                for (int i3 = 0; i3 < d4; i3++) {
                    aVar2.c(d2.y0());
                }
                String str = k;
                String f2 = aVar2.f(str);
                String str2 = l;
                String f3 = aVar2.f(str2);
                aVar2.g(str);
                aVar2.g(str2);
                long j2 = 0;
                this.i = f2 != null ? Long.parseLong(f2) : 0;
                this.j = f3 != null ? Long.parseLong(f3) : j2;
                this.g = new t(aVar2);
                if (this.a.startsWith("https://")) {
                    String y0 = d2.y0();
                    if (y0.length() <= 0) {
                        h a3 = h.a(d2.y0());
                        List<Certificate> b2 = b(d2);
                        List<Certificate> b3 = b(d2);
                        if (!d2.l1()) {
                            tlsVersion = TlsVersion.d(d2.y0());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        this.h = s.c(tlsVersion, a3, b2, b3);
                    } else {
                        throw new IOException("expected \"\" but was \"" + y0 + "\"");
                    }
                } else {
                    this.h = null;
                }
            } finally {
                wVar.close();
            }
        }

        private List<Certificate> b(g gVar) {
            int d2 = c.d(gVar);
            if (d2 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(d2);
                for (int i2 = 0; i2 < d2; i2++) {
                    String y0 = gVar.y0();
                    e eVar = new e();
                    eVar.F(ByteString.g(y0));
                    arrayList.add(instance.generateCertificate(eVar.m2()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private void d(f fVar, List<Certificate> list) {
            try {
                fVar.N0((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    fVar.e0(ByteString.s(list.get(i2).getEncoded()).d()).writeByte(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public boolean a(a0 a0Var, d0 d0Var) {
            boolean z;
            if (!this.a.equals(a0Var.a.toString()) || !this.c.equals(a0Var.b)) {
                return false;
            }
            t tVar = this.b;
            int i2 = eof.a;
            Iterator<String> it = eof.f(d0Var.o).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                String next = it.next();
                if (!rnf.n(tVar.j(next), a0Var.d(next))) {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }

        public d0 c(wnf.d dVar) {
            String c2 = this.g.c("Content-Type");
            String c3 = this.g.c("Content-Length");
            a0.a aVar = new a0.a();
            aVar.j(this.a);
            aVar.g(this.c, null);
            aVar.f(this.b);
            a0 b2 = aVar.b();
            d0.a aVar2 = new d0.a();
            aVar2.a = b2;
            aVar2.b = this.d;
            aVar2.c = this.e;
            aVar2.d = this.f;
            aVar2.i(this.g);
            aVar2.g = new C0658c(dVar, c2, c3);
            aVar2.e = this.h;
            aVar2.k = this.i;
            aVar2.l = this.j;
            return aVar2.c();
        }

        public void e(wnf.b bVar) {
            f c2 = o.c(bVar.d(0));
            c2.e0(this.a).writeByte(10);
            c2.e0(this.c).writeByte(10);
            c2.N0((long) this.b.g()).writeByte(10);
            int g2 = this.b.g();
            for (int i2 = 0; i2 < g2; i2++) {
                c2.e0(this.b.d(i2)).e0(": ").e0(this.b.i(i2)).writeByte(10);
            }
            c2.e0(new jof(this.d, this.e, this.f).toString()).writeByte(10);
            c2.N0((long) (this.g.g() + 2)).writeByte(10);
            int g3 = this.g.g();
            for (int i3 = 0; i3 < g3; i3++) {
                c2.e0(this.g.d(i3)).e0(": ").e0(this.g.i(i3)).writeByte(10);
            }
            c2.e0(k).e0(": ").N0(this.i).writeByte(10);
            c2.e0(l).e0(": ").N0(this.j).writeByte(10);
            if (this.a.startsWith("https://")) {
                c2.writeByte(10);
                c2.e0(this.h.a().a).writeByte(10);
                d(c2, this.h.e());
                d(c2, this.h.d());
                c2.e0(this.h.f().javaName).writeByte(10);
            }
            c2.close();
        }

        d(d0 d0Var) {
            t tVar;
            this.a = d0Var.a.a.toString();
            int i2 = eof.a;
            t e2 = d0Var.r().C().e();
            Set<String> f2 = eof.f(d0Var.l());
            if (f2.isEmpty()) {
                tVar = new t.a().e();
            } else {
                t.a aVar = new t.a();
                int g2 = e2.g();
                for (int i3 = 0; i3 < g2; i3++) {
                    String d2 = e2.d(i3);
                    if (f2.contains(d2)) {
                        aVar.a(d2, e2.i(i3));
                    }
                }
                tVar = aVar.e();
            }
            this.b = tVar;
            this.c = d0Var.a.b;
            this.d = d0Var.b;
            this.e = d0Var.c;
            this.f = d0Var.f;
            this.g = d0Var.o;
            this.h = d0Var.n;
            this.i = d0Var.t;
            this.j = d0Var.u;
        }
    }
}
