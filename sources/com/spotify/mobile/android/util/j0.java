package com.spotify.mobile.android.util;

import android.content.Context;
import com.google.protobuf.u;
import com.spotify.remoteconfig.ck;

public final class j0 implements fjf<SensorRecorder> {
    private final wlf<Context> a;
    private final wlf<ck> b;
    private final wlf<gl0<u>> c;

    public j0(wlf<Context> wlf, wlf<ck> wlf2, wlf<gl0<u>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SensorRecorder(this.a.get(), this.b.get(), this.c.get());
    }
}
