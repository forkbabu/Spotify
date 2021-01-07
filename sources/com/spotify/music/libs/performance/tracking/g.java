package com.spotify.music.libs.performance.tracking;

import com.spotify.base.java.logging.Logger;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.d("Error subscribing to page identifier.", new Object[0]);
    }
}
