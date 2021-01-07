package com.spotify.music.builtinauth.authenticator;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import io.reactivex.y;

public final class o0 implements fjf<n0> {
    private final wlf<y> a;
    private final wlf<g<SessionState>> b;

    public o0(wlf<y> wlf, wlf<g<SessionState>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n0(this.a.get(), this.b.get());
    }
}
