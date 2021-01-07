package com.spotify.music.libs.performance.tracking;

import com.spotify.remoteconfig.wc;

public final class t implements fjf<s> {
    private final wlf<wc> a;

    public t(wlf<wc> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get());
    }
}
