package com.spotify.music.features.pushnotifications;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class s implements g {
    public static final /* synthetic */ s a = new s();

    private /* synthetic */ s() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d("Updating cache and remote call due to modified OS channel failed: %s", ((Throwable) obj).getMessage());
    }
}
