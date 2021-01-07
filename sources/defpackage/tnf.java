package defpackage;

import defpackage.vnf;
import java.io.IOException;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.t;
import okhttp3.v;
import okio.o;

/* renamed from: tnf  reason: default package */
public final class tnf implements v {
    final znf a;

    public tnf(znf znf) {
        this.a = znf;
    }

    static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean c(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    private static d0 d(d0 d0Var) {
        if (d0Var == null || d0Var.a() == null) {
            return d0Var;
        }
        d0.a s = d0Var.s();
        s.b(null);
        return s.c();
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        okio.v body;
        znf znf = this.a;
        d0 e = znf != null ? znf.e(((fof) aVar).i()) : null;
        fof fof = (fof) aVar;
        vnf a2 = new vnf.a(System.currentTimeMillis(), fof.i(), e).a();
        a0 a0Var = a2.a;
        d0 d0Var = a2.b;
        znf znf2 = this.a;
        if (znf2 != null) {
            znf2.a(a2);
        }
        if (e != null && d0Var == null) {
            rnf.g(e.a());
        }
        if (a0Var == null && d0Var == null) {
            d0.a aVar2 = new d0.a();
            aVar2.p(fof.i());
            aVar2.m(Protocol.HTTP_1_1);
            aVar2.f(504);
            aVar2.j("Unsatisfiable Request (only-if-cached)");
            aVar2.b(rnf.c);
            aVar2.q(-1);
            aVar2.n(System.currentTimeMillis());
            return aVar2.c();
        } else if (a0Var == null) {
            d0.a s = d0Var.s();
            s.d(d(d0Var));
            return s.c();
        } else {
            try {
                d0 f = fof.f(a0Var);
                if (f == null && e != null) {
                }
                if (d0Var != null) {
                    if (f.f() == 304) {
                        d0.a s2 = d0Var.s();
                        t l = d0Var.l();
                        t l2 = f.l();
                        t.a aVar3 = new t.a();
                        int g = l.g();
                        for (int i = 0; i < g; i++) {
                            String d = l.d(i);
                            String i2 = l.i(i);
                            if ((!"Warning".equalsIgnoreCase(d) || !i2.startsWith("1")) && (b(d) || !c(d) || l2.c(d) == null)) {
                                pnf.a.b(aVar3, d, i2);
                            }
                        }
                        int g2 = l2.g();
                        for (int i3 = 0; i3 < g2; i3++) {
                            String d2 = l2.d(i3);
                            if (!b(d2) && c(d2)) {
                                pnf.a.b(aVar3, d2, l2.i(i3));
                            }
                        }
                        s2.i(aVar3.e());
                        s2.q(f.D());
                        s2.n(f.B());
                        s2.d(d(d0Var));
                        s2.k(d(f));
                        d0 c = s2.c();
                        f.a().close();
                        this.a.d();
                        this.a.f(d0Var, c);
                        return c;
                    }
                    rnf.g(d0Var.a());
                }
                d0.a s3 = f.s();
                s3.d(d(d0Var));
                s3.k(d(f));
                d0 c2 = s3.c();
                if (this.a != null) {
                    if (eof.b(c2) && vnf.a(c2, a0Var)) {
                        unf c3 = this.a.c(c2);
                        if (c3 == null || (body = c3.body()) == null) {
                            return c2;
                        }
                        snf snf = new snf(this, c2.a().l(), c3, o.c(body));
                        String h = c2.h("Content-Type");
                        long f2 = c2.a().f();
                        d0.a s4 = c2.s();
                        s4.b(new gof(h, f2, o.d(snf)));
                        return s4.c();
                    } else if (yif.u(a0Var.g())) {
                        try {
                            this.a.b(a0Var);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c2;
            } finally {
                if (e != null) {
                    rnf.g(e.a());
                }
            }
        }
    }
}
