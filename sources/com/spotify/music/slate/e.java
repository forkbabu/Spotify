package com.spotify.music.slate;

import android.app.Activity;

public final class e implements fjf<Runnable> {
    private final wlf<Activity> a;

    public e(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
