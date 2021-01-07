package com.spotify.voice.experience;

import androidx.activity.c;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Supplier;
import com.spotify.libs.connect.volume.controllers.p;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import com.spotify.voice.api.l;
import defpackage.uue;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

public class n {
    private final Supplier<Boolean> a;
    private final com.spotify.voice.api.n b;
    private final ObjectMapper c;
    private final cte d;
    private final f e;
    private final d f;
    private final hze g;
    private final fze h;
    private final t0f i;
    private final com.spotify.player.options.d j;
    private final p k;
    private final gze l;
    private final kqe m;
    private final s0f n;
    private final g<ugf> o;
    private final t92 p;
    private final bve q;
    private final l r;
    private final tue s;

    public n(Supplier<Boolean> supplier, com.spotify.voice.api.n nVar, com.spotify.music.json.g gVar, cte cte, f fVar, d dVar, hze hze, fze fze, t0f t0f, com.spotify.player.options.d dVar2, p pVar, gze gze, kqe kqe, s0f s0f, g<ugf> gVar2, t92 t92, bve bve, l lVar, tue tue) {
        this.a = supplier;
        this.b = nVar;
        this.c = gVar.a();
        this.d = cte;
        this.e = fVar;
        this.f = dVar;
        this.g = hze;
        this.h = fze;
        this.i = t0f;
        this.j = dVar2;
        this.k = pVar;
        this.l = gze;
        this.m = kqe;
        this.n = s0f;
        this.o = gVar2;
        this.p = t92;
        this.q = bve;
        this.r = lVar;
        this.s = tue;
    }

    public MobiusLoop.g<dve, vue> a(c cVar, k0f k0f, dve dve, q<vue> qVar, q<vue> qVar2) {
        com.spotify.voice.api.n nVar = this.b;
        ObjectMapper objectMapper = this.c;
        cte cte = this.d;
        f fVar = this.e;
        d dVar = this.f;
        hze hze = this.g;
        fze fze = this.h;
        q a2 = i.a(s.y(new cze(cVar)));
        t0f t0f = this.i;
        com.spotify.player.options.d dVar2 = this.j;
        p pVar = this.k;
        gze gze = this.l;
        kqe kqe = this.m;
        s0f s0f = this.n;
        q a3 = i.a(new v(this.o.O(aze.a)));
        t92 t92 = this.p;
        l lVar = this.r;
        tue tue = this.s;
        g gVar = g.a;
        int i2 = yye.b;
        m f2 = i.f();
        f2.h(uue.y.class, new twe(nVar, objectMapper, k0f, lVar));
        f2.h(uue.w.class, qve.a);
        f2.h(uue.l.class, new tve(cte));
        f2.h(uue.j.class, new nwe(fVar, dVar, fze, t0f));
        f2.h(uue.a.class, new jve(t92, hze));
        f2.h(uue.t.class, new kve(dVar, t0f));
        f2.h(uue.o.class, new yxe(kqe, t92));
        f2.h(uue.n.class, new ixe(kqe, t92));
        f2.d(uue.b0.class, new vye(kqe));
        f2.d(uue.c.class, new sve(s0f));
        f2.h(uue.e.class, new dye(dVar, hze));
        f2.h(uue.s.class, mxe.a);
        f2.h(uue.k.class, new pve(hze, fVar, dVar, fze, t0f));
        f2.h(uue.m.class, new lwe(cte));
        f2.h(uue.x.class, new bwe(t92));
        f2.h(uue.a0.class, new xve(t92));
        f2.h(uue.h.class, eye.a);
        f2.h(uue.z.class, new dxe(dVar));
        f2.h(uue.d0.class, new rye(pVar));
        f2.h(uue.c0.class, new jye(pVar));
        f2.h(uue.g.class, new uxe(dVar, t0f));
        f2.h(uue.p.class, new kwe(dVar, t0f));
        f2.h(uue.q.class, new vxe(dVar2));
        f2.h(uue.r.class, new tye(dVar2));
        f2.h(uue.u.class, new bxe(dVar2));
        f2.h(uue.v.class, new qwe(fVar, t0f));
        f2.h(uue.d.class, new fye(hze));
        f2.h(uue.f.class, new awe(hze));
        f2.h(uue.e0.class, xwe.a);
        f2.h(uue.b.class, new wxe(gze));
        f2.h(uue.i.class, new zve(tue));
        return z42.c(i.c(gVar, f2.i()).c(a2, qVar, a3, qVar2).f(b.g("Voice")), dve, h.a);
    }

    /* access modifiers changed from: package-private */
    public dve b(boolean z, eve eve, cve cve, boolean z2, boolean z3, String str, boolean z4) {
        return dve.a().y(eve).x(this.q).w(cve).s(z).u(z2).v(z3).t(this.a.get().booleanValue()).o(z4).p(str);
    }
}
