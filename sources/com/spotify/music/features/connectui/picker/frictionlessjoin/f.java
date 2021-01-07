package com.spotify.music.features.connectui.picker.frictionlessjoin;

import kotlin.jvm.internal.h;

public final class f implements fjf<wt4> {
    private final wlf<hs0> a;
    private final wlf<ut4> b;
    private final wlf<FrictionlessJoinManager> c;
    private final wlf<j> d;

    public f(wlf<hs0> wlf, wlf<ut4> wlf2, wlf<FrictionlessJoinManager> wlf3, wlf<j> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        hs0 hs0 = this.a.get();
        ut4 ut4 = this.b.get();
        FrictionlessJoinManager frictionlessJoinManager = this.c.get();
        j jVar = this.d.get();
        h.e(hs0, "frictionlessJoinFlagProvider");
        h.e(ut4, "defaultDevicesProvider");
        h.e(frictionlessJoinManager, "frictionlessJoinManager");
        h.e(jVar, "pollingObservableProvider");
        return hs0.a() ? new a(ut4, frictionlessJoinManager, jVar) : ut4;
    }
}
