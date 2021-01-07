package com.spotify.music.features.ads;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("AdProduct  not received: %s", ((Throwable) obj).getCause());
    }
}
