package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class v implements g {
    public static final /* synthetic */ v a = new v();

    private /* synthetic */ v() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.i("Error observing filter states", (Throwable) obj);
    }
}
