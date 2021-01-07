package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;

public final /* synthetic */ class y implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ y(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        MusicPagesModel musicPagesModel = this.a;
        u0 Q = ((s0.v) obj).Q();
        MusicPagesModel.a v = musicPagesModel.v();
        v.p(Q);
        return e0.f(v.c());
    }
}
