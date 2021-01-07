package com.spotify.libs.connect.volume;

import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.providers.h;

public final class o implements fjf<PlaybackVolumeProviderImpl> {
    private final wlf<k> a;
    private final wlf<gv0> b;
    private final wlf<h> c;
    private final wlf<ConnectVolumeControlInstrumentation> d;
    private final wlf<Boolean> e;

    public o(wlf<k> wlf, wlf<gv0> wlf2, wlf<h> wlf3, wlf<ConnectVolumeControlInstrumentation> wlf4, wlf<Boolean> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PlaybackVolumeProviderImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().booleanValue());
    }
}
