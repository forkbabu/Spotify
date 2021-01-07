package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import io.reactivex.functions.l;

public final /* synthetic */ class l0 implements l {
    public final /* synthetic */ MusicPagesFiltering a;

    public /* synthetic */ l0(MusicPagesFiltering musicPagesFiltering) {
        this.a = musicPagesFiltering;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c((MusicPagesFiltering.a) obj);
    }
}
