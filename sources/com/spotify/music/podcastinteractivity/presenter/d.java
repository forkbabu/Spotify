package com.spotify.music.podcastinteractivity.presenter;

import com.spotify.music.podcastinteractivity.proto.ClientPollsForEntityResponse;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ PodcastPollPresenter a;

    public /* synthetic */ d(PodcastPollPresenter podcastPollPresenter) {
        this.a = podcastPollPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        PodcastPollPresenter.d(this.a, (ClientPollsForEntityResponse) obj);
    }
}
