package com.spotify.music;

import android.app.Activity;

public final class k0 implements fjf<j0> {
    private final wlf<Activity> a;

    public k0(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j0(this.a.get());
    }
}
