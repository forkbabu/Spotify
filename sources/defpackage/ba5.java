package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.addtoplaylist.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ba5  reason: default package */
public final class ba5 implements fjf<aa5> {
    private final wlf<CollectionStateProvider> a;
    private final wlf<s7a> b;
    private final wlf<t8a> c;
    private final wlf<uk9> d;
    private final wlf<c> e;
    private final wlf<ga5> f;
    private final wlf<t> g;
    private final wlf<d> h;
    private final wlf<jzc> i;
    private final wlf<y> j;
    private final wlf<nsb> k;
    private final wlf<jrd> l;
    private final wlf<lac> m;
    private final wlf<t9c> n;
    private final wlf<v9c> o;
    private final wlf<SnackbarManager> p;
    private final wlf<g<PlayerState>> q;
    private final wlf<com.spotify.music.libs.viewartistscontextmenu.ui.c> r;
    private final wlf<i95> s;

    public ba5(wlf<CollectionStateProvider> wlf, wlf<s7a> wlf2, wlf<t8a> wlf3, wlf<uk9> wlf4, wlf<c> wlf5, wlf<ga5> wlf6, wlf<t> wlf7, wlf<d> wlf8, wlf<jzc> wlf9, wlf<y> wlf10, wlf<nsb> wlf11, wlf<jrd> wlf12, wlf<lac> wlf13, wlf<t9c> wlf14, wlf<v9c> wlf15, wlf<SnackbarManager> wlf16, wlf<g<PlayerState>> wlf17, wlf<com.spotify.music.libs.viewartistscontextmenu.ui.c> wlf18, wlf<i95> wlf19) {
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
        return new aa5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get(), this.s.get());
    }
}
