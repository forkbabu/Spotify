package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.player.stateful.q;
import io.reactivex.g;

/* renamed from: c8c  reason: default package */
public final class c8c implements fjf<g<PlayerState>> {
    private final wlf<q> a;

    public c8c(wlf<q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().c().C(a8c.a);
    }
}
