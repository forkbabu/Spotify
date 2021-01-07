package defpackage;

import com.spotify.ubi.specification.factories.u2;

/* renamed from: r97  reason: default package */
public class r97 implements q97 {
    private final ere a;
    private final u2 b = new u2();

    public r97(ere ere) {
        this.a = ere;
    }

    @Override // defpackage.q97
    public void a() {
        this.a.a(this.b.b().b());
    }

    @Override // defpackage.q97
    public void b(int i, String str) {
        this.a.a(this.b.b().c(Integer.valueOf(i), str).b().a());
    }

    @Override // defpackage.q97
    public void c(int i, String str) {
        this.a.a(this.b.b().c(Integer.valueOf(i), str).c(str));
    }
}
