package com.spotify.music.features.profile.entity;

import android.app.Activity;
import com.spotify.music.navigation.t;

public final class w implements fjf<v> {
    private final wlf<Activity> a;
    private final wlf<t> b;

    public w(wlf<Activity> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get(), this.b.get());
    }
}
