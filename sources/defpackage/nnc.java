package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: nnc  reason: default package */
public final class nnc implements fjf<lnc> {
    private final wlf<g<PlayerState>> a;
    private final wlf<g<Boolean>> b;

    public nnc(wlf<g<PlayerState>> wlf, wlf<g<Boolean>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lnc(this.a.get(), this.b.get());
    }
}
