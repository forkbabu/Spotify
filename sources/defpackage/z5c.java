package defpackage;

import com.google.common.base.Optional;
import com.spotify.nowplaying.ui.components.overlay.j;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: z5c  reason: default package */
public final class z5c implements fjf<g<j>> {
    private final wlf<g<Boolean>> a;
    private final wlf<g<Boolean>> b;
    private final wlf<g<Optional<Long>>> c;
    private final wlf<g<Boolean>> d;
    private final wlf<y> e;

    public z5c(wlf<g<Boolean>> wlf, wlf<g<Boolean>> wlf2, wlf<g<Optional<Long>>> wlf3, wlf<g<Boolean>> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return g.k(this.a.get(), this.b.get(), this.c.get().b0(Optional.of(0L)), this.d.get(), t5c.a).Q(this.e.get()).s();
    }
}
