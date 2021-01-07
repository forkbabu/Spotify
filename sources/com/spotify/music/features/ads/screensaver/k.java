package com.spotify.music.features.ads.screensaver;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        int i = n0.y;
        Logger.e(th, th.getMessage(), new Object[0]);
    }
}
