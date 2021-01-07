package com.spotify.music.nowplaying.podcast.mixedmedia;

import com.spotify.player.model.PlayerState;
import kotlin.jvm.internal.h;

public final class PodcastMixedMediaMode implements cqd {
    private final a a;
    private final wlf<c> b;

    public PodcastMixedMediaMode(a aVar, wlf<c> wlf) {
        h.e(aVar, "acceptancePolicy");
        h.e(wlf, "podcastModePageProvider");
        this.a = aVar;
        this.b = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        h.e(playerState, "playerState");
        return this.a.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<c> b() {
        return new PodcastMixedMediaMode$pageFactory$1(this);
    }

    @Override // defpackage.cqd
    public String name() {
        return "podcast_mixed_media_mode";
    }
}
