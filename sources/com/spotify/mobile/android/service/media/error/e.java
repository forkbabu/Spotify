package com.spotify.mobile.android.service.media.error;

import com.spotify.player.sub.l;

public final class e implements fjf<d> {
    private final wlf<l> a;

    public e(wlf<l> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
