package com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile;

import android.app.Activity;
import com.squareup.picasso.Picasso;

public final class c implements fjf<b> {
    private final wlf<Activity> a;
    private final wlf<Picasso> b;
    private final wlf<tq4> c;
    private final wlf<lqa> d;

    public c(wlf<Activity> wlf, wlf<Picasso> wlf2, wlf<tq4> wlf3, wlf<lqa> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a, this.b, this.c, this.d);
    }
}
