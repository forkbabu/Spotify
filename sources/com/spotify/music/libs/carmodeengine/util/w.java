package com.spotify.music.libs.carmodeengine.util;

import android.app.Application;
import com.spotify.mobile.android.util.x;

public final class w implements fjf<Boolean> {
    private final wlf<Application> a;

    public w(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(x.g(this.a.get()));
    }
}
