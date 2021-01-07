package com.spotify.music.features.connectui.picker.frictionlessjoin;

public final class l implements fjf<WebgateFrictionlessJoinManager> {
    private final wlf<sq4> a;
    private final wlf<f4d> b;

    public l(wlf<sq4> wlf, wlf<f4d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new WebgateFrictionlessJoinManager(this.a.get(), this.b.get());
    }
}
