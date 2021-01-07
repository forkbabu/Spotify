package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.stateful.q;
import kotlin.jvm.internal.h;

/* renamed from: ay7  reason: default package */
public final class ay7 implements fjf<d> {
    private final yx7 a;
    private final wlf<q> b;

    public ay7(yx7 yx7, wlf<q> wlf) {
        this.a = yx7;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        yx7 yx7 = this.a;
        q qVar = this.b.get();
        yx7.getClass();
        h.e(qVar, "statefulPlayerApis");
        d a2 = qVar.a();
        h.d(a2, "statefulPlayerApis.controls()");
        return a2;
    }
}
