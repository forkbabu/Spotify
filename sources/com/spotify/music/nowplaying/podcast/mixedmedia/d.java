package com.spotify.music.nowplaying.podcast.mixedmedia;

import com.spotify.music.nowplaying.common.view.close.b;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.g;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu.MixedMediaContextMenuButtonPresenter;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.e;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.sleep.PodcastMixedMediaSleepTimerButtonPresenter;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.i;

public final class d implements fjf<c> {
    private final wlf<prb> a;
    private final wlf<jrb> b;
    private final wlf<v1c> c;
    private final wlf<b> d;
    private final wlf<c> e;
    private final wlf<MixedMediaContextMenuButtonPresenter> f;
    private final wlf<SegmentSeekBarPresenter> g;
    private final wlf<e.a> h;
    private final wlf<grb> i;
    private final wlf<f> j;
    private final wlf<i> k;
    private final wlf<a> l;
    private final wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.d> m;
    private final wlf<ControlBarViewBinder> n;
    private final wlf<ControlBarViewBinder.a> o;
    private final wlf<g> p;
    private final wlf<PodcastMixedMediaSleepTimerButtonPresenter> q;
    private final wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.g> r;
    private final wlf<com.spotify.nowplaying.core.orientation.b> s;
    private final wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.e> t;

    public d(wlf<prb> wlf, wlf<jrb> wlf2, wlf<v1c> wlf3, wlf<b> wlf4, wlf<c> wlf5, wlf<MixedMediaContextMenuButtonPresenter> wlf6, wlf<SegmentSeekBarPresenter> wlf7, wlf<e.a> wlf8, wlf<grb> wlf9, wlf<f> wlf10, wlf<i> wlf11, wlf<a> wlf12, wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.d> wlf13, wlf<ControlBarViewBinder> wlf14, wlf<ControlBarViewBinder.a> wlf15, wlf<g> wlf16, wlf<PodcastMixedMediaSleepTimerButtonPresenter> wlf17, wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.g> wlf18, wlf<com.spotify.nowplaying.core.orientation.b> wlf19, wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.e> wlf20) {
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
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
        this.o = wlf15;
        this.p = wlf16;
        this.q = wlf17;
        this.r = wlf18;
        this.s = wlf19;
        this.t = wlf20;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get(), this.s.get(), this.t.get());
    }
}
