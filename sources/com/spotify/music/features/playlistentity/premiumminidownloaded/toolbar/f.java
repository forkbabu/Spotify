package com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar;

public final class f implements fjf<e> {
    private final wlf<a> a;
    private final wlf<PremiumMiniRemoveAllSongsItem> b;

    public f(wlf<a> wlf, wlf<PremiumMiniRemoveAllSongsItem> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a, this.b);
    }
}
