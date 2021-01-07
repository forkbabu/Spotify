package com.spotify.music.spotlets.scannables;

import com.spotify.mobile.android.util.prefs.i;

public final class d implements fjf<c> {
    private final wlf<i> a;

    public d(wlf<i> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
