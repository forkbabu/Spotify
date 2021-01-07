package com.spotify.music.features.video;

import com.spotify.mobile.android.video.offline.z;

public final class i implements fjf<z> {
    private final wlf<x72> a;

    public i(wlf<x72> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        z b = this.a.get().b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
