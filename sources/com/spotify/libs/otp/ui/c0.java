package com.spotify.libs.otp.ui;

import com.spotify.glue.dialogs.d;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;

public class c0 {
    private final g a;
    private final a0 b;

    public c0(g gVar, a0 a0Var) {
        gVar.getClass();
        this.a = gVar;
        a0Var.getClass();
        this.b = a0Var;
    }

    private d a(String str, String str2, String str3, Runnable runnable) {
        d dVar = new d(runnable, null);
        f c = this.a.c(str, str2);
        c.f(str3, dVar);
        c.a(false);
        d b2 = c.b();
        b2.a();
        return b2;
    }

    public d b(Runnable runnable) {
        return a(this.b.j(), this.b.a(), this.b.i(), runnable);
    }

    public d c(Runnable runnable) {
        return a(this.b.k(), this.b.b(), this.b.i(), runnable);
    }

    public d d(Runnable runnable) {
        return a(this.b.l(), this.b.c(), this.b.i(), runnable);
    }

    public d e(Runnable runnable) {
        return a(this.b.n(), this.b.e(), this.b.i(), runnable);
    }

    public d f(Runnable runnable) {
        return a(this.b.o(), this.b.f(), this.b.i(), runnable);
    }

    public d g(Runnable runnable) {
        return a(this.b.p(), this.b.g(), this.b.h(), runnable);
    }

    public d h(Runnable runnable, int i) {
        return a(this.b.m(i), this.b.d(i), this.b.h(), runnable);
    }
}
