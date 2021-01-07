package com.spotify.music.features.churnlockedstate;

import com.google.protobuf.u;

public final class x implements fjf<w> {
    private final wlf<gl0<u>> a;

    public x(wlf<gl0<u>> wlf) {
        this.a = wlf;
    }

    public static w a(gl0<u> gl0) {
        return new w(gl0);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get());
    }
}
