package com.spotify.music.autoplay;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class r implements g {
    public static final /* synthetic */ r a = new r();

    private /* synthetic */ r() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("AutoPlay: Source %s", (RadioSeedBundle) obj);
    }
}
