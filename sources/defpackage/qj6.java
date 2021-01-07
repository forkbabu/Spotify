package defpackage;

import defpackage.ao6;
import defpackage.lh6;
import io.reactivex.y;

/* renamed from: qj6  reason: default package */
public final class qj6 implements fjf<pj6> {
    private final wlf<y> a;
    private final wlf<ao6.a> b;
    private final wlf<lh6.a> c;
    private final wlf<wj6> d;
    private final wlf<ph6> e;

    public qj6(wlf<y> wlf, wlf<ao6.a> wlf2, wlf<lh6.a> wlf3, wlf<wj6> wlf4, wlf<ph6> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pj6(this.a, this.b, this.c, this.d, this.e);
    }
}
