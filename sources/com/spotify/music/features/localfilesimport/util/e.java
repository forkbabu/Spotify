package com.spotify.music.features.localfilesimport.util;

import com.spotify.instrumentation.a;
import com.spotify.music.features.localfilesimport.model.PageType;
import com.spotify.ubi.specification.factories.p1;

public class e {
    private final ere a;
    private final p1 b;

    public e(ere ere, a aVar) {
        this.a = ere;
        this.b = new p1(aVar.path());
    }

    public void a() {
        this.a.a(this.b.g().b().a());
    }

    public void b(PageType pageType) {
        this.a.a(this.b.f().b(pageType.name()).b().b().a());
    }

    public void c() {
        this.a.a(this.b.b().b().a());
    }

    public void d() {
        this.a.a(this.b.b().c());
    }

    public void e() {
        this.a.a(this.b.b().d().a());
    }

    public void f() {
        this.a.a(this.b.c().b());
    }

    public void g() {
        this.a.a(this.b.c().c().a());
    }

    public void h() {
        this.a.a(this.b.g().c().a());
    }

    public void i() {
        this.a.a(this.b.d().b());
    }

    public void j() {
        this.a.a(this.b.d().c().a());
    }

    public String k(String str) {
        nqe a2 = this.b.d().d().a(str);
        this.a.a(a2);
        return a2.b();
    }

    public void l(PageType pageType, int i) {
        this.a.a(this.b.f().b(pageType.name()).d(Integer.valueOf(i)).a());
    }

    public void m() {
        this.a.a(this.b.e().b());
    }

    public void n() {
        this.a.a(this.b.e().c().a());
    }

    public void o(PageType pageType) {
        this.a.a(this.b.f().b(pageType.name()).c());
    }

    public void p() {
        this.a.a(this.b.f().c());
    }

    public void q(PageType pageType) {
        this.a.a(this.b.f().b(pageType.name()).b().c().a());
    }
}
