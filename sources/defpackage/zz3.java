package defpackage;

import com.spotify.music.features.album.di.AlbumAutoPlayUrlHandler;
import com.spotify.music.libs.collection.util.o;
import com.spotify.music.libs.freetiertrackpreview.transformer.g;
import com.spotify.music.libs.viewartistscontextmenu.ui.c;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.radio.formatlist.d;
import io.reactivex.y;

/* renamed from: zz3  reason: default package */
public final class zz3 implements fjf<yz3> {
    private final wlf<Boolean> a;
    private final wlf<d> b;
    private final wlf<String> c;
    private final wlf<y> d;
    private final wlf<t8a> e;
    private final wlf<uk9> f;
    private final wlf<t> g;
    private final wlf<com.spotify.music.features.addtoplaylist.d> h;
    private final wlf<jzc> i;
    private final wlf<o> j;
    private final wlf<Boolean> k;
    private final wlf<AlbumAutoPlayUrlHandler> l;
    private final wlf<c> m;
    private final wlf<ny3> n;
    private final wlf<mf3> o;
    private final wlf<c04> p;
    private final wlf<tw3> q;
    private final wlf<qw3> r;
    private final wlf<g> s;

    public zz3(wlf<Boolean> wlf, wlf<d> wlf2, wlf<String> wlf3, wlf<y> wlf4, wlf<t8a> wlf5, wlf<uk9> wlf6, wlf<t> wlf7, wlf<com.spotify.music.features.addtoplaylist.d> wlf8, wlf<jzc> wlf9, wlf<o> wlf10, wlf<Boolean> wlf11, wlf<AlbumAutoPlayUrlHandler> wlf12, wlf<c> wlf13, wlf<ny3> wlf14, wlf<mf3> wlf15, wlf<c04> wlf16, wlf<tw3> wlf17, wlf<qw3> wlf18, wlf<g> wlf19) {
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
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yz3(this.a.get().booleanValue(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get().booleanValue(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get(), this.s.get());
    }
}
