package com.spotify.music.offlinetrials.limited.trackentity;

public final class m implements fjf<l> {
    private final wlf<d9c> a;
    private final wlf<String> b;

    public m(wlf<d9c> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get());
    }
}
