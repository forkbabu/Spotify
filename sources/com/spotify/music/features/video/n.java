package com.spotify.music.features.video;

import com.spotify.mobile.android.video.drm.h;

public final class n implements fjf<y62> {
    private final wlf<h> a;
    private final wlf<o72> b;
    private final wlf<j72> c;

    public n(wlf<h> wlf, wlf<o72> wlf2, wlf<j72> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.c.get(), this.b.get());
    }
}
