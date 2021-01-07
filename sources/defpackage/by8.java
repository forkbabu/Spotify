package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: by8  reason: default package */
public final class by8 implements fjf<ay8> {
    private final wlf<g<PlayerState>> a;
    private final wlf<y> b;
    private final wlf<pea> c;

    public by8(wlf<g<PlayerState>> wlf, wlf<y> wlf2, wlf<pea> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ay8(this.a, this.b, this.c);
    }
}
