package com.spotify.music.features.yourlibrary.musicpages.datasource;

public final class l5 implements fjf<k5> {
    private final wlf<ih0> a;

    public l5(wlf<ih0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k5(this.a.get());
    }
}
