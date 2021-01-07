package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: qq5  reason: default package */
public final class qq5 implements fjf<nq5> {
    private final wlf<g<PlayerState>> a;

    public qq5(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nq5(this.a.get());
    }
}
