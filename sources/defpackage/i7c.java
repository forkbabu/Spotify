package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: i7c  reason: default package */
public final class i7c implements fjf<h7c> {
    private final wlf<g<PlayerState>> a;
    private final wlf<cqe> b;

    public i7c(wlf<g<PlayerState>> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h7c(this.a.get(), this.b.get());
    }
}
