package com.spotify.music.premiummini.ui;

import android.app.Activity;
import com.spotify.glue.dialogs.g;
import com.spotify.ubi.specification.factories.d3;

public final class c implements fjf<PremiumMiniDialogsImpl> {
    private final wlf<Activity> a;
    private final wlf<g> b;
    private final wlf<ere> c;
    private final wlf<d3> d;

    public c(wlf<Activity> wlf, wlf<g> wlf2, wlf<ere> wlf3, wlf<d3> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PremiumMiniDialogsImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
