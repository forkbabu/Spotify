package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;

public final /* synthetic */ class c0 implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ c0(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        MusicPagesModel musicPagesModel = this.a;
        s0.s sVar = (s0.s) obj;
        if (musicPagesModel.m().l().ordinal() == 1) {
            return e0.a(z42.l(new r0.f1(musicPagesModel.c(), musicPagesModel.m().r(), sVar.Q())));
        }
        throw new IllegalArgumentException("Unsupported action");
    }
}
