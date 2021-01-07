package com.spotify.music.features.yourlibrary.container.utils;

import androidx.lifecycle.n;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import io.reactivex.y;

public final class k implements fjf<j> {
    private final wlf<n> a;
    private final wlf<g<SessionState>> b;
    private final wlf<bqa> c;
    private final wlf<lqa> d;
    private final wlf<y> e;
    private final wlf<y> f;

    public k(wlf<n> wlf, wlf<g<SessionState>> wlf2, wlf<bqa> wlf3, wlf<lqa> wlf4, wlf<y> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
