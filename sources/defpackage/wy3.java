package defpackage;

import com.spotify.music.features.album.di.AlbumAutoPlayUrlHandler;
import com.spotify.music.libs.collection.util.o;
import com.spotify.music.libs.freetiertrackpreview.transformer.g;
import com.spotify.music.libs.viewartistscontextmenu.ui.c;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.radio.formatlist.d;
import io.reactivex.y;

/* renamed from: wy3  reason: default package */
public final class wy3 implements fjf<vy3> {
    private final wlf<Boolean> a;
    private final wlf<d> b;
    private final wlf<String> c;
    private final wlf<y> d;
    private final wlf<t8a> e;
    private final wlf<uk9> f;
    private final wlf<t> g;
    private final wlf<com.spotify.music.features.addtoplaylist.d> h;
    private final wlf<jzc> i;
    private final wlf<iy3> j;
    private final wlf<o> k;
    private final wlf<Boolean> l;
    private final wlf<AlbumAutoPlayUrlHandler> m;
    private final wlf<c> n;
    private final wlf<ny3> o;
    private final wlf<mf3> p;
    private final wlf<c04> q;
    private final wlf<tw3> r;
    private final wlf<qw3> s;
    private final wlf<g> t;

    public wy3(wlf<Boolean> wlf, wlf<d> wlf2, wlf<String> wlf3, wlf<y> wlf4, wlf<t8a> wlf5, wlf<uk9> wlf6, wlf<t> wlf7, wlf<com.spotify.music.features.addtoplaylist.d> wlf8, wlf<jzc> wlf9, wlf<iy3> wlf10, wlf<o> wlf11, wlf<Boolean> wlf12, wlf<AlbumAutoPlayUrlHandler> wlf13, wlf<c> wlf14, wlf<ny3> wlf15, wlf<mf3> wlf16, wlf<c04> wlf17, wlf<tw3> wlf18, wlf<qw3> wlf19, wlf<g> wlf20) {
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
        return new vy3(this.a.get().booleanValue(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get().booleanValue(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get(), this.s.get(), this.t.get());
    }
}
