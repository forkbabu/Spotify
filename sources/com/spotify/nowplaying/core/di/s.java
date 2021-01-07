package com.spotify.nowplaying.core.di;

import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class s implements fjf<g<Boolean>> {
    private final wlf<g<PlayerState>> a;

    public s(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    public static g<Boolean> a(g<PlayerState> gVar) {
        h.e(gVar, "playerStateFlowable");
        g<R> l = gVar.l(PlayerStateTransformers.e());
        yif.g(l, "Cannot return null from a non-@Nullable @Provides method");
        return l;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
