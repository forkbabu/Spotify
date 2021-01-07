package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: yx8  reason: default package */
public final class yx8 implements fjf<xx8> {
    private final wlf<g<PlayerState>> a;

    public yx8(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xx8(this.a);
    }
}
