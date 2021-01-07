package com.spotify.music.podcastinteractivity.presenter;

import com.spotify.music.podcastinteractivity.proto.ClientPollResponse;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ PodcastPollPresenter a;

    public /* synthetic */ b(PodcastPollPresenter podcastPollPresenter) {
        this.a = podcastPollPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e((ClientPollResponse) obj);
    }
}
