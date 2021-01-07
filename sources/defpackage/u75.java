package defpackage;

import com.spotify.music.features.freetierartist.datasource.a0;
import com.spotify.music.libs.freetiertrackpreview.transformer.g;
import com.spotify.music.spotlets.radio.formatlist.d;
import io.reactivex.y;

/* renamed from: u75  reason: default package */
public final class u75 implements fjf<t75> {
    private final wlf<n85> a;
    private final wlf<d> b;
    private final wlf<a0> c;
    private final wlf<y> d;
    private final wlf<i65> e;
    private final wlf<uk9> f;
    private final wlf<m75> g;
    private final wlf<jzc> h;
    private final wlf<vka> i;
    private final wlf<mf3> j;
    private final wlf<g> k;

    public u75(wlf<n85> wlf, wlf<d> wlf2, wlf<a0> wlf3, wlf<y> wlf4, wlf<i65> wlf5, wlf<uk9> wlf6, wlf<m75> wlf7, wlf<jzc> wlf8, wlf<vka> wlf9, wlf<mf3> wlf10, wlf<g> wlf11) {
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
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t75(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}
