package defpackage;

import com.spotify.http.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import io.reactivex.y;

/* renamed from: eab  reason: default package */
public final class eab implements fjf<dab> {
    private final wlf<u> a;
    private final wlf<y> b;
    private final wlf<nsb> c;
    private final wlf<PlayerFactory> d;
    private final wlf<fab> e;

    public eab(wlf<u> wlf, wlf<y> wlf2, wlf<nsb> wlf3, wlf<PlayerFactory> wlf4, wlf<fab> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dab(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
