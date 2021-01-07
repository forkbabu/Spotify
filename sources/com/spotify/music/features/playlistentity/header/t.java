package com.spotify.music.features.playlistentity.header;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class t implements g {
    public static final /* synthetic */ t a = new t();

    private /* synthetic */ t() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "PlaylistHeaderPresenter: failed to change follow state for playlist", new Object[0]);
    }
}
