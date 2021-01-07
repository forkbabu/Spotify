package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.player.model.PlayOrigin;
import com.spotify.playlist.endpoints.d;
import io.reactivex.y;

/* renamed from: ejc  reason: default package */
public final class ejc implements fjf<djc> {
    private final wlf<hjc> a;
    private final wlf<d> b;
    private final wlf<ijc> c;
    private final wlf<Player> d;
    private final wlf<PlayOrigin> e;
    private final wlf<y> f;

    public ejc(wlf<hjc> wlf, wlf<d> wlf2, wlf<ijc> wlf3, wlf<Player> wlf4, wlf<PlayOrigin> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new djc(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
