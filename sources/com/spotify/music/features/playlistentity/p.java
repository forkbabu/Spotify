package com.spotify.music.features.playlistentity;

public final class p implements fjf<o> {
    private final wlf<String> a;

    public p(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get());
    }
}
