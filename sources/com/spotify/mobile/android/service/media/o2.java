package com.spotify.mobile.android.service.media;

import com.spotify.player.queue.f;

public final class o2 implements fjf<n2> {
    private final wlf<f> a;

    public o2(wlf<f> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n2(this.a.get());
    }
}
