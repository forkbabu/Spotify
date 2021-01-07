package com.spotify.music.libs.facebook;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = FacebookConnectFragment.l0;
        Logger.e((Throwable) obj, "Failed to subscribe to social state", new Object[0]);
    }
}
