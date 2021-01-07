package com.spotify.music.libs.mediabrowserservice;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class u0 implements g {
    public static final /* synthetic */ u0 a = new u0();

    private /* synthetic */ u0() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error during restriction media action observe.", new Object[0]);
    }
}
