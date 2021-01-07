package defpackage;

import com.spotify.ubi.specification.factories.y0;

/* access modifiers changed from: package-private */
/* renamed from: sg3  reason: default package */
public class sg3 {
    private final jz1 a;
    private final String b;
    private final String c;
    private final cqe d;
    private final ere e;
    private final y0 f = new y0();

    sg3(jz1 jz1, cqe cqe, String str, String str2, ere ere) {
        this.a = jz1;
        this.d = cqe;
        this.b = str;
        this.c = str2;
        this.e = ere;
    }

    private void k(String str, String str2) {
        this.a.a(new fa1(null, "com.spotify.feature.explicit", this.c, "enable-explicit-onetrack", 0, this.b, str, str2, (double) this.d.d()));
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.e.a(this.f.c().b().a());
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.e.a(this.f.c().d());
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.e.a(this.f.c().c().a("spotify:internal:preferences"));
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.e.a(this.f.b().b().a());
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.e.a(this.f.b().c().a());
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.e.a(this.f.b().d());
    }

    /* access modifiers changed from: package-private */
    public void g() {
        k("cancel", "cancel");
    }

    /* access modifiers changed from: package-private */
    public void h() {
        k("close", "close");
    }

    /* access modifiers changed from: package-private */
    public void i() {
        k("hit", "go-to-settings");
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.a.a(new da1(null, "com.spotify.feature.explicit", this.c, "enable-explicit-onetrack", 0, this.b, "block", null, (double) this.d.d()));
    }

    /* access modifiers changed from: package-private */
    public void l() {
        k("hit", "not-now");
    }

    /* access modifiers changed from: package-private */
    public void m() {
        this.e.a(this.f.c().e().a());
    }
}
