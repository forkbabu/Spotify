package com.spotify.music.features.podcast.entity.trailer;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ PodcastTrailerPresenter a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(PodcastTrailerPresenter podcastTrailerPresenter, String str) {
        this.a = podcastTrailerPresenter;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
