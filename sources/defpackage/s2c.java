package defpackage;

import com.spotify.music.nowplaying.common.view.close.b;
import com.spotify.music.nowplaying.common.view.contextmenu.l;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.nowplaying.ui.components.controls.seekbackward.h;
import com.spotify.nowplaying.ui.components.controls.seekbar.e;
import com.spotify.nowplaying.ui.components.controls.seekforward.g;

/* renamed from: s2c  reason: default package */
public final class s2c implements fjf<r2c> {
    private final wlf<b> a;
    private final wlf<c> b;
    private final wlf<l> c;
    private final wlf<f> d;
    private final wlf<e0c> e;
    private final wlf<com.spotify.music.nowplaying.podcastads.cta.c> f;
    private final wlf<e> g;
    private final wlf<com.spotify.music.nowplaying.podcast.speedcontrol.e> h;
    private final wlf<h> i;
    private final wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> j;
    private final wlf<g> k;
    private final wlf<com.spotify.music.nowplaying.podcast.sleeptimer.e> l;
    private final wlf<jrb> m;
    private final wlf<prb> n;
    private final wlf<com.spotify.music.nowplaying.common.view.share.e> o;
    private final wlf<grb> p;
    private final wlf<com.spotify.nowplaying.core.orientation.b> q;
    private final wlf<n2c> r;

    public s2c(wlf<b> wlf, wlf<c> wlf2, wlf<l> wlf3, wlf<f> wlf4, wlf<e0c> wlf5, wlf<com.spotify.music.nowplaying.podcastads.cta.c> wlf6, wlf<e> wlf7, wlf<com.spotify.music.nowplaying.podcast.speedcontrol.e> wlf8, wlf<h> wlf9, wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> wlf10, wlf<g> wlf11, wlf<com.spotify.music.nowplaying.podcast.sleeptimer.e> wlf12, wlf<jrb> wlf13, wlf<prb> wlf14, wlf<com.spotify.music.nowplaying.common.view.share.e> wlf15, wlf<grb> wlf16, wlf<com.spotify.nowplaying.core.orientation.b> wlf17, wlf<n2c> wlf18) {
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
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r2c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get());
    }
}