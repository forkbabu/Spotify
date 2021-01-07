package com.spotify.music.podcastinteractivity.presenter;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ PodcastPollPresenter a;

    public /* synthetic */ a(PodcastPollPresenter podcastPollPresenter) {
        this.a = podcastPollPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((Throwable) obj);
    }
}
