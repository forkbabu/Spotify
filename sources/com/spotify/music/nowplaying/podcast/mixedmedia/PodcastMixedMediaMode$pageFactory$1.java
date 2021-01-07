package com.spotify.music.nowplaying.podcast.mixedmedia;

import kotlin.jvm.internal.Lambda;

final class PodcastMixedMediaMode$pageFactory$1 extends Lambda implements cmf<c> {
    final /* synthetic */ PodcastMixedMediaMode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PodcastMixedMediaMode$pageFactory$1(PodcastMixedMediaMode podcastMixedMediaMode) {
        super(0);
        this.this$0 = podcastMixedMediaMode;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public c invoke() {
        return (c) PodcastMixedMediaMode.c(this.this$0).get();
    }
}
