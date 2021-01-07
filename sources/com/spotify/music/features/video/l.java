package com.spotify.music.features.video;

import defpackage.r62;

public final class l implements fjf<r62.a> {
    private final wlf<u62> a;

    public l(wlf<u62> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        r62.a a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
