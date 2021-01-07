package com.spotify.music.features.pushnotifications;

import androidx.core.app.q;
import com.spotify.music.notification.c;
import java.util.Random;

public final class l0 implements fjf<k0> {
    private final wlf<c> a;
    private final wlf<q> b;
    private final wlf<Random> c;

    public l0(wlf<c> wlf, wlf<q> wlf2, wlf<Random> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k0(this.a.get(), this.b.get(), this.c.get());
    }
}
