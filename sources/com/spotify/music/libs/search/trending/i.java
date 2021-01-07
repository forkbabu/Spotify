package com.spotify.music.libs.search.trending;

public final class i implements fjf<h> {
    private final wlf<TrendingSearchConfig> a;

    public i(wlf<TrendingSearchConfig> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get());
    }
}
