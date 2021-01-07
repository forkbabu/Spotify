package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class z implements g {
    public static final /* synthetic */ z a = new z();

    private /* synthetic */ z() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.i("Error observing filter and sort configuration", (Throwable) obj);
    }
}
