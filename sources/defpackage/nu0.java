package defpackage;

import com.spotify.libs.connect.instrumentation.g;

/* renamed from: nu0  reason: default package */
public class nu0 implements g.b {
    private final ere a;
    private final hu0 b;

    public nu0(ere ere, hu0 hu0) {
        this.a = ere;
        this.b = hu0;
    }

    private static int a(double d) {
        return (int) Math.round(d * 100.0d);
    }

    public void b(double d, String str) {
        this.a.a(this.b.a(str).d().a(Integer.valueOf(a(d))));
    }

    public void c(double d, String str) {
        this.a.a(this.b.a(str).c().a(Integer.valueOf(a(d))));
    }
}
