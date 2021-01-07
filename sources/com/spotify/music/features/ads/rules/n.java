package com.spotify.music.features.ads.rules;

import com.spotify.music.features.ads.api.SlotApi;

public final class n implements fjf<m> {
    private final wlf<SlotApi> a;

    public n(wlf<SlotApi> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get());
    }
}
