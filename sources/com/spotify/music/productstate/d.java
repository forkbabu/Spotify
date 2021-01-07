package com.spotify.music.productstate;

import com.spotify.mobile.android.rx.w;

public final class d implements fjf<c> {
    private final wlf<w> a;

    public d(wlf<w> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
