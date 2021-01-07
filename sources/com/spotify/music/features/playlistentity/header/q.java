package com.spotify.music.features.playlistentity.header;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class q implements g {
    public static final /* synthetic */ q a = new q();

    private /* synthetic */ q() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "PlaylistHeaderPresenter failed to get collaborators", new Object[0]);
    }
}
