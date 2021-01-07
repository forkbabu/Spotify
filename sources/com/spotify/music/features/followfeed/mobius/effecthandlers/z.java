package com.spotify.music.features.followfeed.mobius.effecthandlers;

import android.content.Context;
import androidx.fragment.app.o;

public final class z implements fjf<y> {
    private final wlf<Context> a;
    private final wlf<o> b;
    private final wlf<com.spotify.music.navigation.o> c;

    public z(wlf<Context> wlf, wlf<o> wlf2, wlf<com.spotify.music.navigation.o> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y(this.a.get(), this.b.get(), this.c.get());
    }
}
