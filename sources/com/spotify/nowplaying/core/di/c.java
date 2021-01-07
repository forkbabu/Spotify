package com.spotify.nowplaying.core.di;

import com.spotify.player.model.PlayerState;
import io.reactivex.a;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.r;
import kotlin.jvm.internal.h;

public final class c implements fjf<a> {
    private final wlf<g<PlayerState>> a;

    public c(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<PlayerState> gVar = this.a.get();
        h.e(gVar, "playerStateFlowable");
        return new r(gVar.C(a.a).h0(1));
    }
}
