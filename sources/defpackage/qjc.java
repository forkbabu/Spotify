package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: qjc  reason: default package */
public final class qjc implements fjf<pjc> {
    private final wlf<g<PlayerState>> a;

    public qjc(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pjc(this.a.get());
    }
}
