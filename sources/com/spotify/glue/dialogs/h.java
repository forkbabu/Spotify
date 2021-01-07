package com.spotify.glue.dialogs;

import android.app.Activity;

public final class h implements fjf<g> {
    private final wlf<Activity> a;

    public h(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get());
    }
}
