package com.spotify.music.features.profile.editprofile.utils;

import android.app.Activity;

public final class b implements fjf<a> {
    private final wlf<Activity> a;
    private final wlf<String> b;

    public b(wlf<Activity> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
