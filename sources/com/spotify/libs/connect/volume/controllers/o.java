package com.spotify.libs.connect.volume.controllers;

import android.content.Context;
import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;

public final class o implements fjf<n> {
    private final wlf<Context> a;
    private final wlf<ConnectVolumeControlInstrumentation> b;

    public o(wlf<Context> wlf, wlf<ConnectVolumeControlInstrumentation> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), this.b.get());
    }
}
