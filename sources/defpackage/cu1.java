package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: cu1  reason: default package */
public final class cu1 implements fjf<bu1> {
    private final wlf<y> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<dt1> c;
    private final wlf<fu1> d;

    public cu1(wlf<y> wlf, wlf<g<PlayerState>> wlf2, wlf<dt1> wlf3, wlf<fu1> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bu1(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
