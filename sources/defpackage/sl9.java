package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: sl9  reason: default package */
public final class sl9 implements fjf<rl9> {
    private final wlf<g<PlayerState>> a;
    private final wlf<vxd> b;

    public sl9(wlf<g<PlayerState>> wlf, wlf<vxd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rl9(this.a.get(), this.b.get());
    }
}
