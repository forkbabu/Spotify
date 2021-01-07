package defpackage;

import defpackage.uy5;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: lz5  reason: default package */
public final class lz5 implements fjf<List<uy5.a>> {
    private final wlf<vy5> a;
    private final wlf<zy5> b;
    private final wlf<dz5> c;
    private final wlf<hz5> d;
    private final wlf<rz5> e;

    public lz5(wlf<vy5> wlf, wlf<zy5> wlf2, wlf<dz5> wlf3, wlf<hz5> wlf4, wlf<rz5> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        vy5 vy5 = this.a.get();
        zy5 zy5 = this.b.get();
        dz5 dz5 = this.c.get();
        hz5 hz5 = this.d.get();
        rz5 rz5 = this.e.get();
        h.e(vy5, "adsLogger");
        h.e(zy5, "defaultLogger");
        h.e(dz5, "feedbackLogger");
        h.e(hz5, "freetierLogger");
        h.e(rz5, "podcastLogger");
        return d.u(vy5, zy5, dz5, hz5, rz5);
    }
}
