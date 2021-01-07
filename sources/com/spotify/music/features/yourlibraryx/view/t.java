package com.spotify.music.features.yourlibraryx.view;

import android.app.Activity;

public final class t implements fjf<s> {
    private final wlf<Activity> a;
    private final wlf<String> b;
    private final wlf<String> c;
    private final wlf<b> d;
    private final wlf<wbb> e;

    public t(wlf<Activity> wlf, wlf<String> wlf2, wlf<String> wlf3, wlf<b> wlf4, wlf<wbb> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
