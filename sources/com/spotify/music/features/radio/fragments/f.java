package com.spotify.music.features.radio.fragments;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = RadioFragment.N0;
        Logger.e((Throwable) obj, "Failed to process session state", new Object[0]);
    }
}
