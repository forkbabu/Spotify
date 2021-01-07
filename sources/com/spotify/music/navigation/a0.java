package com.spotify.music.navigation;

import android.content.Context;
import androidx.fragment.app.o;

public final class a0 implements fjf<SimpleNavigationManager> {
    private final wlf<Context> a;
    private final wlf<y> b;
    private final wlf<o> c;
    private final wlf<z> d;
    private final wlf<Integer> e;

    public a0(wlf<Context> wlf, wlf<y> wlf2, wlf<o> wlf3, wlf<z> wlf4, wlf<Integer> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SimpleNavigationManager(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().intValue());
    }
}
