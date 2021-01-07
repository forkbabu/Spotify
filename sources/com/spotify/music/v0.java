package com.spotify.music;

import android.app.Activity;
import com.spotify.instrumentation.navigation.logger.m;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.o;

public final class v0 implements fjf<u0> {
    private final wlf<Activity> a;
    private final wlf<b> b;
    private final wlf<o> c;
    private final wlf<m> d;
    private final wlf<String> e;

    public v0(wlf<Activity> wlf, wlf<b> wlf2, wlf<o> wlf3, wlf<m> wlf4, wlf<String> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static v0 a(wlf<Activity> wlf, wlf<b> wlf2, wlf<o> wlf3, wlf<m> wlf4, wlf<String> wlf5) {
        return new v0(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
