package defpackage;

import com.spotify.ubi.specification.factories.q2;

/* renamed from: a67  reason: default package */
public class a67 implements w57 {
    private final ere a;
    private final q2 b;

    public a67(ere ere, q2 q2Var) {
        this.a = ere;
        this.b = q2Var;
    }

    @Override // defpackage.w57
    public void f(String str, int i) {
        this.a.a(this.b.c().d().b(Integer.valueOf(i)).a(str));
    }
}
