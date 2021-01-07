package defpackage;

import com.spotify.libs.onboarding.allboarding.c;
import com.spotify.libs.onboarding.allboarding.room.j;
import com.spotify.libs.onboarding.allboarding.room.t;
import com.spotify.ubi.specification.factories.m;
import kotlin.jvm.internal.h;

/* renamed from: rw0  reason: default package */
public class rw0 {
    private final ere a;
    private final m b;

    public rw0(ere ere, m mVar) {
        h.e(ere, "userBehaviorEventLogger");
        h.e(mVar, "contentPickerEventFactory");
        this.a = ere;
        this.b = mVar;
    }

    public void a() {
        this.a.a(this.b.b().a(""));
    }

    public void b(int i) {
        this.a.a(this.b.c(Integer.valueOf(i)).c());
    }

    public void c(int i, int i2, j jVar) {
        h.e(jVar, "pickerItem");
        t d = c.d(jVar);
        if (h.a(d, t.c.a)) {
            this.a.a(this.b.c(Integer.valueOf(i)).b(Integer.valueOf(i2), jVar.i(), "").b());
        } else if (h.a(d, t.d.a) || h.a(d, t.a.a) || h.a(d, t.b.a) || h.a(d, t.e.a)) {
            this.a.a(this.b.f(Integer.valueOf(i)).c(Integer.valueOf(i2), jVar.i(), "").c());
        }
    }

    public void d(int i, int i2, j jVar) {
        h.e(jVar, "pickerItem");
        t d = c.d(jVar);
        if (h.a(d, t.c.a)) {
            this.a.a(this.b.c(Integer.valueOf(i)).b(Integer.valueOf(i2), jVar.i(), "").a());
        } else if (h.a(d, t.d.a) || h.a(d, t.a.a)) {
            this.a.a(this.b.f(Integer.valueOf(i)).c(Integer.valueOf(i2), jVar.i(), "").a());
        } else if (h.a(d, t.b.a) || h.a(d, t.e.a)) {
            this.a.a(this.b.f(Integer.valueOf(i)).c(Integer.valueOf(i2), jVar.i(), "").b());
        }
    }

    public void e() {
        this.a.a(this.b.d().b().b());
    }

    public void f() {
        this.a.a(this.b.d().b().a(""));
    }

    public void g() {
        this.a.a(this.b.e().a().b());
    }

    public void h() {
        this.a.a(this.b.e().a().a());
    }

    public void i() {
        this.a.a(this.b.e().c().b());
    }

    public void j() {
        this.a.a(this.b.e().c().a(""));
    }

    public void k() {
        this.a.a(this.b.e().d());
    }

    public void l(int i) {
        this.a.a(this.b.f(Integer.valueOf(i)).b());
    }
}
