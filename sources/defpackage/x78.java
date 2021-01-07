package defpackage;

import com.spotify.music.libs.search.trending.TrendingSearchConfig;
import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

/* renamed from: x78  reason: default package */
public final class x78 implements fjf<TrendingSearchConfig> {
    private final wlf<AndroidFeatureSearchProperties> a;

    public x78(wlf<AndroidFeatureSearchProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        TrendingSearchConfig.Style style;
        TrendingSearchConfig.ClickBehaviour clickBehaviour;
        AndroidFeatureSearchProperties androidFeatureSearchProperties = this.a.get();
        boolean z = androidFeatureSearchProperties.i() != AndroidFeatureSearchProperties.TrendingSearchesExperience.OFF;
        if (androidFeatureSearchProperties.i() == AndroidFeatureSearchProperties.TrendingSearchesExperience.BLACK_PILLS) {
            style = TrendingSearchConfig.Style.BLACK;
        } else {
            style = TrendingSearchConfig.Style.WHITE;
        }
        if (androidFeatureSearchProperties.h() == AndroidFeatureSearchProperties.TrendingSearchesBehaviour.SEARCH) {
            clickBehaviour = TrendingSearchConfig.ClickBehaviour.SEARCH;
        } else {
            clickBehaviour = TrendingSearchConfig.ClickBehaviour.NAVIGATE;
        }
        return TrendingSearchConfig.b(z, style, clickBehaviour);
    }
}
