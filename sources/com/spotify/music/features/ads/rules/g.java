package com.spotify.music.features.ads.rules;

public final class g implements fjf<AdRules> {
    private final wlf<p> a;

    public g(wlf<p> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AdRules(this.a.get());
    }
}
