package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.player.stateful.q;
import io.reactivex.g;

/* renamed from: cub  reason: default package */
public final class cub implements fjf<g<PlayerState>> {
    private final wlf<q> a;

    public cub(wlf<q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().c().C(vtb.a);
    }
}
