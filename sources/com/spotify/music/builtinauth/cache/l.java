package com.spotify.music.builtinauth.cache;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class l implements g {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.o((Throwable) obj, "Error while updating built-in cache", new Object[0]);
    }
}
