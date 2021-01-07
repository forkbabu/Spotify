package com.spotify.libs.connect.volume.controllers;

import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.volume.c;
import com.spotify.libs.connect.volume.l;

public final class h implements fjf<ConnectVolumeController> {
    private final wlf<l> a;
    private final wlf<c> b;
    private final wlf<com.spotify.libs.connect.providers.h> c;
    private final wlf<ConnectVolumeControlInstrumentation> d;

    public h(wlf<l> wlf, wlf<c> wlf2, wlf<com.spotify.libs.connect.providers.h> wlf3, wlf<ConnectVolumeControlInstrumentation> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ConnectVolumeController(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
