package com.spotify.music.features.datasavermode.settings;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error observing data saver mode configuration", new Object[0]);
    }
}
