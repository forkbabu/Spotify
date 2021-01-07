package com.spotify.music.features.ads;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class z implements g {
    public static final /* synthetic */ z a = new z();

    private /* synthetic */ z() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("[AdsPlaybackPlugin], %s", ((Throwable) obj).getMessage());
    }
}
