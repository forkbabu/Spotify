package com.spotify.nowplaying.core.di;

import com.spotify.player.model.PlayerState;
import com.spotify.player.stateful.q;
import io.reactivex.g;

public final class h implements fjf<g<PlayerState>> {
    private final wlf<q> a;

    public h(wlf<q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        q qVar = this.a.get();
        kotlin.jvm.internal.h.e(qVar, "statefulPlayerApisProvider");
        g<PlayerState> C = qVar.c().C(b.a);
        kotlin.jvm.internal.h.d(C, "statefulPlayerApisProvid… { it.track().isPresent }");
        return C;
    }
}
