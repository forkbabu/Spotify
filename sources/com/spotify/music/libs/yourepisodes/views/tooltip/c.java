package com.spotify.music.libs.yourepisodes.views.tooltip;

import android.app.Activity;
import com.spotify.mobile.android.spotlets.tooltip.a;

public final class c implements fjf<b> {
    private final wlf<Activity> a;
    private final wlf<a> b;
    private final wlf<d> c;

    public c(wlf<Activity> wlf, wlf<a> wlf2, wlf<d> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get(), this.c.get());
    }
}
