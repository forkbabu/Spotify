package com.spotify.music;

import android.app.Activity;

public final class t0 implements fjf<s0> {
    private final wlf<Activity> a;

    public t0(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s0(this.a.get());
    }
}
