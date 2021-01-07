package defpackage;

import com.spotify.libs.connect.instrumentation.e;
import com.spotify.libs.connect.providers.h;
import com.spotify.libs.connect.u;
import com.spotify.music.features.connectui.picker.frictionlessjoin.FrictionlessJoinManager;
import com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b;
import com.spotify.music.spotlets.offline.util.c;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: vs4  reason: default package */
public final class vs4 implements fjf<us4> {
    private final wlf<ws4> a;
    private final wlf<ss4> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<sr4> d;
    private final wlf<oba> e;
    private final wlf<ft4> f;
    private final wlf<mba> g;
    private final wlf<cfd> h;
    private final wlf<y> i;
    private final wlf<e> j;
    private final wlf<wt4> k;
    private final wlf<com.spotify.music.features.connectui.picker.ui.e> l;
    private final wlf<c> m;
    private final wlf<yu0> n;
    private final wlf<u> o;
    private final wlf<hs0> p;
    private final wlf<FrictionlessJoinManager> q;
    private final wlf<b> r;
    private final wlf<h> s;

    public vs4(wlf<ws4> wlf, wlf<ss4> wlf2, wlf<g<PlayerState>> wlf3, wlf<sr4> wlf4, wlf<oba> wlf5, wlf<ft4> wlf6, wlf<mba> wlf7, wlf<cfd> wlf8, wlf<y> wlf9, wlf<e> wlf10, wlf<wt4> wlf11, wlf<com.spotify.music.features.connectui.picker.ui.e> wlf12, wlf<c> wlf13, wlf<yu0> wlf14, wlf<u> wlf15, wlf<hs0> wlf16, wlf<FrictionlessJoinManager> wlf17, wlf<b> wlf18, wlf<h> wlf19) {
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
        return new us4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get(), this.s.get());
    }
}
