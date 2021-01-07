package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.player.stateful.q;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: cy7  reason: default package */
public final class cy7 implements fjf<g<PlayerState>> {
    private final yx7 a;
    private final wlf<q> b;

    public cy7(yx7 yx7, wlf<q> wlf) {
        this.a = yx7;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        yx7 yx7 = this.a;
        q qVar = this.b.get();
        yx7.getClass();
        h.e(qVar, "statefulPlayerApisProvider");
        g<PlayerState> C = qVar.c().C(xx7.a);
        h.d(C, "statefulPlayerApisProvid… { it.track().isPresent }");
        return C;
    }
}
