package defpackage;

import com.spotify.music.connection.l;
import com.spotify.music.libs.search.trending.TrendingSearchConfig;

/* renamed from: uu8  reason: default package */
public final class uu8 implements fjf<tu8> {
    private final wlf<l> a;
    private final wlf<TrendingSearchConfig> b;
    private final wlf<bu8> c;

    public uu8(wlf<l> wlf, wlf<TrendingSearchConfig> wlf2, wlf<bu8> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tu8(this.a.get(), this.b.get(), this.c.get());
    }
}
