package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: qia  reason: default package */
public final class qia implements fjf<pia> {
    private final wlf<rha> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<y> c;
    private final wlf<ria> d;

    public qia(wlf<rha> wlf, wlf<g<PlayerState>> wlf2, wlf<y> wlf3, wlf<ria> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pia(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
