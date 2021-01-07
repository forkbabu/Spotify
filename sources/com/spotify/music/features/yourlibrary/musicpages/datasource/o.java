package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

public final /* synthetic */ class o implements l {
    public static final /* synthetic */ o a = new o();

    private /* synthetic */ o() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Failed loading album recs", new Object[0]);
        return y3.a;
    }
}
