package defpackage;

import com.spotify.music.newplaying.scroll.container.d0;
import com.spotify.music.nowplaying.common.view.canvas.artist.h;
import com.spotify.music.nowplaying.common.view.close.b;
import com.spotify.music.nowplaying.common.view.contextmenu.l;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.nowplaying.common.view.heart.g;
import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.music.offlinetrials.limited.uicomponents.r;
import com.spotify.music.sushi.badge.SushiBadgePresenter;
import com.spotify.nowplaying.ui.components.controls.seekbar.e;
import com.spotify.nowplaying.ui.components.shuffle.d;
import com.squareup.picasso.Picasso;

/* renamed from: wsb  reason: default package */
public final class wsb implements fjf<vsb> {
    private final wlf<Picasso> A;
    private final wlf<rsb> B;
    private final wlf<b> a;
    private final wlf<c> b;
    private final wlf<l> c;
    private final wlf<f> d;
    private final wlf<brb> e;
    private final wlf<com.spotify.music.nowplaying.common.view.trackinfo.c> f;
    private final wlf<SushiBadgePresenter> g;
    private final wlf<r> h;
    private final wlf<g> i;
    private final wlf<e> j;
    private final wlf<vqd> k;
    private final wlf<d> l;
    private final wlf<com.spotify.nowplaying.ui.components.controls.previous.e> m;
    private final wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> n;
    private final wlf<com.spotify.nowplaying.ui.components.controls.next.f> o;
    private final wlf<com.spotify.nowplaying.ui.components.repeat.d> p;
    private final wlf<jrb> q;
    private final wlf<prb> r;
    private final wlf<com.spotify.music.nowplaying.common.view.queue.c> s;
    private final wlf<h> t;
    private final wlf<grb> u;
    private final wlf<com.spotify.nowplaying.core.orientation.b> v;
    private final wlf<com.spotify.nowplaying.ui.components.overlay.h> w;
    private final wlf<d0> x;
    private final wlf<com.spotify.music.newplaying.scroll.e> y;
    private final wlf<gxc> z;

    public wsb(wlf<b> wlf, wlf<c> wlf2, wlf<l> wlf3, wlf<f> wlf4, wlf<brb> wlf5, wlf<com.spotify.music.nowplaying.common.view.trackinfo.c> wlf6, wlf<SushiBadgePresenter> wlf7, wlf<r> wlf8, wlf<g> wlf9, wlf<e> wlf10, wlf<vqd> wlf11, wlf<d> wlf12, wlf<com.spotify.nowplaying.ui.components.controls.previous.e> wlf13, wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> wlf14, wlf<com.spotify.nowplaying.ui.components.controls.next.f> wlf15, wlf<com.spotify.nowplaying.ui.components.repeat.d> wlf16, wlf<jrb> wlf17, wlf<prb> wlf18, wlf<com.spotify.music.nowplaying.common.view.queue.c> wlf19, wlf<h> wlf20, wlf<grb> wlf21, wlf<com.spotify.nowplaying.core.orientation.b> wlf22, wlf<com.spotify.nowplaying.ui.components.overlay.h> wlf23, wlf<d0> wlf24, wlf<com.spotify.music.newplaying.scroll.e> wlf25, wlf<gxc> wlf26, wlf<Picasso> wlf27, wlf<rsb> wlf28) {
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
        this.w = wlf23;
        this.x = wlf24;
        this.y = wlf25;
        this.z = wlf26;
        this.A = wlf27;
        this.B = wlf28;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vsb(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get(), this.s.get(), this.t.get(), this.u.get(), this.v.get(), this.w.get(), this.x.get(), this.y.get(), this.z.get(), this.A.get(), this.B.get());
    }
}
