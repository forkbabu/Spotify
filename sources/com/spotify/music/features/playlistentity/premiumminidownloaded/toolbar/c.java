package com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar;

import com.spotify.music.premiummini.a;
import com.spotify.music.premiummini.ui.b;

public final class c implements fjf<PremiumMiniRemoveAllSongsItem> {
    private final wlf<b> a;
    private final wlf<a> b;

    public c(wlf<b> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PremiumMiniRemoveAllSongsItem(this.a.get(), this.b.get());
    }
}
