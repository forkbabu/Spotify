package com.spotify.music.podcastinteractivity.presenter;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ PodcastPollPresenter a;

    public /* synthetic */ c(PodcastPollPresenter podcastPollPresenter) {
        this.a = podcastPollPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        PodcastPollPresenter.b(this.a, (Throwable) obj);
    }
}
