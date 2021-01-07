package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import io.reactivex.functions.l;

public final /* synthetic */ class q0 implements l {
    public static final /* synthetic */ q0 a = new q0();

    private /* synthetic */ q0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
        return new v0(musicPagesModel.m().h(), musicPagesModel.a().or((Optional<ImmutableMap<String, Boolean>>) ImmutableMap.of()));
    }
}
