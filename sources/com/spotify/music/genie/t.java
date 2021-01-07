package com.spotify.music.genie;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;

public final class t implements fjf<s> {
    private final wlf<g<SessionState>> a;

    public t(wlf<g<SessionState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get());
    }
}
