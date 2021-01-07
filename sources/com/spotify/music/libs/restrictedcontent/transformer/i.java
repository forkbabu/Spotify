package com.spotify.music.libs.restrictedcontent.transformer;

import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;

public final class i implements fjf<h> {
    private final wlf<f> a;
    private final wlf<AgeRestrictedContentFacade> b;

    public i(wlf<f> wlf, wlf<AgeRestrictedContentFacade> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get());
    }
}
