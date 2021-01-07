package com.spotify.music.libs.mediabrowserservice;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class z0 implements g {
    public static final /* synthetic */ z0 a = new z0();

    private /* synthetic */ z0() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error during media player view model observe.", new Object[0]);
    }
}
