package com.spotify.music.podcastinteractivity.presenter;

import androidx.lifecycle.n;
import com.spotify.music.podcastinteractivity.di.PollContainerPageIdProvider;
import io.reactivex.y;

public final class e implements fjf<PodcastPollPresenter> {
    private final wlf<stc> a;
    private final wlf<y> b;
    private final wlf<n> c;
    private final wlf<PollContainerPageIdProvider.ContainerPageId> d;
    private final wlf<ltc> e;

    public e(wlf<stc> wlf, wlf<y> wlf2, wlf<n> wlf3, wlf<PollContainerPageIdProvider.ContainerPageId> wlf4, wlf<ltc> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PodcastPollPresenter(this.a.get(), this.b.get(), this.c.get(), this.d.get(), ejf.a(this.e));
    }
}
