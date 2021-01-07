package com.spotify.music.features.podcast.entity.di;

public final class h implements fjf<ngc> {
    private final wlf<Boolean> a;
    private final wlf<ogc> b;
    private final wlf<x67> c;

    public h(wlf<Boolean> wlf, wlf<ogc> wlf2, wlf<x67> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        ngc ngc;
        boolean booleanValue = this.a.get().booleanValue();
        ajf a2 = ejf.a(this.b);
        ajf a3 = ejf.a(this.c);
        if (booleanValue) {
            ngc = (ngc) a3.get();
        } else {
            ngc = (ngc) a2.get();
        }
        yif.g(ngc, "Cannot return null from a non-@Nullable @Provides method");
        return ngc;
    }
}
