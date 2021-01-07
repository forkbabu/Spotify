package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import io.reactivex.functions.n;

public final /* synthetic */ class e0 implements n {
    public final /* synthetic */ d1 a;

    public /* synthetic */ e0(d1 d1Var) {
        this.a = d1Var;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        this.a.getClass();
        return ((MusicPagesModel) obj).a().isPresent();
    }
}
