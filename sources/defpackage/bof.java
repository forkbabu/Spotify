package defpackage;

import java.net.ProtocolException;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.f;
import okhttp3.v;
import okio.e;
import okio.i;
import okio.o;

/* renamed from: bof  reason: default package */
public final class bof implements v {
    private final boolean a;

    /* renamed from: bof$a */
    static final class a extends i {
        long b;

        a(okio.v vVar) {
            super(vVar);
        }

        @Override // okio.i, okio.v
        public void l0(e eVar, long j) {
            super.l0(eVar, j);
            this.b += j;
        }
    }

    public bof(boolean z) {
        this.a = z;
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        d0 d0Var;
        fof fof = (fof) aVar;
        cof e = fof.e();
        f j = fof.j();
        c cVar = (c) fof.c();
        a0 i = fof.i();
        long currentTimeMillis = System.currentTimeMillis();
        fof.d().getClass();
        e.c(i);
        fof.d().getClass();
        d0.a aVar2 = null;
        if (yif.F(i.g()) && i.a() != null) {
            if ("100-continue".equalsIgnoreCase(i.c("Expect"))) {
                e.f();
                fof.d().getClass();
                aVar2 = e.e(true);
            }
            if (aVar2 == null) {
                fof.d().getClass();
                a aVar3 = new a(e.b(i, i.a().a()));
                okio.f c = o.c(aVar3);
                i.a().f(c);
                c.close();
                fof.d().e(fof.a(), aVar3.b);
            } else if (!cVar.k()) {
                j.i();
            }
        }
        e.a();
        if (aVar2 == null) {
            fof.d().getClass();
            aVar2 = e.e(false);
        }
        aVar2.p(i);
        aVar2.g(j.d().h());
        aVar2.q(currentTimeMillis);
        aVar2.n(System.currentTimeMillis());
        d0 c2 = aVar2.c();
        int f = c2.f();
        if (f == 100) {
            d0.a e2 = e.e(false);
            e2.p(i);
            e2.g(j.d().h());
            e2.q(currentTimeMillis);
            e2.n(System.currentTimeMillis());
            c2 = e2.c();
            f = c2.f();
        }
        fof.d().g(fof.a(), c2);
        if (!this.a || f != 101) {
            d0.a s = c2.s();
            s.b(e.d(c2));
            d0Var = s.c();
        } else {
            d0.a s2 = c2.s();
            s2.b(rnf.c);
            d0Var = s2.c();
        }
        if ("close".equalsIgnoreCase(d0Var.C().c("Connection")) || "close".equalsIgnoreCase(d0Var.h("Connection"))) {
            j.i();
        }
        if ((f != 204 && f != 205) || d0Var.a().f() <= 0) {
            return d0Var;
        }
        StringBuilder W0 = je.W0("HTTP ", f, " had non-zero Content-Length: ");
        W0.append(d0Var.a().f());
        throw new ProtocolException(W0.toString());
    }
}
