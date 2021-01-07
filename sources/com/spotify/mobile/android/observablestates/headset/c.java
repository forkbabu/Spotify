package com.spotify.mobile.android.observablestates.headset;

import io.reactivex.s;

public final class c implements fjf<s<HeadsetPluggedStatus>> {
    private final wlf<e> a;

    public c(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<HeadsetPluggedStatus> a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
