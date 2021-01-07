package defpackage;

import com.spotify.music.nowplaying.common.view.close.b;
import com.spotify.nowplaying.core.immersive.c;
import com.spotify.nowplaying.ui.components.controls.seekbar.e;

/* renamed from: mob  reason: default package */
public final class mob implements fjf<lob> {
    private final wlf<aqb> a;
    private final wlf<wpb> b;
    private final wlf<e> c;
    private final wlf<b> d;
    private final wlf<ypb> e;
    private final wlf<c> f;
    private final wlf<com.spotify.nowplaying.ui.components.controls.previous.e> g;
    private final wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> h;
    private final wlf<com.spotify.music.nowplaying.ads.view.nextbutton.c> i;
    private final wlf<eqb> j;
    private final wlf<cqb> k;
    private final wlf<grb> l;
    private final wlf<com.spotify.nowplaying.core.orientation.b> m;
    private final wlf<gqb> n;
    private final wlf<lqb> o;
    private final wlf<oob> p;
    private final wlf<hob> q;
    private final wlf<iqb> r;

    public mob(wlf<aqb> wlf, wlf<wpb> wlf2, wlf<e> wlf3, wlf<b> wlf4, wlf<ypb> wlf5, wlf<c> wlf6, wlf<com.spotify.nowplaying.ui.components.controls.previous.e> wlf7, wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> wlf8, wlf<com.spotify.music.nowplaying.ads.view.nextbutton.c> wlf9, wlf<eqb> wlf10, wlf<cqb> wlf11, wlf<grb> wlf12, wlf<com.spotify.nowplaying.core.orientation.b> wlf13, wlf<gqb> wlf14, wlf<lqb> wlf15, wlf<oob> wlf16, wlf<hob> wlf17, wlf<iqb> wlf18) {
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
        return new lob(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get());
    }
}
