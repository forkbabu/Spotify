package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: y2c  reason: default package */
public final class y2c implements fjf<x2c> {
    private final wlf<g<PlayerState>> a;

    public y2c(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x2c(this.a);
    }
}
