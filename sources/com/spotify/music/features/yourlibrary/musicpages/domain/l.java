package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.yourlibrary.interfaces.i;

public final /* synthetic */ class l implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ l(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        MusicPagesModel musicPagesModel = this.a;
        i Q = ((s0.o0) obj).Q();
        MusicPagesModel.a v = musicPagesModel.v();
        v.w(Q);
        return e0.f(v.c());
    }
}
