package com.spotify.music.podcast.player.trailer.impl;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PlayerApiPodcastTrailerPlayer$onStart$2 extends FunctionReferenceImpl implements nmf<tnc, f> {
    PlayerApiPodcastTrailerPlayer$onStart$2(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer) {
        super(1, playerApiPodcastTrailerPlayer, PlayerApiPodcastTrailerPlayer.class, "onPlayerOverlayStateReceived", "onPlayerOverlayStateReceived(Lcom/spotify/music/podcast/player/trailer/api/PodcastTrailerPlayerState;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(tnc tnc) {
        tnc tnc2 = tnc;
        h.e(tnc2, "p1");
        PlayerApiPodcastTrailerPlayer.f((PlayerApiPodcastTrailerPlayer) this.receiver, tnc2);
        return f.a;
    }
}
