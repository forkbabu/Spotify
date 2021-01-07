package com.spotify.music.features.nowplaying.v2;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = NowPlayingActivity.S;
        Logger.e((Throwable) obj, "Err showing NPMode", new Object[0]);
    }
}
