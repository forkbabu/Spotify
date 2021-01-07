package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: dxb  reason: default package */
public final class dxb implements fjf<cxb> {
    private final wlf<g<PlayerState>> a;

    public dxb(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cxb(this.a);
    }
}
