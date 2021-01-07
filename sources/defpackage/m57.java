package defpackage;

import com.spotify.ubi.specification.factories.q2;

/* renamed from: m57  reason: default package */
public class m57 implements t57 {
    private final ere a;
    private final q2 b;

    public m57(ere ere, q2 q2Var) {
        this.a = ere;
        this.b = q2Var;
    }

    @Override // defpackage.t57
    public void c(String str) {
        this.a.a(this.b.c().c().b().a(str));
    }

    @Override // defpackage.t57
    public void e() {
        this.a.a(this.b.c().c().c().b());
    }

    @Override // defpackage.t57
    public void h() {
        this.a.a(this.b.c().c().c().a());
    }
}
