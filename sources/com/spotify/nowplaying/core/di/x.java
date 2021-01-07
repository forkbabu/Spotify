package com.spotify.nowplaying.core.di;

import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class x implements fjf<g<String>> {
    private final wlf<g<PlayerState>> a;

    public x(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    public static g<String> a(g<PlayerState> gVar) {
        h.e(gVar, "playerStateFlowable");
        g<R> O = gVar.l(PlayerStateTransformers.c()).O(p.a);
        h.d(O, "playerStateFlowable.comp…ckUri()).map { it.get() }");
        return O;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
