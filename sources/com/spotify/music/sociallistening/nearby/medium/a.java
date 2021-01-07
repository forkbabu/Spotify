package com.spotify.music.sociallistening.nearby.medium;

import android.content.Context;

public final class a implements fjf<NearbyMediumWifi> {
    private final wlf<Context> a;

    public a(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new NearbyMediumWifi(this.a.get());
    }
}
