package com.spotify.music.libs.search.trending;

import com.spotify.music.C0707R;
import com.spotify.music.libs.search.trending.TrendingSearchConfig;

public class h implements g {
    private final TrendingSearchConfig a;

    public h(TrendingSearchConfig trendingSearchConfig) {
        this.a = trendingSearchConfig;
    }

    @Override // com.spotify.music.libs.search.trending.g
    public int create() {
        return this.a.d() == TrendingSearchConfig.Style.WHITE ? C0707R.layout.pill_white_view : C0707R.layout.pill_black_view;
    }
}
