package com.spotify.music.features.video;

import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;

public final class h implements fjf<BetamaxOfflineManager> {
    private final wlf<x72> a;

    public h(wlf<x72> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        BetamaxOfflineManager a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
