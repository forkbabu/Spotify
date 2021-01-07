package com.spotify.music.features.pushnotifications;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d("Could not fetch preferences to create notification channels. Cause: %s", ((Throwable) obj).getMessage());
    }
}
