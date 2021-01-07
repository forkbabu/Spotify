package defpackage;

import com.spotify.ubi.specification.factories.q2;

/* renamed from: c67  reason: default package */
public class c67 implements x57 {
    private final ere a;
    private final q2 b;

    public c67(ere ere, q2 q2Var) {
        this.a = ere;
        this.b = q2Var;
    }

    @Override // defpackage.x57
    public String d(String str) {
        nqe a2 = this.b.d(str).a(str);
        this.a.a(a2);
        return a2.b();
    }

    @Override // defpackage.x57
    public void j(String str) {
        this.a.a(this.b.d(str).c());
    }

    @Override // defpackage.x57
    public String k(String str) {
        nqe b2 = this.b.d(str).b(str);
        this.a.a(b2);
        return b2.b();
    }
}
