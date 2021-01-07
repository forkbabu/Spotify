package com.spotify.music.features.freetierartist.discographysortandfilter.sort;

public final class e implements fjf<SortCriteriaTransformer> {
    private final wlf<b> a;

    public e(wlf<b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SortCriteriaTransformer(this.a.get());
    }
}
