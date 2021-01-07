package com.spotify.music.features.yourlibraryx.search.view;

import android.app.Activity;

public final class b implements fjf<a> {
    private final wlf<Activity> a;

    public b(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
