package com.spotify.music.features.premiumdestination.domain;

import com.spotify.mobius.s;
import com.spotify.music.features.premiumdestination.domain.i;
import com.spotify.music.features.premiumdestination.domain.m;

public final /* synthetic */ class a implements ti0 {
    public final /* synthetic */ l a;

    public /* synthetic */ a(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        m.a aVar = (m.a) obj;
        i.b bVar = (i.b) this.a.e();
        bVar.c(new m.c(false));
        return s.b(bVar.build());
    }
}
