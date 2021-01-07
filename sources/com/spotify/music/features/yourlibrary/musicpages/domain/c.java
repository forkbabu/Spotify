package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

public final /* synthetic */ class c implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ c(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        s0.i0 i0Var = (s0.i0) obj;
        MusicItem Q = i0Var.Q();
        if (!Q.o()) {
            return e0.h();
        }
        boolean z = !Q.y().a();
        r0.k1 k1Var = new r0.k1(Q.A(), Q.y().e(), z);
        if (!z) {
            return e0.a(z42.l(new r0.b1(Q)));
        }
        r0.i iVar = new r0.i(Q.A(), i0Var.R());
        String l = Q.y().l();
        l.getClass();
        return e0.a(z42.l(k1Var, iVar, new r0.g1(l)));
    }
}
