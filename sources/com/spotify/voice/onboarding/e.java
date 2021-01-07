package com.spotify.voice.onboarding;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.s;
import defpackage.gff;

public class e {
    private final tef a;
    private final vff b;

    e(tef tef, vff vff) {
        this.a = tef;
        this.b = vff;
    }

    public MobiusLoop.g<jff, hff> a(jff jff, q<hff> qVar) {
        tef tef = this.a;
        vff vff = this.b;
        a aVar = a.a;
        m f = i.f();
        tef.getClass();
        f.b(gff.c.class, new rff(tef));
        f.b(gff.g.class, new qff(tef));
        f.b(gff.d.class, new pff(tef));
        f.b(gff.e.class, new kff(tef));
        f.b(gff.a.class, new mff(tef));
        f.d(gff.h.class, new off(tef));
        f.d(gff.f.class, new nff(tef));
        f.b(gff.b.class, new lff(tef));
        return z42.c(i.c(aVar, f.i()).c(i.a(tef.c().N(new b(vff)).j0(sff.a)), i.a(tef.g().j0(tff.a)), qVar).f(b.g("Voice Onboarding")), jff, new c(this));
    }

    public s b(jff jff) {
        if (!(jff.e() && jff.h())) {
            return s.b(jff);
        }
        if (this.a.f()) {
            return s.c(jff, z42.l(gff.a()));
        }
        this.a.e();
        return s.b(jff);
    }
}
