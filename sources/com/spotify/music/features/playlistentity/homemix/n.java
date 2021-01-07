package com.spotify.music.features.playlistentity.homemix;

import com.spotify.music.json.g;

public final class n implements fjf<HomeMixFormatListAttributesHelper> {
    private final wlf<g> a;

    public n(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HomeMixFormatListAttributesHelper(this.a.get());
    }
}
