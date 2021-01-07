package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;

public final /* synthetic */ class e0 implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ e0(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        MusicPagesModel musicPagesModel = this.a;
        boolean z = ((s0.e) obj).Q() == 0;
        if (musicPagesModel.e().isPresent() && musicPagesModel.e().get().booleanValue() == z) {
            return com.spotify.mobius.e0.h();
        }
        Optional<Boolean> of = Optional.of(Boolean.valueOf(z));
        MusicPagesModel.a v = musicPagesModel.v();
        v.e(of);
        return com.spotify.mobius.e0.f(v.c());
    }
}
