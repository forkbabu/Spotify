package com.spotify.music.features.podcast.entity.trailer;

import android.content.res.Resources;
import androidx.lifecycle.n;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.podcast.entity.trailer.PodcastTrailerPresenter;
import com.spotify.music.podcast.episode.util.DurationFormatter;
import defpackage.yfc;
import io.reactivex.y;

public final class i implements fjf<PodcastTrailerPresenter> {
    private final wlf<PodcastTrailerPresenter.a> a;
    private final wlf<yfc.a> b;
    private final wlf<DurationFormatter> c;
    private final wlf<Resources> d;
    private final wlf<snc> e;
    private final wlf<x57> f;
    private final wlf<ExplicitContentFacade> g;
    private final wlf<String> h;
    private final wlf<y> i;
    private final wlf<n> j;

    public i(wlf<PodcastTrailerPresenter.a> wlf, wlf<yfc.a> wlf2, wlf<DurationFormatter> wlf3, wlf<Resources> wlf4, wlf<snc> wlf5, wlf<x57> wlf6, wlf<ExplicitContentFacade> wlf7, wlf<String> wlf8, wlf<y> wlf9, wlf<n> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PodcastTrailerPresenter(ejf.a(this.a), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
