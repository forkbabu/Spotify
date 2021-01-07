package com.spotify.music.features.connect.plugins;

import android.content.Context;
import com.spotify.libs.connect.ConnectManager;

public final class d implements fjf<c> {
    private final wlf<Context> a;
    private final wlf<ConnectManager> b;
    private final wlf<String> c;

    public d(wlf<Context> wlf, wlf<ConnectManager> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get());
    }
}
