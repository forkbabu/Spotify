package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;

/* renamed from: i6c  reason: default package */
public final class i6c {
    private final xr3 a;
    private final g<ContextTrack> b;

    public i6c(xr3 xr3, g<ContextTrack> gVar) {
        this.a = xr3;
        this.b = gVar;
    }

    public g<Boolean> a() {
        return g.P(this.a.a().Y0(BackpressureStrategy.LATEST).C(e6c.a).O(h6c.a), this.b.C(f6c.a).O(g6c.a));
    }
}
