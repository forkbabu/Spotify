package com.spotify.music.features.podcast.entity.trailer;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ PodcastTrailerPresenter a;

    public /* synthetic */ b(PodcastTrailerPresenter podcastTrailerPresenter) {
        this.a = podcastTrailerPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((Boolean) obj);
    }
}
