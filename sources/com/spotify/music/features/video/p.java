package com.spotify.music.features.video;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.mobile.android.offline.coordinator.cosmos.f;
import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import com.spotify.podcast.endpoints.l;
import io.reactivex.y;

public final class p implements fjf<wa1> {
    private final wlf<BetamaxOfflineManager> a;
    private final wlf<l> b;
    private final wlf<l72> c;
    private final wlf<Cosmonaut> d;
    private final wlf<y> e;

    public p(wlf<BetamaxOfflineManager> wlf, wlf<l> wlf2, wlf<l72> wlf3, wlf<Cosmonaut> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return va1.b().a(this.a.get(), (f) this.d.get().createCosmosService(f.class), this.b.get(), this.c.get(), this.e.get());
    }
}
