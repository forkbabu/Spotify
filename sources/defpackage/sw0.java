package defpackage;

import com.spotify.ubi.specification.factories.n;
import kotlin.jvm.internal.h;

/* renamed from: sw0  reason: default package */
public final class sw0 {
    private final ere a;
    private final n b;

    public sw0(ere ere, n nVar) {
        h.e(ere, "userBehaviorEventLogger");
        h.e(nVar, "searchEventFactory");
        this.a = ere;
        this.b = nVar;
    }

    public void a(int i, String str) {
        h.e(str, "uri");
        this.a.a(this.b.b().d().b(Integer.valueOf(i), str).a());
    }

    public void b(int i, String str) {
        h.e(str, "uri");
        this.a.a(this.b.b().d().b(Integer.valueOf(i), str).b());
    }

    public void c() {
        this.a.a(this.b.c().b().a());
    }

    public void d() {
        this.a.a(this.b.b().c());
    }

    public void e(Integer num, String str) {
        this.a.a(this.b.b().d().c(num, str).a());
    }

    public void f(Integer num, String str) {
        this.a.a(this.b.b().d().c(num, str).b());
    }

    public void g() {
        this.a.a(this.b.b().b("").a());
    }

    public void h() {
        this.a.a(this.b.c().c().a());
    }

    public void i() {
        this.a.a(this.b.b().d().d());
    }
}
