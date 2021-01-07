package com.spotify.music.libs.mediabrowserservice;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class m0 implements g {
    public static final /* synthetic */ m0 a = new m0();

    private /* synthetic */ m0() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to resolve MediaSessionCallbackHandler", new Object[0]);
    }
}
