package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.player.stateful.q;
import io.reactivex.g;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: ey7  reason: default package */
public final class ey7 implements fjf<q> {
    private final yx7 a;
    private final wlf<g<PlayerState>> b;
    private final wlf<y> c;
    private final wlf<bxd> d;
    private final wlf<cqe> e;

    public ey7(yx7 yx7, wlf<g<PlayerState>> wlf, wlf<y> wlf2, wlf<bxd> wlf3, wlf<cqe> wlf4) {
        this.a = yx7;
        this.b = wlf;
        this.c = wlf2;
        this.d = wlf3;
        this.e = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        yx7 yx7 = this.a;
        g<PlayerState> gVar = this.b.get();
        y yVar = this.c.get();
        bxd bxd = this.d.get();
        cqe cqe = this.e.get();
        yx7.getClass();
        h.e(gVar, "playerStateFlowable");
        h.e(yVar, "scheduler");
        h.e(bxd, "playerApis");
        h.e(cqe, "clock");
        return new q(bxd, gVar, yVar, cqe);
    }
}
