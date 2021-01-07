package com.spotify.music.libs.fullscreen.story.promo;

import android.app.Activity;

public final class j implements fjf<i> {
    private final wlf<Activity> a;

    public j(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get());
    }
}
