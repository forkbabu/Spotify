package com.spotify.music.features.addtoplaylist;

import android.content.Context;
import com.spotify.music.navigation.b;

public final class f implements fjf<e> {
    private final wlf<Context> a;
    private final wlf<b> b;

    public f(wlf<Context> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get());
    }
}
