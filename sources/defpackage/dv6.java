package defpackage;

import defpackage.cv6;
import io.reactivex.y;

/* renamed from: dv6  reason: default package */
public final class dv6 implements fjf<cv6> {
    private final wlf<wt6> a;
    private final wlf<cv6.a> b;
    private final wlf<y> c;

    public dv6(wlf<wt6> wlf, wlf<cv6.a> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cv6(this.a.get(), this.b.get(), this.c.get());
    }
}
