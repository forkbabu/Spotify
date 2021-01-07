package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: uyb  reason: default package */
public final class uyb implements fjf<tyb> {
    private final wlf<g<PlayerState>> a;

    public uyb(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tyb(this.a);
    }
}
