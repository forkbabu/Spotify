package com.spotify.music.features.premiumdestination;

import com.spotify.music.libs.viewuri.c;

public final class g0 implements fjf<c> {
    private final wlf<c.a> a;

    public g0(wlf<c.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        c viewUri = this.a.get().getViewUri();
        yif.g(viewUri, "Cannot return null from a non-@Nullable @Provides method");
        return viewUri;
    }
}
