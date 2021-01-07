package defpackage;

import defpackage.kqc;

/* renamed from: ew3  reason: default package */
public final class ew3 implements fjf<dw3> {
    private final wlf<kqc.a> a;

    public ew3(wlf<kqc.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dw3(this.a.get());
    }
}
