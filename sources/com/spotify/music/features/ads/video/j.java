package com.spotify.music.features.ads.video;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.events.e0;
import com.spotify.mobile.android.video.events.f0;
import com.spotify.mobile.android.video.g0;

public class j implements f0 {
    private final wlf<dv3> a;
    private final wlf<xr3> b;
    private final p c;

    public j(wlf<dv3> wlf, wlf<xr3> wlf2, p pVar) {
        wlf.getClass();
        this.a = wlf;
        wlf2.getClass();
        this.b = wlf2;
        this.c = pVar;
    }

    @Override // com.spotify.mobile.android.video.events.f0
    public Optional<e0> g(d0 d0Var, a0 a0Var, com.spotify.mobile.android.video.f0 f0Var, String str, g0 g0Var) {
        boolean z = true;
        if ((!PlayerTrackUtil.isAdInMetadata(d0Var.c()) && !PlayerTrackUtil.isInterruptionFromAds(d0Var.c().get("endvideo_track_uri"), d0Var.c())) || !PlayerTrackUtil.hasAdId(d0Var.c()) || !(!PlayerTrackUtil.hasManifestId(d0Var.c()))) {
            z = false;
        }
        if (z) {
            return Optional.of(new i(this.a.get(), d0Var, f0Var, this.b.get(), this.c));
        }
        return Optional.absent();
    }
}
