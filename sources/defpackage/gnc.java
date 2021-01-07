package defpackage;

import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: gnc  reason: default package */
public final class gnc implements fjf<g<String>> {
    private final wlf<g<PlayerState>> a;

    public gnc(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<PlayerState> gVar = this.a.get();
        h.e(gVar, "playerStateFlowable");
        g<R> l = gVar.l(PlayerStateTransformers.a());
        h.d(l, "playerStateFlowable.compose(contextUri())");
        return l;
    }
}
