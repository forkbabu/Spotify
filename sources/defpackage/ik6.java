package defpackage;

import defpackage.zt6;

/* renamed from: ik6  reason: default package */
public final class ik6 implements fjf<hk6> {
    private final wlf<ck6> a;
    private final wlf<zt6.a> b;

    public ik6(wlf<ck6> wlf, wlf<zt6.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hk6(this.a, this.b);
    }
}
