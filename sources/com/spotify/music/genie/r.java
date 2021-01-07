package com.spotify.music.genie;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.player.model.PlayerState;
import defpackage.mn9;
import defpackage.vm9;
import io.reactivex.g;
import io.reactivex.y;

public final class r implements fjf<p> {
    private final wlf<vm9.b> a;
    private final wlf<mn9.b> b;
    private final wlf<y> c;
    private final wlf<y> d;
    private final wlf<g<SessionState>> e;
    private final wlf<g<PlayerState>> f;
    private final wlf<s> g;

    public r(wlf<vm9.b> wlf, wlf<mn9.b> wlf2, wlf<y> wlf3, wlf<y> wlf4, wlf<g<SessionState>> wlf5, wlf<g<PlayerState>> wlf6, wlf<s> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static r a(wlf<vm9.b> wlf, wlf<mn9.b> wlf2, wlf<y> wlf3, wlf<y> wlf4, wlf<g<SessionState>> wlf5, wlf<g<PlayerState>> wlf6, wlf<s> wlf7) {
        return new r(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
