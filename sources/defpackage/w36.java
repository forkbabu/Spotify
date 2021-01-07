package defpackage;

import defpackage.ja6;
import defpackage.zt6;

/* renamed from: w36  reason: default package */
public final class w36 implements fjf<v36> {
    private final wlf<x36> a;
    private final wlf<zt6.a> b;
    private final wlf<ja6.a> c;
    private final wlf<ei6> d;

    public w36(wlf<x36> wlf, wlf<zt6.a> wlf2, wlf<ja6.a> wlf3, wlf<ei6> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v36(this.a, this.b, this.c, this.d);
    }
}
