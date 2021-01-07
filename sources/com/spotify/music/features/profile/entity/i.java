package com.spotify.music.features.profile.entity;

import com.spotify.ubi.specification.factories.f3;

public class i {
    private final ere a;
    private final f3 b = new f3();
    private final String c;

    public i(ere ere, hq7 hq7) {
        this.a = ere;
        this.c = hq7.b2();
    }

    public void a() {
        ere ere = this.a;
        f3.b.a b2 = this.b.b().b();
        ere.a(b2.a(this.c + ":followers"));
    }

    public void b() {
        ere ere = this.a;
        f3.b.C0442b c2 = this.b.b().c();
        ere.a(c2.a(this.c + ":following"));
    }

    public void c() {
        ere ere = this.a;
        f3.b.c d = this.b.b().d();
        ere.a(d.a(this.c + ":playlists"));
    }

    public void d() {
        this.a.a(this.b.c().b().a("edit profile"));
    }

    public void e(boolean z) {
        if (z) {
            this.a.a(this.b.c().c().a(this.c));
        } else {
            this.a.a(this.b.c().c().b(this.c));
        }
    }

    public void f() {
        this.a.a(this.b.c().d().a("edit profile"));
    }

    public void g(String str, int i) {
        this.a.a(this.b.d().b(Integer.valueOf(i), str).a(str));
    }

    public void h() {
        ere ere = this.a;
        f3.d.b c2 = this.b.d().c();
        ere.a(c2.a(this.c + ":playlists"));
    }

    public void i(String str, int i) {
        this.a.a(this.b.e().b(Integer.valueOf(i), str).a(str));
    }

    public void j() {
        ere ere = this.a;
        f3.e.b c2 = this.b.e().c();
        ere.a(c2.a(this.c + ":artists"));
    }
}
