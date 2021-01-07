package com.spotify.music.features.premiumdestination.domain;

import com.spotify.mobius.e0;
import com.spotify.music.features.premiumdestination.domain.i;
import com.spotify.music.features.premiumdestination.domain.k;
import com.spotify.music.features.premiumdestination.domain.l;

public final /* synthetic */ class c implements ti0 {
    public final /* synthetic */ l a;

    public /* synthetic */ c(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        l.a e = this.a.e();
        if (!"KR".equals(((k.d) obj).g())) {
            return e0.f(((i.b) e).build());
        }
        i.b bVar = (i.b) e;
        bVar.b(true);
        return e0.f(bVar.build());
    }
}
