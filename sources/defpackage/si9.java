package defpackage;

import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.util.Assertion;
import defpackage.di9;

/* renamed from: si9  reason: default package */
public class si9 {
    private final fi9 a;
    private ui9 b;
    private di9 c;
    private ane d;
    private boolean e;

    public si9(fi9 fi9) {
        this.a = fi9;
    }

    public void a() {
        this.a.e();
    }

    public void b() {
        ((hi9) this.b).l();
        this.a.f();
    }

    public void c() {
        this.a.b();
        ((hi9) this.b).m();
    }

    public void d(di9.b bVar, int i) {
        boolean z = !bVar.h();
        this.a.d(bVar.e(), i, z);
        ui9 ui9 = this.b;
        di9.b.a i2 = bVar.i();
        i2.g(z);
        ((hi9) ui9).v(i2.c());
    }

    public void e(String str) {
        if (this.e && str.isEmpty()) {
            this.e = !this.e;
            ((hi9) this.b).y(false);
        } else if (!this.e && !str.isEmpty()) {
            this.a.a();
            this.e = !this.e;
            ((hi9) this.b).y(true);
        }
        ((hi9) this.b).w(str);
    }

    public void f() {
        this.a.c();
        ((hi9) this.b).x(this.c, this.d);
    }

    public void g(ane ane, int i) {
        i(ane);
        this.a.h(ane.c(), i);
        ((hi9) this.b).u(ane);
    }

    public void h() {
        this.a.g();
    }

    public void i(ane ane) {
        Assertion.k(FluentIterable.from(this.c.h()).firstMatch(new ri9(ane.c())).isPresent(), "The active sort option should be part of the Filter and Sort Configuration", new Object[0]);
        if (!ane.equals(this.d)) {
            this.d = ane;
        }
    }

    public void j(di9 di9) {
        this.c = di9;
    }

    public void k(ui9 ui9) {
        this.b = ui9;
    }
}
