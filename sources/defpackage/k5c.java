package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: k5c  reason: default package */
public final class k5c implements fjf<j5c> {
    private final wlf<g<PlayerState>> a;

    public k5c(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j5c(this.a);
    }
}
