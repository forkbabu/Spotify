package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.player.stateful.q;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: gx7  reason: default package */
public final class gx7 implements fjf<g<PlayerState>> {
    private final dx7 a;
    private final wlf<q> b;

    public gx7(dx7 dx7, wlf<q> wlf) {
        this.a = dx7;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        dx7 dx7 = this.a;
        q qVar = this.b.get();
        dx7.getClass();
        h.e(qVar, "statefulPlayerApisProvider");
        g<PlayerState> C = qVar.c().C(cx7.a);
        h.d(C, "statefulPlayerApisProvid… { it.track().isPresent }");
        return C;
    }
}
