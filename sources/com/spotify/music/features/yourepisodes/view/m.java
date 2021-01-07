package com.spotify.music.features.yourepisodes.view;

import androidx.lifecycle.n;
import com.spotify.music.features.yourepisodes.interactor.a;
import com.spotify.music.libs.podcast.download.g0;
import com.spotify.music.navigation.t;
import io.reactivex.y;

public final class m implements fjf<YourEpisodesDownloadListenerImpl> {
    private final wlf<n> a;
    private final wlf<tsc> b;
    private final wlf<g0> c;
    private final wlf<y> d;
    private final wlf<t> e;
    private final wlf<a> f;
    private final wlf<m8a> g;
    private final wlf<com.spotify.music.libs.podcast.download.y> h;

    public m(wlf<n> wlf, wlf<tsc> wlf2, wlf<g0> wlf3, wlf<y> wlf4, wlf<t> wlf5, wlf<a> wlf6, wlf<m8a> wlf7, wlf<com.spotify.music.libs.podcast.download.y> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new YourEpisodesDownloadListenerImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
