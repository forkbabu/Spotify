package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.stateful.q;
import kotlin.jvm.internal.h;

/* renamed from: fx7  reason: default package */
public final class fx7 implements fjf<d> {
    private final dx7 a;
    private final wlf<q> b;

    public fx7(dx7 dx7, wlf<q> wlf) {
        this.a = dx7;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        dx7 dx7 = this.a;
        q qVar = this.b.get();
        dx7.getClass();
        h.e(qVar, "apisProvider");
        d a2 = qVar.a();
        h.d(a2, "apisProvider.controls()");
        return a2;
    }
}
