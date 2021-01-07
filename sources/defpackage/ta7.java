package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.b3;
import com.spotify.ubi.specification.factories.s0;

/* renamed from: ta7  reason: default package */
public class ta7 implements oa7 {
    private final ere a;
    private final b3 b;
    private final s0 c;

    public ta7(ere ere, b3 b3Var, s0 s0Var) {
        this.a = ere;
        this.b = b3Var;
        this.c = s0Var;
    }

    @Override // defpackage.oa7
    public void a(String str) {
        this.a.a(this.b.b().d().a(str));
    }

    @Override // defpackage.oa7
    public String b(String str) {
        nqe b2 = this.b.b().d().b(str);
        this.a.a(b2);
        return b2.b();
    }

    @Override // defpackage.oa7
    public void c(String str) {
        this.a.a(this.b.c().b().f().a(str));
    }

    @Override // defpackage.oa7
    public void d(String str) {
        this.a.a(this.c.D().a(str));
    }

    @Override // defpackage.oa7
    public void e(String str) {
        this.a.a(this.b.b().e().a(str));
    }

    @Override // defpackage.oa7
    public void f(String str) {
        this.a.a(this.b.d().b().a(str));
    }

    @Override // defpackage.oa7
    public void g(String str) {
        this.a.a(this.b.e().a(str));
    }

    @Override // defpackage.oa7
    public void h(String str) {
        this.a.a(this.c.D().b(str));
    }

    @Override // defpackage.oa7
    public void i(String str) {
        this.a.a(this.b.c().b().b().a(str));
    }

    @Override // defpackage.oa7
    public void j(boolean z, String str) {
        if (z) {
            this.a.a(this.b.b().c().a(str));
        } else {
            this.a.a(this.b.b().c().b(str));
        }
    }

    @Override // defpackage.oa7
    public void k(String str, boolean z) {
        nqe nqe;
        if (z) {
            nqe = this.b.b().b().b(ViewUris.T0.toString());
        } else {
            nqe = this.b.b().b().a(str);
        }
        this.a.a(nqe);
    }

    @Override // defpackage.oa7
    public nqe l(String str) {
        nqe a2 = this.c.c().a(str);
        this.a.a(a2);
        return a2;
    }

    @Override // defpackage.oa7
    public void m() {
        this.a.a(this.c.e().a());
    }

    @Override // defpackage.oa7
    public String n(int i) {
        nqe a2 = this.b.c().b().e().a(Integer.valueOf(i));
        this.a.a(a2);
        return a2.b();
    }

    @Override // defpackage.oa7
    public void o(String str) {
        this.a.a(this.b.c().b().c().a());
    }

    @Override // defpackage.oa7
    public void p(String str) {
        this.a.a(this.b.d().c().a(str));
    }

    @Override // defpackage.oa7
    public void q(String str) {
        this.a.a(this.b.c().b().d().a(str));
    }

    @Override // defpackage.oa7
    public void r(String str) {
        this.a.a(this.c.j().a(str));
    }
}
