package defpackage;

import defpackage.n21;
import defpackage.o21;
import defpackage.p21;

/* renamed from: t21  reason: default package */
public abstract class t21 {
    public static final t21 a;

    /* renamed from: t21$a */
    public interface a {
    }

    static {
        n21.b bVar = new n21.b();
        bVar.d(new p21.a());
        bVar.c("");
        bVar.b(new o21.b());
        a = bVar.a();
    }

    public abstract o21 a();

    public boolean b() {
        return ((Boolean) e().a(g21.a, e21.a, d21.a, f21.a, c21.a, i21.a, h21.a)).booleanValue();
    }

    public abstract String c();

    public String d() {
        return (String) e().a(j21.a, q11.a, m21.a, k21.a, s11.a, r11.a, l21.a);
    }

    public abstract p21 e();

    public abstract a f();

    public t21 g(o21 o21) {
        n21.b bVar = (n21.b) f();
        bVar.b(o21);
        return bVar.a();
    }

    public t21 h(String str) {
        n21.b bVar = (n21.b) f();
        bVar.c(str);
        return bVar.a();
    }

    public t21 i(p21 p21) {
        n21.b bVar = (n21.b) f();
        bVar.d(p21);
        return bVar.a();
    }
}
