package com.spotify.music.libs.mediabrowserservice;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class x0 implements g {
    public static final /* synthetic */ x0 a = new x0();

    private /* synthetic */ x0() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error during media player view model observe.", new Object[0]);
    }
}
