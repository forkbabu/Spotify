package com.spotify.music.ondemandsharing.shufflebutton;

import com.spotify.base.java.logging.Logger;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.c((Throwable) obj, "error subscribing to playerstate", new Object[0]);
    }
}
