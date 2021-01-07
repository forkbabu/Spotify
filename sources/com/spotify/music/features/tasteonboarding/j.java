package com.spotify.music.features.tasteonboarding;

import android.content.Context;
import androidx.fragment.app.o;

public final class j implements fjf<i> {
    private final wlf<o> a;
    private final wlf<Integer> b;
    private final wlf<Context> c;

    public j(wlf<o> wlf, wlf<Integer> wlf2, wlf<Context> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get().intValue(), this.c.get());
    }
}
