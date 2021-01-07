package com.spotify.music.offlinetrials.limited.uicomponents;

import android.content.Context;
import com.spotify.music.offlinetrials.limited.logging.a;
import com.spotify.music.offlinetrials.limited.logging.c;

public final class v implements fjf<u> {
    private final wlf<Context> a;
    private final wlf<a> b;
    private final wlf<c> c;

    public v(wlf<Context> wlf, wlf<a> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(this.a.get(), this.b.get(), this.c.get());
    }
}
