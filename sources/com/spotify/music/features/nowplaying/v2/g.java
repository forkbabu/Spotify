package com.spotify.music.features.nowplaying.v2;

import android.app.Activity;
import com.spotify.instrumentation.navigation.logger.m;

public final class g implements fjf<f> {
    private final wlf<Activity> a;
    private final wlf<m> b;
    private final wlf<String> c;

    public g(wlf<Activity> wlf, wlf<m> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get());
    }
}
