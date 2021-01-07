package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: lwb  reason: default package */
public final class lwb implements fjf<kwb> {
    private final wlf<g<PlayerState>> a;

    public lwb(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kwb(this.a);
    }
}
