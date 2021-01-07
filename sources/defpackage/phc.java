package defpackage;

import defpackage.qhc;

/* renamed from: phc  reason: default package */
public final class phc implements fjf<ohc> {
    private final wlf<qhc.a> a;

    public phc(wlf<qhc.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ohc(this.a.get());
    }
}
