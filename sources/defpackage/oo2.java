package defpackage;

import com.spotify.music.nowplaying.common.view.close.b;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.nowplaying.ui.components.controls.seekbar.e;

/* renamed from: oo2  reason: default package */
public final class oo2 implements fjf<no2> {
    private final wlf<b> a;
    private final wlf<c> b;
    private final wlf<grb> c;
    private final wlf<vo2> d;
    private final wlf<f> e;
    private final wlf<com.spotify.music.nowplaying.common.view.trackinfo.c> f;
    private final wlf<e> g;
    private final wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> h;
    private final wlf<com.spotify.music.carmode.nowplaying.common.view.optout.e> i;
    private final wlf<com.spotify.nowplaying.core.orientation.b> j;

    public oo2(wlf<b> wlf, wlf<c> wlf2, wlf<grb> wlf3, wlf<vo2> wlf4, wlf<f> wlf5, wlf<com.spotify.music.nowplaying.common.view.trackinfo.c> wlf6, wlf<e> wlf7, wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> wlf8, wlf<com.spotify.music.carmode.nowplaying.common.view.optout.e> wlf9, wlf<com.spotify.nowplaying.core.orientation.b> wlf10) {
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

    public static oo2 a(wlf<b> wlf, wlf<c> wlf2, wlf<grb> wlf3, wlf<vo2> wlf4, wlf<f> wlf5, wlf<com.spotify.music.nowplaying.common.view.trackinfo.c> wlf6, wlf<e> wlf7, wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> wlf8, wlf<com.spotify.music.carmode.nowplaying.common.view.optout.e> wlf9, wlf<com.spotify.nowplaying.core.orientation.b> wlf10) {
        return new oo2(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new no2(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
