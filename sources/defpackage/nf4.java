package defpackage;

import com.spotify.music.connection.l;
import io.reactivex.functions.c;
import io.reactivex.s;

/* renamed from: nf4  reason: default package */
public final class nf4 implements fjf<gf4> {
    private final wlf<l> a;
    private final wlf<s<we4>> b;
    private final wlf<qf4> c;
    private final wlf<of4> d;
    private final wlf<ue4> e;
    private final wlf<h1e<b91>> f;
    private final wlf<c<b91, b91, b91>> g;
    private final wlf<b91> h;

    public nf4(wlf<l> wlf, wlf<s<we4>> wlf2, wlf<qf4> wlf3, wlf<of4> wlf4, wlf<ue4> wlf5, wlf<h1e<b91>> wlf6, wlf<c<b91, b91, b91>> wlf7, wlf<b91> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gf4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
