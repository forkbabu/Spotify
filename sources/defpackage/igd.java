package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.o3;

/* renamed from: igd  reason: default package */
public class igd {
    private final ere a;
    private final o3 b;
    private final String c = ViewUris.k2.toString();
    private final jz1 d;
    private final String e = kfd.e1.getName();
    private final cqe f;

    public igd(jz1 jz1, ere ere, cqe cqe) {
        jz1.getClass();
        this.d = jz1;
        this.a = ere;
        this.b = new o3();
        this.f = cqe;
    }

    public void a() {
        this.a.a(this.b.b().b().a());
    }

    public void b() {
        this.a.a(this.b.b().c().a());
    }

    public void c() {
        this.a.a(this.b.d().b().a());
    }

    public void d(String str) {
        if (l0.z(str).q() == LinkType.SOCIALSESSION) {
            this.a.a(this.b.d().c());
        } else {
            this.a.a(this.b.d().d(str));
        }
    }

    public void e() {
        this.a.a(this.b.c().b().a());
    }

    public void f() {
        this.a.a(this.b.c().c().a("scanning view"));
    }

    public void g(boolean z) {
        this.d.a(new ea1(null, this.e, null, 0, 0, this.c, "tap-camera-button", z ? "allow-permission" : "deny-permission", (double) this.f.d()));
    }

    public void h() {
        this.d.a(new ea1(null, this.e, null, 0, 0, null, "tap-photo-library-cancel-button", "navigate-backward", (double) this.f.d()));
    }

    public void i(boolean z) {
        this.d.a(new ea1(null, this.e, null, 0, 0, this.c, "tap-camera-onboarding", z ? "complete-camera-onboarding" : "cancel-camera-onboarding", (double) this.f.d()));
    }

    public void j(String str) {
        this.d.a(new ca1(null, this.e, null, 0, 0, str, "scannable", null, (double) this.f.d()));
    }

    public void k() {
        this.d.a(new ca1(null, this.e, null, 0, 0, null, "photo-library", null, (double) this.f.d()));
    }

    public void l() {
        this.d.a(new ea1(null, this.e, null, 0, 0, null, "select-photo-library-photo", "select-photo", (double) this.f.d()));
    }

    public void m() {
        this.d.a(new ea1(null, this.e, null, 0, 0, null, "tap-photo-library-button", "navigate-forward", (double) this.f.d()));
    }

    public void n(String str, String str2) {
        this.d.a(new ea1(null, this.e, str2, 0, 0, str, "scan", "navigate-forward", (double) this.f.d()));
    }

    public void o() {
        this.a.a(this.b.d().e().a("photo gallery"));
    }
}
