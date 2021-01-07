package com.spotify.ads.uicomponents.secondaryintent;

import android.content.res.Resources;

public final class c implements fjf<b> {
    private final wlf<Resources> a;

    public c(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
