package com.spotify.music.features.pushnotifications;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;
import io.reactivex.s;

public final class q0 implements fjf<o0> {
    private final wlf<s<String>> a;
    private final wlf<Context> b;
    private final wlf<i> c;
    private final wlf<g> d;

    public q0(wlf<s<String>> wlf, wlf<Context> wlf2, wlf<i> wlf3, wlf<g> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o0(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
