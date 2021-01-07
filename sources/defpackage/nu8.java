package defpackage;

import com.spotify.music.libs.search.trending.TrendingSearchConfig;

/* renamed from: nu8  reason: default package */
public class nu8 implements mu8 {
    private final TrendingSearchConfig a;

    public nu8(TrendingSearchConfig trendingSearchConfig) {
        this.a = trendingSearchConfig;
    }

    @Override // defpackage.mu8
    public o81 a(s81 s81, int i) {
        a91 target = s81.target();
        target.getClass();
        if (this.a.a() == TrendingSearchConfig.ClickBehaviour.SEARCH) {
            return z81.b().e("trendingSearchEvent").b("trendingSearchQuery", s81.text().title()).b("trendingSearchItemIndex", Integer.valueOf(i)).c();
        }
        return d71.a(target.uri());
    }
}
