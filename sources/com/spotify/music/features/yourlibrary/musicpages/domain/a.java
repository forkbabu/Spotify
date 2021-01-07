package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;

public final /* synthetic */ class a implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ a(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        s0.l lVar = (s0.l) obj;
        return e0.a(z42.l(new r0.j1(lVar.Q().A(), !lVar.Q().i()), new r0.q(lVar.Q().A(), lVar.R())));
    }
}
