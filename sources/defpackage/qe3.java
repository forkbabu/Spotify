package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: qe3  reason: default package */
public final class qe3 implements fjf<pe3> {
    private final wlf<g<PlayerState>> a;
    private final wlf<String> b;

    public qe3(wlf<g<PlayerState>> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pe3(this.a.get(), this.b.get());
    }
}
