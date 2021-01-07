package defpackage;

import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.d;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.g;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.o;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.r;

/* renamed from: crb  reason: default package */
public final class crb implements fjf<brb> {
    private final wlf<o> a;
    private final wlf<r> b;
    private final wlf<d> c;
    private final wlf<g> d;
    private final wlf<vl2> e;
    private final wlf<pl2> f;

    public crb(wlf<o> wlf, wlf<r> wlf2, wlf<d> wlf3, wlf<g> wlf4, wlf<vl2> wlf5, wlf<pl2> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static crb a(wlf<o> wlf, wlf<r> wlf2, wlf<d> wlf3, wlf<g> wlf4, wlf<vl2> wlf5, wlf<pl2> wlf6) {
        return new crb(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new brb(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
