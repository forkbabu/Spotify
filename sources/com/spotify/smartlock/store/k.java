package com.spotify.smartlock.store;

import defpackage.ce0;
import defpackage.de0;
import defpackage.fe0;
import defpackage.ge0;
import kotlin.jvm.internal.h;

public final class k implements j {
    private je0 a;
    private final ae0 b;

    public k(je0 je0, ae0 ae0) {
        h.e(je0, "screen");
        h.e(ae0, "authTracker");
        this.a = je0;
        this.b = ae0;
    }

    @Override // com.spotify.smartlock.store.j
    public void a() {
        this.b.a(new ce0.m(this.a, de0.f.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void b() {
        this.b.a(new ce0.m(this.a, de0.m.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void c(int i) {
        this.b.a(new ce0.m(this.a, new de0.a(i)));
    }

    @Override // com.spotify.smartlock.store.j
    public void d() {
        this.b.a(new ce0.m(this.a, de0.d.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void e() {
        this.b.a(new ce0.m(this.a, de0.k.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void f() {
        this.b.a(new ce0.m(this.a, de0.g.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void g() {
        this.b.a(new ce0.c(this.a, fe0.x.b, ge0.j.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void h() {
        this.b.a(new ce0.m(this.a, de0.c.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void i() {
        this.b.a(new ce0.m(this.a, de0.b.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void j(je0 je0) {
        h.e(je0, "<set-?>");
        this.a = je0;
    }

    @Override // com.spotify.smartlock.store.j
    public void k() {
        this.b.a(new ce0.m(this.a, de0.j.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void l() {
        this.b.a(new ce0.m(this.a, de0.h.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void m() {
        this.b.a(new ce0.e(this.a, ge0.j.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void n() {
        this.b.a(new ce0.m(this.a, de0.r.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void o() {
        this.b.a(new ce0.m(this.a, de0.l.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void p() {
        this.b.a(new ce0.m(this.a, de0.o.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void q() {
        this.b.a(new ce0.m(this.a, de0.i.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void r() {
        this.b.a(new ce0.m(this.a, de0.n.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void s() {
        this.b.a(new ce0.m(this.a, de0.q.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void t() {
        this.b.a(new ce0.m(this.a, de0.p.b));
    }

    @Override // com.spotify.smartlock.store.j
    public void u() {
        this.b.a(new ce0.m(this.a, de0.e.b));
    }
}
