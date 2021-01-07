package com.spotify.music.podcastentityrow;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ PodcastEpisodeItemConfigImpl a;

    public /* synthetic */ c(PodcastEpisodeItemConfigImpl podcastEpisodeItemConfigImpl) {
        this.a = podcastEpisodeItemConfigImpl;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((Boolean) obj);
    }
}
