package com.spotify.music.podcast.freetierlikes.tabs.di;

public final class g implements fjf<Boolean> {
    private final wlf<lbb> a;

    public g(wlf<lbb> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a());
    }
}
