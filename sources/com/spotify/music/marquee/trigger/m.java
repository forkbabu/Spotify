package com.spotify.music.marquee.trigger;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.marquee.trigger.f0;
import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("Failed to receive Marquee response, error: %s", ((f0.c) obj).a());
    }
}
