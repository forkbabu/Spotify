package defpackage;

import com.spotify.player.options.d;
import com.spotify.player.stateful.q;
import kotlin.jvm.internal.h;

/* renamed from: by7  reason: default package */
public final class by7 implements fjf<d> {
    private final yx7 a;
    private final wlf<q> b;

    public by7(yx7 yx7, wlf<q> wlf) {
        this.a = yx7;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        yx7 yx7 = this.a;
        q qVar = this.b.get();
        yx7.getClass();
        h.e(qVar, "statefulPlayerApis");
        d b2 = qVar.b();
        h.d(b2, "statefulPlayerApis.options()");
        return b2;
    }
}
