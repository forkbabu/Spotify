package com.spotify.nowplaying.core.di;

import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class r implements fjf<g<ContextTrack>> {
    private final wlf<g<PlayerState>> a;

    public r(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    public static g<ContextTrack> a(g<PlayerState> gVar) {
        h.e(gVar, "playerStateFlowable");
        g<R> O = gVar.l(PlayerStateTransformers.b()).O(j.a);
        h.d(O, "playerStateFlowable.comp…Track()).map { it.get() }");
        return O;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
