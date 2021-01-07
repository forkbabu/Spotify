package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;

public final /* synthetic */ class v implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ v(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        return e0.a(ImmutableSet.of(new r0.u0(((s0.w) obj).Q())));
    }
}
