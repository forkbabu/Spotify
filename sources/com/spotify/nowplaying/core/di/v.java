package com.spotify.nowplaying.core.di;

import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class v implements fjf<g<Long>> {
    private final wlf<g<PlayerState>> a;
    private final wlf<Long> b;
    private final wlf<y> c;
    private final wlf<cqe> d;

    public v(wlf<g<PlayerState>> wlf, wlf<Long> wlf2, wlf<y> wlf3, wlf<cqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static g<Long> a(g<PlayerState> gVar, long j, y yVar, cqe cqe) {
        h.e(gVar, "playerStateFlowable");
        h.e(yVar, "mainScheduler");
        h.e(cqe, "clock");
        g<R> O = gVar.l(PlayerStateTransformers.f(j, yVar, cqe)).C(m.a).O(n.a);
        h.d(O, "playerStateFlowable\n    …        .map { it.get() }");
        return O;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get().longValue(), this.c.get(), this.d.get());
    }
}
