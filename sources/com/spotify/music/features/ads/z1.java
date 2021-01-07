package com.spotify.music.features.ads;

import com.spotify.music.features.ads.rules.AdRules;

public final class z1 implements fjf<y1> {
    private final wlf<AdRules> a;
    private final wlf<pt3> b;

    public z1(wlf<AdRules> wlf, wlf<pt3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y1(this.a.get(), this.b.get());
    }
}
