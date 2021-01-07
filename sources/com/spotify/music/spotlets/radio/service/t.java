package com.spotify.music.spotlets.radio.service;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class t implements g {
    public static final /* synthetic */ t a = new t();

    private /* synthetic */ t() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d(RadioActionsService.t, "Failed to fetch flags", (Throwable) obj);
    }
}
