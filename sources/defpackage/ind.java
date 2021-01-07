package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.w7;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ind  reason: default package */
public final class ind implements fjf<hnd> {
    private final wlf<g<PlayerState>> a;
    private final wlf<pl2> b;
    private final wlf<w7> c;
    private final wlf<dod> d;
    private final wlf<fnd> e;
    private final wlf<y> f;
    private final wlf<nl2> g;

    public ind(wlf<g<PlayerState>> wlf, wlf<pl2> wlf2, wlf<w7> wlf3, wlf<dod> wlf4, wlf<fnd> wlf5, wlf<y> wlf6, wlf<nl2> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static ind a(wlf<g<PlayerState>> wlf, wlf<pl2> wlf2, wlf<w7> wlf3, wlf<dod> wlf4, wlf<fnd> wlf5, wlf<y> wlf6, wlf<nl2> wlf7) {
        return new ind(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hnd(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
