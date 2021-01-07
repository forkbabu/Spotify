package com.spotify.music.features.video;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.video.y;

public final class s implements fjf<r> {
    private final wlf<w> a;
    private final wlf<y> b;

    public s(wlf<w> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get(), ejf.a(this.b));
    }
}
