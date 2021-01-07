package com.spotify.music.features.partneraccountlinking.dialog;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;

public final class q implements fjf<p> {
    private final wlf<i> a;
    private final wlf<Context> b;

    public q(wlf<i> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get());
    }
}
