package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: p3c  reason: default package */
public final class p3c implements fjf<o3c> {
    private final wlf<g<PlayerState>> a;

    public p3c(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o3c(this.a);
    }
}
