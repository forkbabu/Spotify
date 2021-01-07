package com.spotify.music.features.playlistentity.homemix;

public final class u implements fjf<t> {
    private final wlf<v> a;

    public u(wlf<v> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t(this.a.get());
    }
}
