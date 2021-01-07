package com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage;

public final class c implements fjf<b> {
    private final wlf<g> a;
    private final wlf<d> b;

    public c(wlf<g> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a, this.b);
    }
}
