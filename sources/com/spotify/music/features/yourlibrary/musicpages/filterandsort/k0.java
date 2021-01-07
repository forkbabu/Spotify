package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import io.reactivex.functions.l;

public final /* synthetic */ class k0 implements l {
    public final /* synthetic */ MusicPagesFiltering a;

    public /* synthetic */ k0(MusicPagesFiltering musicPagesFiltering) {
        this.a = musicPagesFiltering;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d((String) obj);
    }
}
