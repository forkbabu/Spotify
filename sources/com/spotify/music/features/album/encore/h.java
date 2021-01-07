package com.spotify.music.features.album.encore;

import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;

public final class h implements fjf<g> {
    private final wlf<a71> a;
    private final wlf<a71> b;
    private final wlf<AgeRestrictedContentFacade> c;

    public h(wlf<a71> wlf, wlf<a71> wlf2, wlf<AgeRestrictedContentFacade> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get(), this.c.get());
    }
}
