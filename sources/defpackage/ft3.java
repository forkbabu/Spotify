package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: ft3  reason: default package */
public final class ft3 implements fjf<g<PlayerState>> {
    private final wlf<g<PlayerState>> a;

    public ft3(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().C(ct3.a);
    }
}
