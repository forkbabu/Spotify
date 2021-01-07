package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.player.sub.l;
import com.spotify.remoteconfig.kc;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.b0;

/* renamed from: sec  reason: default package */
public final class sec implements fjf<g<PlayerState>> {
    private final wlf<l> a;
    private final wlf<kc> b;

    public sec(wlf<l> wlf, wlf<kc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<PlayerState> gVar;
        l lVar = this.a.get();
        if (this.b.get().a()) {
            gVar = new b0<>(lVar.d(), "PlayerSubscriptions");
        } else {
            gVar = lVar.d();
        }
        yif.g(gVar, "Cannot return null from a non-@Nullable @Provides method");
        return gVar;
    }
}
