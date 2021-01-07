package com.spotify.music.features.assistedcuration;

import android.app.Activity;
import com.spotify.music.navigation.b;

public final class d implements fjf<c> {
    private final wlf<Activity> a;
    private final wlf<b> b;

    public d(wlf<Activity> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get());
    }
}
