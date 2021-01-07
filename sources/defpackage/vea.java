package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: vea  reason: default package */
public final class vea implements fjf<uea> {
    private final wlf<g<PlayerState>> a;

    public vea(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uea(this.a.get());
    }
}
