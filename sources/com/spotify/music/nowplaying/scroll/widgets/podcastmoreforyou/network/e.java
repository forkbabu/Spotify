package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network;

public final class e implements fjf<d> {
    private final wlf<com.spotify.music.json.e> a;

    public e(wlf<com.spotify.music.json.e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
