package com.spotify.music.features.ads.audioplus.overlay.brandads;

import com.spotify.music.features.ads.audioplus.LeaveBehindAdType;
import com.spotify.music.features.ads.audioplus.overlay.i;
import com.spotify.music.features.ads.audioplus.overlay.j;

public final class r implements j {
    private final wlf<n> a;

    public r(wlf<n> wlf) {
        this.a = wlf;
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.j
    public i.a b() {
        wlf<n> wlf = this.a;
        wlf.getClass();
        return new a(wlf);
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.j
    public String name() {
        return LeaveBehindAdType.BRAND_ADS.d();
    }
}
