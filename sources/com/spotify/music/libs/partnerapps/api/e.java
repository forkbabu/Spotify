package com.spotify.music.libs.partnerapps.api;

public final class e implements fjf<d> {
    private final wlf<f> a;
    private final wlf<fla> b;

    public e(wlf<f> wlf, wlf<fla> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get());
    }
}
