package com.spotify.mobile.android.ui.activity;

import android.app.Activity;

public final class d implements fjf<c> {
    private final wlf<Activity> a;

    public d(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}
