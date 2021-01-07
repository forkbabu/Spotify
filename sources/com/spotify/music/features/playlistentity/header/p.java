package com.spotify.music.features.playlistentity.header;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class p implements g {
    public static final /* synthetic */ p a = new p();

    private /* synthetic */ p() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "PlaylistHeaderPresenter failed to wait for scroll to position", new Object[0]);
    }
}
