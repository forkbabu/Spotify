package com.spotify.music.builtinauth.cache;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class t implements g {
    public static final /* synthetic */ t a = new t();

    private /* synthetic */ t() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.o((Throwable) obj, "Error while clearing built-in cache", new Object[0]);
    }
}
