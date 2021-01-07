package com.spotify.music.features.ads.audioplus.overlay.brandads;

import com.spotify.music.features.ads.audioplus.overlay.i;
import com.spotify.music.features.ads.audioplus.overlay.j;

public final class t implements j {
    private final wlf<l> a;

    public t(wlf<l> wlf) {
        this.a = wlf;
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.j
    public i.a b() {
        wlf<l> wlf = this.a;
        wlf.getClass();
        return new a(wlf);
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.j
    public String name() {
        return "v1";
    }
}
