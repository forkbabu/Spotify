package com.spotify.music.features.login;

import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import defpackage.i11;

public class r1 implements o11 {
    private final xhd a;

    public r1(xhd xhd) {
        this.a = xhd;
    }

    public static void b(r1 r1Var, i11.c cVar) {
        r1Var.a.n(h(cVar.k()), (ErrorTypeIdentifier) cVar.i().f(l.a, q.a, t0.a, u.a, o.a, p0.a), (InputFieldIdentifier) cVar.j().d(b1.a, h0.a, i0.a), cVar.h());
    }

    public static void c(r1 r1Var, i11.d dVar) {
        r1Var.a.d(h(dVar.i()), (EventIdentifier) dVar.h().n(j0.a, s.a, v0.a, x.a, w.a, m0.a, n0.a, w0.a, y.a, a1.a, v.a, y0.a, u0.a));
    }

    public static void d(r1 r1Var, i11.b bVar) {
        r1Var.a.f(h(bVar.i()), (DialogIdentifier) bVar.h().c(f0.a, z0.a, a0.a));
    }

    public static void e(r1 r1Var, i11.a aVar) {
        r1Var.a.m(h(aVar.j()), (ClickIdentifier) aVar.h().i(b0.a, p.a, m.a, t.a, z.a, o0.a, n.a, q0.a, e0.a, d1.a), (DialogIdentifier) aVar.i().c(f0.a, z0.a, a0.a));
    }

    public static void f(r1 r1Var, i11.e eVar) {
        r1Var.a.j(h(eVar.i()), (InputFieldIdentifier) eVar.h().d(b1.a, h0.a, i0.a));
    }

    public static void g(r1 r1Var, i11.f fVar) {
        r1Var.a.l(h(fVar.h()));
    }

    private static ScreenIdentifier h(p11 p11) {
        return (ScreenIdentifier) p11.d(r.a, d0.a, r0.a, g0.a, x0.a, c1.a);
    }

    @Override // defpackage.o11
    public void a(i11 i11) {
        i11.f(new s0(this), new l0(this), new k0(this), new j(this), new c0(this), new k(this));
    }
}
