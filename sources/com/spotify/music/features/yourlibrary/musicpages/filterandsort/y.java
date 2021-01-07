package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import io.reactivex.functions.g;

public final /* synthetic */ class y implements g {
    public final /* synthetic */ d1 a;

    public /* synthetic */ y(d1 d1Var) {
        this.a = d1Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        d1.v(this.a, (MusicPagesModel) obj);
    }
}
