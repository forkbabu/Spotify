package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: we3  reason: default package */
public final class we3 implements fjf<ve3> {
    private final wlf<g<PlayerState>> a;
    private final wlf<y> b;

    public we3(wlf<g<PlayerState>> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ve3(this.a.get(), this.b.get());
    }
}
