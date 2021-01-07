package defpackage;

import defpackage.sla;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wla  reason: default package */
public class wla implements vla {
    private static final List<String> f = Collections.emptyList();
    private final tla a;
    private final cqe b;
    private sla c;
    private final List<String> d = new ArrayList(2);
    private boolean e;

    public wla(tla tla, cqe cqe) {
        this.a = tla;
        cqe.getClass();
        this.b = cqe;
    }

    private long q() {
        sla sla = this.c;
        if (sla == null || sla.d() == 0) {
            return 0;
        }
        if (sla.c() != 0) {
            sla.a j = sla.j();
            j.c(sla.c());
            sla = j.build();
        }
        return sla.b() + ((this.b.d() - sla.d()) / 1000);
    }

    private void r() {
        this.e = false;
        this.c = null;
    }

    private void s(sla sla) {
        this.a.b(sla.a(), sla.g(), sla.h(), sla.i(), sla.e());
    }

    @Override // defpackage.vla
    public void a() {
        sla sla = this.c;
        if (sla != null) {
            this.a.a(sla.a(), "sent_to_waze", q(), "connect_to_navigation_apps", sla.i(), "no_app_connected");
            r();
        }
    }

    @Override // defpackage.vla
    public void b() {
        sla sla = this.c;
        if (sla != null) {
            this.a.a(sla.a(), "manual_close", q(), "connect_to_navigation_apps", sla.i(), "no_app_connected");
            r();
        }
    }

    @Override // defpackage.vla
    public void c(String str) {
        if (this.c != null) {
            return;
        }
        if (!"waze".equals(str) || this.e) {
            sla f2 = sla.f(this.b.d(), "from_partner_app", "navigation", f, str);
            this.c = f2;
            s(f2);
        }
    }

    @Override // defpackage.vla
    public void d() {
        sla sla = this.c;
        if (sla != null) {
            this.a.a(sla.a(), "sent_to_settings", q(), "connect_to_navigation_apps", sla.i(), "no_app_connected");
            r();
        }
    }

    @Override // defpackage.vla
    public void e() {
        if (this.c == null) {
            sla f2 = sla.f(this.b.d(), "from_navigation", "navigation", f, "waze");
            this.c = f2;
            s(f2);
        }
    }

    @Override // defpackage.vla
    public void f() {
        sla sla = this.c;
        if (sla != null) {
            sla.a j = sla.j();
            j.b(q());
            this.c = j.build();
        }
    }

    @Override // defpackage.vla
    public void g() {
        sla sla = this.c;
        if (sla != null) {
            this.a.a(sla.a(), "npv_open", q(), sla.h(), sla.i(), sla.e());
            r();
        }
    }

    @Override // defpackage.vla
    public void h(String str) {
        sla sla = this.c;
        if (sla != null) {
            this.a.a(sla.a(), "manual_close", q(), "navigation", f, str);
            r();
        }
    }

    @Override // defpackage.vla
    public void i(boolean z) {
        this.e = z;
    }

    @Override // defpackage.vla
    public void j() {
        sla sla = this.c;
        if (sla != null) {
            this.a.a(sla.a(), "sent_to_waze", q(), "navigation", sla.i(), "waze");
            r();
        }
    }

    @Override // defpackage.vla
    public void k(boolean z, boolean z2) {
        this.d.clear();
        if (z) {
            this.d.add("waze");
        }
        if (z2) {
            this.d.add("google_maps");
        }
    }

    @Override // defpackage.vla
    public void l() {
        sla sla = this.c;
        if (sla != null) {
            this.a.a(sla.a(), "timeout", q(), "connect_to_navigation_apps", sla.i(), "no_app_connected");
            r();
        }
    }

    @Override // defpackage.vla
    public void m() {
        if (this.c == null) {
            sla f2 = sla.f(this.b.d(), "car_detected", "connect_to_navigation_apps", this.d, "no_app_connected");
            this.c = f2;
            s(f2);
        }
    }

    @Override // defpackage.vla
    public void n() {
        sla sla = this.c;
        if (sla != null) {
            this.a.a(sla.a(), "sent_to_google_maps", q(), "connect_to_navigation_apps", sla.i(), "no_app_connected");
            r();
        }
    }

    @Override // defpackage.vla
    public void o() {
        sla sla = this.c;
        if (sla != null) {
            this.a.a(sla.a(), "sent_to_google_maps", q(), "navigation", sla.i(), "google_maps");
            r();
        }
    }

    @Override // defpackage.vla
    public void p() {
        sla sla = this.c;
        if (sla != null) {
            sla.a j = sla.j();
            j.a(this.b.d());
            this.c = j.build();
        }
    }
}
