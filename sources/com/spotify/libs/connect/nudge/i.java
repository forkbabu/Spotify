package com.spotify.libs.connect.nudge;

import com.spotify.libs.connect.instrumentation.a;
import com.spotify.libs.connect.providers.h;
import com.spotify.libs.connect.providers.m;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class i implements fjf<DefaultConnectNudgeEngine> {
    private final wlf<h> a;
    private final wlf<a> b;
    private final wlf<m> c;
    private final wlf<a> d;
    private final wlf<g<PlayerState>> e;
    private final wlf<Boolean> f;

    public i(wlf<h> wlf, wlf<a> wlf2, wlf<m> wlf3, wlf<a> wlf4, wlf<g<PlayerState>> wlf5, wlf<Boolean> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DefaultConnectNudgeEngine(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get().booleanValue());
    }
}
