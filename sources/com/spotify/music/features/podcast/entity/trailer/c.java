package com.spotify.music.features.podcast.entity.trailer;

import android.view.View;

public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ PodcastTrailerPresenter a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c(PodcastTrailerPresenter podcastTrailerPresenter, String str, boolean z) {
        this.a = podcastTrailerPresenter;
        this.b = str;
        this.c = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(this.b, this.c, view);
    }
}
