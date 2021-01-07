package defpackage;

import com.spotify.music.libs.search.trending.TrendingSearchConfig;

/* renamed from: ou8  reason: default package */
public final class ou8 implements fjf<nu8> {
    private final wlf<TrendingSearchConfig> a;

    public ou8(wlf<TrendingSearchConfig> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nu8(this.a.get());
    }
}
