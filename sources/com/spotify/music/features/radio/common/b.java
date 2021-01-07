package com.spotify.music.features.radio.common;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        int i = AbstractContentFragment.v0;
        Logger.d("Failed to process session state", new Object[0]);
    }
}
