package com.spotify.music.newplaying.scroll.widgets.storylines;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class q implements g {
    public static final /* synthetic */ q a = new q();

    private /* synthetic */ q() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Unhandled Storylines subscription error.", new Object[0]);
    }
}
