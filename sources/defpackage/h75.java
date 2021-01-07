package defpackage;

import com.spotify.music.features.freetierartist.discographysortandfilter.DiscographyFilterTransformer;
import com.spotify.music.features.freetierartist.discographysortandfilter.sort.SortCriteriaTransformer;
import com.spotify.remoteconfig.t5;

/* renamed from: h75  reason: default package */
public final class h75 implements fjf<g75> {
    private final wlf<rf3> a;
    private final wlf<e75> b;
    private final wlf<h81> c;
    private final wlf<Boolean> d;
    private final wlf<DiscographyFilterTransformer> e;
    private final wlf<SortCriteriaTransformer> f;
    private final wlf<t5> g;

    public h75(wlf<rf3> wlf, wlf<e75> wlf2, wlf<h81> wlf3, wlf<Boolean> wlf4, wlf<DiscographyFilterTransformer> wlf5, wlf<SortCriteriaTransformer> wlf6, wlf<t5> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g75(this.a.get(), this.b.get(), this.c, this.d.get().booleanValue(), this.e.get(), this.f.get(), this.g.get());
    }
}
