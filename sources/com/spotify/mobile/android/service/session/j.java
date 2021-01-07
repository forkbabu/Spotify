package com.spotify.mobile.android.service.session;

import io.reactivex.g;

public final class j implements fjf<g<SessionState>> {
    private final wlf<yn1> a;

    public j(wlf<yn1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<SessionState> a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
