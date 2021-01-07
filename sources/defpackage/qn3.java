package defpackage;

import com.spotify.ubi.specification.factories.j;

/* renamed from: qn3  reason: default package */
public class qn3 {
    private final dv3 a;
    private final ere b;
    private final j c;

    public qn3(dv3 dv3, ere ere, j jVar) {
        this.a = dv3;
        this.b = ere;
        this.c = jVar;
    }

    public void a(String str) {
        this.a.a("clicked", str);
    }

    public void b(String str) {
        this.a.a("errored", str);
    }

    public void c() {
        this.b.a(this.c.b().a());
    }
}
