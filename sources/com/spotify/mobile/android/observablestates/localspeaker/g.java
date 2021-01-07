package com.spotify.mobile.android.observablestates.localspeaker;

import io.reactivex.s;

public final class g implements fjf<s<LocalSpeakerStatus>> {
    private final wlf<e> a;

    public g(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<LocalSpeakerStatus> a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
