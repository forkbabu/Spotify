package com.spotify.music.features.premiumdestination.domain;

import com.spotify.mobius.e0;
import com.spotify.music.features.premiumdestination.domain.i;
import com.spotify.music.features.premiumdestination.domain.j;
import com.spotify.music.features.premiumdestination.domain.k;
import com.spotify.music.features.premiumdestination.domain.m;

public final /* synthetic */ class e implements ti0 {
    public final /* synthetic */ l a;

    public /* synthetic */ e(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        l lVar = this.a;
        k.e eVar = (k.e) obj;
        if ("premium".equals(eVar.g())) {
            return e0.a(z42.l(new j.d()));
        }
        m d = lVar.d();
        d.getClass();
        if (!(d instanceof m.b)) {
            m d2 = lVar.d();
            d2.getClass();
            if (!(d2 instanceof m.c)) {
                return e0.h();
            }
        }
        i.b bVar = (i.b) lVar.e();
        bVar.a(eVar.g());
        return e0.g(bVar.build(), z42.l(new j.a(eVar.g())));
    }
}
