package com.spotify.music.nowplaying.common.view.logging;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.music.loggers.InteractionLogger;

public final class d implements fjf<c> {
    private final wlf<InteractionLogger> a;
    private final wlf<LegacyPlayerState> b;
    private final wlf<String> c;

    public d(wlf<InteractionLogger> wlf, wlf<LegacyPlayerState> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b, this.c.get());
    }
}
