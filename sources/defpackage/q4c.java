package defpackage;

import com.spotify.music.nowplaying.common.view.close.b;
import com.spotify.music.nowplaying.common.view.contextmenu.l;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.nowplaying.ui.components.controls.seekbackward.h;
import com.spotify.nowplaying.ui.components.controls.seekbar.e;
import com.spotify.nowplaying.ui.components.controls.seekforward.g;

/* renamed from: q4c  reason: default package */
public final class q4c implements fjf<p4c> {
    private final wlf<b> a;
    private final wlf<c> b;
    private final wlf<l> c;
    private final wlf<f> d;
    private final wlf<r4c> e;
    private final wlf<com.spotify.music.nowplaying.common.view.trackinfo.c> f;
    private final wlf<e> g;
    private final wlf<com.spotify.nowplaying.ui.components.controls.seekbar.live.c> h;
    private final wlf<h> i;
    private final wlf<com.spotify.nowplaying.ui.components.controls.previous.e> j;
    private final wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> k;
    private final wlf<com.spotify.nowplaying.ui.components.controls.next.f> l;
    private final wlf<g> m;
    private final wlf<jrb> n;
    private final wlf<prb> o;
    private final wlf<com.spotify.music.nowplaying.common.view.share.e> p;
    private final wlf<wrb> q;
    private final wlf<com.spotify.nowplaying.ui.components.overlay.h> r;
    private final wlf<com.spotify.nowplaying.core.immersive.c> s;
    private final wlf<grb> t;
    private final wlf<com.spotify.nowplaying.core.orientation.b> u;
    private final wlf<l4c> v;

    public q4c(wlf<b> wlf, wlf<c> wlf2, wlf<l> wlf3, wlf<f> wlf4, wlf<r4c> wlf5, wlf<com.spotify.music.nowplaying.common.view.trackinfo.c> wlf6, wlf<e> wlf7, wlf<com.spotify.nowplaying.ui.components.controls.seekbar.live.c> wlf8, wlf<h> wlf9, wlf<com.spotify.nowplaying.ui.components.controls.previous.e> wlf10, wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> wlf11, wlf<com.spotify.nowplaying.ui.components.controls.next.f> wlf12, wlf<g> wlf13, wlf<jrb> wlf14, wlf<prb> wlf15, wlf<com.spotify.music.nowplaying.common.view.share.e> wlf16, wlf<wrb> wlf17, wlf<com.spotify.nowplaying.ui.components.overlay.h> wlf18, wlf<com.spotify.nowplaying.core.immersive.c> wlf19, wlf<grb> wlf20, wlf<com.spotify.nowplaying.core.orientation.b> wlf21, wlf<l4c> wlf22) {
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
        this.u = wlf21;
        this.v = wlf22;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p4c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get(), this.s.get(), this.t.get(), this.u.get(), this.v.get());
    }
}
