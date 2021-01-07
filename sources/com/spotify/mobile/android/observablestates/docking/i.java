package com.spotify.mobile.android.observablestates.docking;

import com.spotify.mobile.android.observablestates.localspeaker.LocalSpeakerStatus;
import com.spotify.music.libs.carmodeengine.util.j0;
import io.reactivex.s;
import io.reactivex.y;

public final class i implements fjf<h> {
    private final wlf<y> a;
    private final wlf<j0> b;
    private final wlf<e> c;
    private final wlf<s<LocalSpeakerStatus>> d;
    private final wlf<Boolean> e;

    public i(wlf<y> wlf, wlf<j0> wlf2, wlf<e> wlf3, wlf<s<LocalSpeakerStatus>> wlf4, wlf<Boolean> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().booleanValue());
    }
}
