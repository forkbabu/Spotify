package com.spotify.music.podcast.speedcontrol;

import com.spotify.remoteconfig.ga;

public final class e implements fjf<Boolean> {
    private final wlf<ga> a;

    public e(wlf<ga> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().b());
    }
}
