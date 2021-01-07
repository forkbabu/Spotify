package com.spotify.mobile.android.observablestates.docking;

import io.reactivex.s;

public final class g implements fjf<s<DockingStatus>> {
    private final wlf<h> a;

    public g(wlf<h> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<DockingStatus> a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
