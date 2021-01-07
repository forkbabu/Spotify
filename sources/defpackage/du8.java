package defpackage;

import com.spotify.music.libs.search.trending.TrendingSearchConfig;
import io.reactivex.functions.l;
import io.reactivex.y;

/* renamed from: du8  reason: default package */
public final class du8 implements fjf<cu8> {
    private final wlf<eu8> a;
    private final wlf<String> b;
    private final wlf<l<b91, b91>> c;
    private final wlf<l<b91, b91>> d;
    private final wlf<yt8> e;
    private final wlf<y> f;
    private final wlf<TrendingSearchConfig> g;

    public du8(wlf<eu8> wlf, wlf<String> wlf2, wlf<l<b91, b91>> wlf3, wlf<l<b91, b91>> wlf4, wlf<yt8> wlf5, wlf<y> wlf6, wlf<TrendingSearchConfig> wlf7) {
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
        return new cu8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
