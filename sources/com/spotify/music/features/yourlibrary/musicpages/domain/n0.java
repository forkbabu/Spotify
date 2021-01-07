package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

public final /* synthetic */ class n0 implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ n0(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        MusicItem.f s = ((s0.x) obj).Q().s();
        return e0.a(ImmutableSet.of((r0.x) new r0.m0(s.i(), s.h(), s.g()), new r0.x()));
    }
}
