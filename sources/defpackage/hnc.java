package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: hnc  reason: default package */
public final class hnc implements fjf<g<Optional<String>>> {
    private final wlf<g<PlayerState>> a;

    public hnc(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<PlayerState> gVar = this.a.get();
        h.e(gVar, "playerStateFlowable");
        g<R> l = gVar.l(wnc.a());
        h.d(l, "playerStateFlowable.comp…currentEpisodeTrackUri())");
        return l;
    }
}
