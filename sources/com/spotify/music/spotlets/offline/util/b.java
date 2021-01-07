package com.spotify.music.spotlets.offline.util;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.connection.OfflineState;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("PUT OfflineState %s", Boolean.valueOf(((OfflineState) obj).offline()));
    }
}
