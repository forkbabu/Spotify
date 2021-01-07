package com.spotify.nowplaying.core.di;

import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class u implements fjf<g<Long>> {
    private final wlf<g<PlayerState>> a;

    public u(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    public static g<Long> a(g<PlayerState> gVar) {
        h.e(gVar, "playerStateFlowable");
        g<R> O = gVar.l(PlayerStateTransformers.d()).C(k.a).O(l.a);
        h.d(O, "playerStateFlowable\n    …        .map { it.get() }");
        return O;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
