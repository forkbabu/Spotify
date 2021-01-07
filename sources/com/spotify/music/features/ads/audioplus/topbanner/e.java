package com.spotify.music.features.ads.audioplus.topbanner;

public final class e implements fjf<d> {
    private final wlf<vp3> a;
    private final wlf<bq3> b;
    private final wlf<ws3> c;
    private final wlf<com.spotify.ads.uicomponents.secondaryintent.e> d;

    public e(wlf<vp3> wlf, wlf<bq3> wlf2, wlf<ws3> wlf3, wlf<com.spotify.ads.uicomponents.secondaryintent.e> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a, this.b, this.c, this.d);
    }
}
