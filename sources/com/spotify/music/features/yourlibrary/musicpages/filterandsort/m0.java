package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.n;

public final /* synthetic */ class m0 implements n {
    public static final /* synthetic */ m0 a = new m0();

    private /* synthetic */ m0() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !MoreObjects.isNullOrEmpty((String) obj);
    }
}
