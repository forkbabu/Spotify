package com.spotify.music.features.ads.screensaver;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        String str = ScreensaverAdFragment.t0;
        Logger.c((Throwable) obj, "Failed to clear Mobile Overlay Slot", new Object[0]);
    }
}
