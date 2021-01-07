package com.spotify.music.spotlets.radio.formatlist;

import android.app.Activity;

public final class e implements fjf<d> {
    private final wlf<Activity> a;

    public e(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
