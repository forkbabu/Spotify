package com.spotify.music.libs.facebook;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = FacebookPlaceholderActivity.P;
        Logger.e((Throwable) obj, "Failed to subscribe to social state", new Object[0]);
    }
}
