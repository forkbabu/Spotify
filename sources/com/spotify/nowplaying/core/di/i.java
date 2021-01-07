package com.spotify.nowplaying.core.di;

import com.spotify.player.model.PlayerState;
import com.spotify.player.stateful.q;
import io.reactivex.g;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class i implements fjf<q> {
    private final wlf<bxd> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<y> c;
    private final wlf<cqe> d;

    public i(wlf<bxd> wlf, wlf<g<PlayerState>> wlf2, wlf<y> wlf3, wlf<cqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        bxd bxd = this.a.get();
        g<PlayerState> gVar = this.b.get();
        y yVar = this.c.get();
        cqe cqe = this.d.get();
        h.e(bxd, "playerApis");
        h.e(gVar, "playerStateFlowable");
        h.e(yVar, "scheduler");
        h.e(cqe, "clock");
        return new q(bxd, gVar, yVar, cqe);
    }
}
