package com.spotify.music.libs.mediabrowserservice;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class v0 implements g {
    public static final /* synthetic */ v0 a = new v0();

    private /* synthetic */ v0() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error while observing errors.", new Object[0]);
    }
}
