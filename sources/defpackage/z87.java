package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: z87  reason: default package */
public final class z87 implements fjf<g<Long>> {
    private final wlf<g<PlayerState>> a;
    private final wlf<y> b;
    private final wlf<cqe> c;

    public z87(wlf<g<PlayerState>> wlf, wlf<y> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return g.i(this.a.get(), g.M(200, 200, TimeUnit.MILLISECONDS, this.b.get()), n87.a).O(new m87(this.c.get()));
    }
}
