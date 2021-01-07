package com.spotify.music.libs.assistedcuration.presenter;

import android.app.Activity;
import com.spotify.music.libs.viewuri.c;

public final class r implements fjf<q> {
    private final wlf<Activity> a;
    private final wlf<c> b;

    public r(wlf<Activity> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get(), this.b.get());
    }
}
