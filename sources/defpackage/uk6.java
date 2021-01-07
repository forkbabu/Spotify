package defpackage;

import defpackage.km6;
import defpackage.rl6;
import defpackage.zt6;

/* renamed from: uk6  reason: default package */
public final class uk6 implements fjf<tk6> {
    private final wlf<ok6> a;
    private final wlf<zt6.a> b;
    private final wlf<km6.a> c;
    private final wlf<rl6.a> d;

    public uk6(wlf<ok6> wlf, wlf<zt6.a> wlf2, wlf<km6.a> wlf3, wlf<rl6.a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tk6(this.a, this.b, this.c, this.d);
    }
}
