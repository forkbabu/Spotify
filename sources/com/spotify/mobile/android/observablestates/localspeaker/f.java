package com.spotify.mobile.android.observablestates.localspeaker;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import io.reactivex.s;
import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<s<na1>> a;
    private final wlf<s<HeadsetPluggedStatus>> b;
    private final wlf<y> c;

    public f(wlf<s<na1>> wlf, wlf<s<HeadsetPluggedStatus>> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get());
    }
}
