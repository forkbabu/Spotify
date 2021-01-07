package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import io.reactivex.functions.l;

public final /* synthetic */ class i0 implements l {
    public final /* synthetic */ MusicPagesFiltering a;
    public final /* synthetic */ String b;

    public /* synthetic */ i0(MusicPagesFiltering musicPagesFiltering, String str) {
        this.a = musicPagesFiltering;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, (String) obj);
    }
}
