package com.spotify.music.features.premiumdestination.domain;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobius.e0;
import com.spotify.music.features.premiumdestination.domain.i;
import com.spotify.music.features.premiumdestination.domain.j;
import com.spotify.music.features.premiumdestination.domain.k;
import com.spotify.music.features.premiumdestination.domain.m;

public final /* synthetic */ class h implements ti0 {
    public final /* synthetic */ l a;

    public /* synthetic */ h(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        l lVar = this.a;
        k.a aVar = (k.a) obj;
        m d = lVar.d();
        d.getClass();
        if (d instanceof m.b) {
            Assertion.g("backendRequestFailed when model is loaded");
            return e0.h();
        }
        m d2 = lVar.d();
        d2.getClass();
        if (d2 instanceof m.a) {
            m d3 = lVar.d();
            d3.getClass();
            if (((m.a) d3).c() == aVar.g()) {
                return e0.h();
            }
        }
        i.b bVar = (i.b) lVar.e();
        bVar.c(new m.a(aVar.g()));
        l build = bVar.build();
        m d4 = lVar.d();
        d4.getClass();
        if (d4 instanceof m.c) {
            return e0.g(build, z42.l(new j.c(build.d())));
        }
        return e0.f(build);
    }
}
