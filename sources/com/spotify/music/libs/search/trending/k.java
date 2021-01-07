package com.spotify.music.libs.search.trending;

public final class k implements fjf<j> {
    private final wlf<TrendingSearchLogger> a;
    private final wlf<Boolean> b;

    public k(wlf<TrendingSearchLogger> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get().booleanValue());
    }
}
