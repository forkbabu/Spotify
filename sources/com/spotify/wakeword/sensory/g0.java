package com.spotify.wakeword.sensory;

import com.google.protobuf.u;

public final class g0 implements fjf<f0> {
    private final wlf<gl0<u>> a;

    public g0(wlf<gl0<u>> wlf) {
        this.a = wlf;
    }

    public static f0 a(gl0<u> gl0) {
        return new f0(gl0);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f0(this.a.get());
    }
}
