package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

public final /* synthetic */ class v implements l {
    public static final /* synthetic */ v a = new v();

    private /* synthetic */ v() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Failed to load artist recommendations", new Object[0]);
        return y3.a;
    }
}
