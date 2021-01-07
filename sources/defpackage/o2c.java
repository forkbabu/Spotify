package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: o2c  reason: default package */
public final class o2c implements fjf<n2c> {
    private final wlf<g<PlayerState>> a;

    public o2c(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n2c(this.a);
    }
}
