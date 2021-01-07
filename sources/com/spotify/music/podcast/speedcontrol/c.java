package com.spotify.music.podcast.speedcontrol;

import com.spotify.remoteconfig.ga;

public final class c implements fjf<Boolean> {
    private final wlf<ga> a;

    public c(wlf<ga> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a());
    }
}
