package com.spotify.music.features.connect.cast;

import com.spotify.base.java.logging.Logger;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Google Cast: Active scan failed", new Object[0]);
    }
}
