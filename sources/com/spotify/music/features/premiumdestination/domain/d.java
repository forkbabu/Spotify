package com.spotify.music.features.premiumdestination.domain;

import com.spotify.mobius.e0;
import com.spotify.music.features.premiumdestination.domain.i;
import com.spotify.music.features.premiumdestination.domain.k;
import com.spotify.music.features.premiumdestination.domain.m;

public final /* synthetic */ class d implements ti0 {
    public final /* synthetic */ l a;

    public /* synthetic */ d(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        l lVar = this.a;
        k.c cVar = (k.c) obj;
        m d = lVar.d();
        d.getClass();
        if (d instanceof m.c) {
            m d2 = lVar.d();
            d2.getClass();
            if (!((m.c) d2).c()) {
                i.b bVar = (i.b) lVar.e();
                bVar.c(new m.c(true));
                return e0.f(bVar.build());
            }
        }
        return e0.h();
    }
}
