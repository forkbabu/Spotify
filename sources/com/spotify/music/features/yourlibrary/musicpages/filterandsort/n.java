package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.pages.f;

public final /* synthetic */ class n implements io.reactivex.functions.n {
    public static final /* synthetic */ n a = new n();

    private /* synthetic */ n() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
        return musicPagesModel.b().isPresent() && !ImmutableList.copyOf(Collections2.transform(musicPagesModel.m().h().h(), f.a)).isEmpty();
    }
}
