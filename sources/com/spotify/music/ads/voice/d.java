package com.spotify.music.ads.voice;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.b("[VoiceAd] Mobius loop cannot be registered", new Object[0]);
    }
}
