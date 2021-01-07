package com.spotify.music.spotlets.radio.service;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class w implements g {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d(RadioActionsService.t, "Failed to get session state", (Throwable) obj);
    }
}
