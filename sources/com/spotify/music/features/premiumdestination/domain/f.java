package com.spotify.music.features.premiumdestination.domain;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobius.e0;
import com.spotify.music.features.premiumdestination.domain.i;
import com.spotify.music.features.premiumdestination.domain.j;
import com.spotify.music.features.premiumdestination.domain.k;
import com.spotify.music.features.premiumdestination.domain.m;

public final /* synthetic */ class f implements ti0 {
    public final /* synthetic */ l a;

    public /* synthetic */ f(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        l lVar = this.a;
        k.b bVar = (k.b) obj;
        m d = lVar.d();
        d.getClass();
        if (d instanceof m.b) {
            Assertion.g("backendViewModelReceived when model is loaded");
            return e0.a(z42.l(new j.b()));
        }
        b91 g = bVar.g();
        i.b bVar2 = (i.b) lVar.e();
        bVar2.c(new m.b(g));
        l build = bVar2.build();
        m d2 = lVar.d();
        d2.getClass();
        if (d2 instanceof m.c) {
            return e0.g(build, z42.l(new j.c(build.d()), new j.b()));
        }
        return e0.g(build, z42.l(new j.b()));
    }
}
