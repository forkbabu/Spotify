package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: ssb  reason: default package */
public final class ssb implements fjf<rsb> {
    private final wlf<g<PlayerState>> a;

    public ssb(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rsb(this.a);
    }
}
