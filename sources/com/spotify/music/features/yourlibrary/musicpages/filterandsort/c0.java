package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class c0 implements g {
    public static final /* synthetic */ c0 a = new c0();

    private /* synthetic */ c0() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Assertion.i("Error observing active sort option", (Throwable) obj);
    }
}
