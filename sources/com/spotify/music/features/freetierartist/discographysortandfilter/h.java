package com.spotify.music.features.freetierartist.discographysortandfilter;

public final class h implements fjf<DiscographyFilterTransformer> {
    private final wlf<d> a;

    public h(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DiscographyFilterTransformer(this.a.get());
    }
}
