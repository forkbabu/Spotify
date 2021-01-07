package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: eib  reason: default package */
public final class eib implements fjf<dib> {
    private final wlf<g<PlayerState>> a;
    private final wlf<y> b;
    private final wlf<q> c;

    public eib(wlf<g<PlayerState>> wlf, wlf<y> wlf2, wlf<q> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dib(this.a.get(), this.b.get(), this.c.get());
    }
}
