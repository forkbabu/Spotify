package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: vxb  reason: default package */
public final class vxb implements fjf<uxb> {
    private final wlf<g<PlayerState>> a;

    public vxb(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uxb(this.a);
    }
}
