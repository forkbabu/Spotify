package defpackage;

import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: inc  reason: default package */
public final class inc implements fjf<g<Boolean>> {
    private final wlf<g<PlayerState>> a;

    public inc(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<PlayerState> gVar = this.a.get();
        h.e(gVar, "playerStateFlowable");
        g<R> l = gVar.l(PlayerStateTransformers.e());
        h.d(l, "playerStateFlowable.compose(isResumed())");
        return l;
    }
}
