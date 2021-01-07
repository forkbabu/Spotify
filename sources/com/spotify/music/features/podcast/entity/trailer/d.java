package com.spotify.music.features.podcast.entity.trailer;

import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ PodcastTrailerPresenter a;

    public /* synthetic */ d(PodcastTrailerPresenter podcastTrailerPresenter) {
        this.a = podcastTrailerPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((Throwable) obj);
    }
}
