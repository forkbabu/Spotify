package com.spotify.music.features.goldenpath.referencetoplist;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to retrieve view model", new Object[0]);
    }
}